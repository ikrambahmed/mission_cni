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
import javax.persistence.MapsId;
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
public class Grade implements Serializable {
    private static final long serialVersionUID = 1L;
   
   /*@EmbeddedId
    private GradePK gradePK;*/
    @Id
    @Column(name = "COD_GRD")
    private String codGrd;
  
    
    @Column(name = "LIB_GRDA")
    private String libGrda;
    @Column(name = "LIB_GRDL")
    private String libGrdl;
    

	@MapsId("code")
    @JoinColumn(name = "CODE", referencedColumnName = "CODE", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private DeptGen deptGen;

	
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "graade")
	private Collection<Missionnaire> missionnaire;
	
    
	
    @JsonIgnore
	public Collection<Missionnaire> getMissionnaire() {
	return missionnaire;
}


public void setMissionnaire(Collection<Missionnaire> missionnaire) {
	this.missionnaire = missionnaire;
}


	

public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}




public Grade(GradePK gradePK, String libGrda, String libGrdl) {
	super();
	//this.gradePK = gradePK;
	this.libGrda = libGrda;
	this.libGrdl = libGrdl;
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




public static long getSerialversionuid() {
	return serialVersionUID;
}




public DeptGen getDeptGen() {
	return deptGen;
}




public void setDeptGen(DeptGen deptGen) {
	this.deptGen = deptGen;
}


public String getCodGrd() {
	return codGrd;
}


public void setCodGrd(String codGrd) {
	this.codGrd = codGrd;
}

}
