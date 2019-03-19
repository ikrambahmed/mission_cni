package application.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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

/**
 *
 * @author dell
 */
@Entity
@Table(name = "DEPT_GEN")
@XmlRootElement
public class DeptGen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "CODE")
    private String code;
    
    @Basic(optional = false)
    //@NotNull
    @Column(name = "LIB_A", nullable = false, length = 120)
    private String libA;
    
    @Column(name = "LIB_L", length = 120)
    private String libL;
    
    @Basic(optional = false)
    //@NotNull
    @Column(name = "TYP_DEPT", nullable = false, length = 1)
    private String typDept;
    
    @Basic(optional = false)
    //@NotNull
    @Column(name = "CPT_MISSION", nullable = false)
    private short cptMission;
    
    @Column(name = "CPT_NBP")
    private Integer cptNbp;
    
    @Column(name = "CPT_NOP")
    private Integer cptNop;
    
   // @Size(max = 8)
    @Column(name = "COD_COMM", length = 8)
    private String codComm;
    
	public DeptGen() {
		super() ; 
    }

   
   /* @OneToMany(mappedBy = "deptGen", fetch = FetchType.LAZY)
    private Collection<Fonction> fonctionCollection;*/
    
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "codedept", fetch = FetchType.LAZY)
    private Collection<Missionnaire> missionnaireCollection;*/
   
   /* @OneToMany(mappedBy = "deptGen", fetch = FetchType.LAZY)
    private Collection<Grade> gradeCollection;
*/
    
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "codedept", fetch = FetchType.LAZY)
    @JsonIgnore
    private Collection<Missionnaire> missionnairesCollection;
    
    
    
   

    public Collection<Missionnaire> getMissionnairesCollection() {
		return missionnairesCollection;
	}

	public void setMissionnairesCollection(Collection<Missionnaire> missionnairesCollection) {
		this.missionnairesCollection = missionnairesCollection;
	}




    public DeptGen(String code) {
        this.code = code;
    }

    public DeptGen(String code, String libA, String typDept, short cptMission) {
        this.code = code;
        this.libA = libA;
        this.typDept = typDept;
        this.cptMission = cptMission;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibA() {
        return libA;
    }

    public void setLibA(String libA) {
        this.libA = libA;
    }

    public String getLibL() {
        return libL;
    }

    public void setLibL(String libL) {
        this.libL = libL;
    }

    public String getTypDept() {
        return typDept;
    }

    public void setTypDept(String typDept) {
        this.typDept = typDept;
    }

    public short getCptMission() {
        return cptMission;
    }

    public void setCptMission(short cptMission) {
        this.cptMission = cptMission;
    }

    public Integer getCptNbp() {
        return cptNbp;
    }

    public void setCptNbp(Integer cptNbp) {
        this.cptNbp = cptNbp;
    }

    public Integer getCptNop() {
        return cptNop;
    }

    public void setCptNop(Integer cptNop) {
        this.cptNop = cptNop;
    }

    public String getCodComm() {
        return codComm;
    }

    public void setCodComm(String codComm) {
        this.codComm = codComm;
    }


   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeptGen)) {
            return false;
        }
        DeptGen other = (DeptGen) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.DeptGen[ code=" + code + " ]";
    }
  
	
	public DeptGen(@NotNull @Size(min = 1, max = 6) String code, @NotNull @Size(min = 1, max = 120) String libA,
			@Size(max = 120) String libL, @NotNull @Size(min = 1, max = 1) String typDept, @NotNull short cptMission,
			Integer cptNbp, Integer cptNop, @Size(max = 8) String codComm, Collection<Fonction> fonctionCollection,
			Collection<Missionnaire> missionnaireCollection, Collection<Grade> gradeCollection) {
		super();
		this.code = code;
		this.libA = libA;
		this.libL = libL;
		this.typDept = typDept;
		this.cptMission = cptMission;
		this.cptNbp = cptNbp;
		this.cptNop = cptNop;
		this.codComm = codComm;
	//this.fonctionCollection = fonctionCollection;
	this.missionnairesCollection = missionnaireCollection;
	//	this.gradeCollection = gradeCollection;
	}

	
    
    
}
