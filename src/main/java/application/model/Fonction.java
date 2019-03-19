package application.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "FONCTION")
@XmlRootElement
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Fonction implements Serializable {
    private static final long serialVersionUID = 1L; 
   
    @EmbeddedId
    protected FonctionPK fonctionPK;
    
	
	@Basic(optional = false)
    @NotNull
    @Column(name = "LIB_FONCA", nullable = false, length = 120)
    private String libFonca;

    @Column(name = "LIB_FONCL", length = 120)
    private String libFoncl;
    
    public Collection<Missionnaire> getMissionnairecollection() {
		return missionnairecollection;
	}

	public void setMissionnairecollection(Collection<Missionnaire> missionnairecollection) {
		this.missionnairecollection = missionnairecollection;
	}

	@Basic(optional = false)
    @NotNull
    @Column(name = "TYP_FONC", nullable = false, length = 1)
    private String typFonc;
	
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "fonction", fetch = FetchType.LAZY)
   @JsonIgnore
   private Collection<Missionnaire> missionnairecollection;

    
    
	@JoinColumn(name="CODE", nullable = false , insertable=false , updatable=false)
	@ManyToOne
    private DeptGen deptGen;
	
	
	

	

	/*public Collection<Missionnaire> getMissionnairecollection() {
		return missionnairecollection;
	}

	public void setMissionnairecollection(Collection<Missionnaire> missionnairecollection) {
		this.missionnairecollection = missionnairecollection;
	}*/

	public DeptGen getDeptGen() {
		return deptGen;
	}

	public void setDeptGen(DeptGen deptGen) {
		this.deptGen = deptGen;
	}

	public Fonction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fonction(FonctionPK fonctionPK, @NotNull String libFonca, String libFoncl, @NotNull String typFonc,
			Collection<Missionnaire> missionnaireCollection, DeptGen deptGen) {
		super();
		this.fonctionPK = fonctionPK;
		this.libFonca = libFonca;
		this.libFoncl = libFoncl;
		this.typFonc = typFonc;
		this.missionnairecollection = missionnaireCollection;
		//this.deptGen = deptGen;
	}

	public FonctionPK getFonctionPK() {
		return fonctionPK;
	}

	public void setFonctionPK(FonctionPK fonctionPK) {
		this.fonctionPK = fonctionPK;
	}

	public String getLibFonca() {
		return libFonca;
	}

	public void setLibFonca(String libFonca) {
		this.libFonca = libFonca;
	}

	public String getLibFoncl() {
		return libFoncl;
	}

	public void setLibFoncl(String libFoncl) {
		this.libFoncl = libFoncl;
	}

	public String getTypFonc() {
		return typFonc;
	}

	public void setTypFonc(String typFonc) {
		this.typFonc = typFonc;
	}
    
	   @JsonIgnore
	public Collection<Missionnaire> getMissionnaireCollection() {
		return missionnairecollection;
	}
	   
	   
	public void setMissionnaireCollection(Collection<Missionnaire> missionnaireCollection) {
		this.missionnairecollection = missionnaireCollection;
	}

	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fonctionPK == null) ? 0 : fonctionPK.hashCode());
		result = prime * result + ((libFonca == null) ? 0 : libFonca.hashCode());
		result = prime * result + ((libFoncl == null) ? 0 : libFoncl.hashCode());
	//	result = prime * result + ((missionnairecollection == null) ? 0 : missionnairecollection.hashCode());
		result = prime * result + ((typFonc == null) ? 0 : typFonc.hashCode());
		return result;
	}

	
   
	
}
