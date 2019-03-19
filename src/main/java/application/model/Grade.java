package application.model;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "GRADE")
@XmlRootElement
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Grade implements Serializable {
    private static final long serialVersionUID = 1L;
   
    @EmbeddedId
    private GradePK gradePK;
    
    @Basic(optional = false)
    @Column(name = "LIB_GRDA", nullable = false, length = 120)
    private String libGrda;
    @Column(name = "LIB_GRDL", length = 120)
    private String libGrdl;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grade", fetch = FetchType.LAZY)
    @JsonIgnore
    private Collection<Missionnaire> missionnaireCollection;
    
    
	@JoinColumn(name="CODE", nullable = false , insertable=false , updatable=false)
	@ManyToOne(optional = false)
    private DeptGen deptGen;
	


	public DeptGen getDeptGen() {
		return deptGen;
	}


	public void setDeptGen(DeptGen deptGen) {
		this.deptGen = deptGen;
	}


	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Grade(GradePK gradePK, @NotNull String libGrda, String libGrdl,
			Collection<Missionnaire> missionnaireCollection, DeptGen deptGen) {
		super();
		this.gradePK = gradePK;
		this.libGrda = libGrda;
		this.libGrdl = libGrdl;
		this.missionnaireCollection = missionnaireCollection;
		//this.deptGen = deptGen;
	}


	public GradePK getGradePK() {
		return gradePK;
	}


	public void setGradePK(GradePK gradePK) {
		this.gradePK = gradePK;
	}


	public String getLibGrda() {
		return libGrda;
	}


	public void setLibGrda(String libGrda) {
		this.libGrda = libGrda;
	}


	public String getLibGrdl() {
		return libGrdl;
	}


	public void setLibGrdl(String libGrdl) {
		this.libGrdl = libGrdl;
	}

  @XmlTransient
	public Collection<Missionnaire> getMissionnaireCollection() {
		return missionnaireCollection;
	}


	public void setMissionnaireCollection(Collection<Missionnaire> missionnaireCollection) {
		this.missionnaireCollection = missionnaireCollection;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gradePK == null) ? 0 : gradePK.hashCode());
		result = prime * result + ((libGrda == null) ? 0 : libGrda.hashCode());
		result = prime * result + ((libGrdl == null) ? 0 : libGrdl.hashCode());
		//result = prime * result + ((missionnaireCollection == null) ? 0 : missionnaireCollection.hashCode());
		return result;
	}


	
    
    
}
