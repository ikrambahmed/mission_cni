package application.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

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
    
  
    @Column(name = "LIB_A")
    private String libA;
    
    @Column(name = "LIB_L")
    private String libL;
    

    @Column(name = "TYP_DEPT")
    private String typDept;

    @Column(name = "CPT_MISSION")
    private short cptMission;
    
    @Column(name = "CPT_NBP")
    private Integer cptNbp;
    
    @Column(name = "CPT_NOP")
    private Integer cptNop;
    
    
    @Column(name = "COD_COMM")
    private String codComm;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deptGen")
    @JsonIgnore
    private Collection<Fonction> fonctionCollection;

        
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deptGen")
    @JsonIgnore
    private Collection<Grade> gradeCollection;
    


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "code")
    @JsonIgnore
    private Collection<Missionnaire> missionnaireCollection;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deptGen")
    @JsonIgnore
    private Collection<Mission> missionCollection;
    
    
  
    public Collection<Mission> getMissionCollection() {
		return missionCollection;
	}

	public void setMissionCollection(Collection<Mission> missionCollection) {
		this.missionCollection = missionCollection;
	}

	@JsonIgnore
    public Collection<Missionnaire> getMissionnaireCollection() {
		return missionnaireCollection;
	}

	public void setMissionnaireCollection(Collection<Missionnaire> missionnaireCollection) {
		this.missionnaireCollection = missionnaireCollection;
	}

	@JsonIgnore
    public Collection<Grade> getGradeCollection() {
		return gradeCollection;
	}

	public void setGradeCollection(Collection<Grade> gradeCollection) {
		this.gradeCollection = gradeCollection;
	}

	@JsonIgnore
	public Collection<Fonction> getFonctionCollection() {
		return fonctionCollection;
	}

	public void setFonctionCollection(Collection<Fonction> fonctionCollection) {
		this.fonctionCollection = fonctionCollection;
	}

	public DeptGen() {
		super() ; 
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public DeptGen(String code, String libA, String libL, String typDept, short cptMission, Integer cptNbp,
			Integer cptNop, String codComm) {
		super();
		this.code = code;
		this.libA = libA;
		this.libL = libL;
		this.typDept = typDept;
		this.cptMission = cptMission;
		this.cptNbp = cptNbp;
		this.cptNop = cptNop;
		this.codComm = codComm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codComm == null) ? 0 : codComm.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + cptMission;
		result = prime * result + ((cptNbp == null) ? 0 : cptNbp.hashCode());
		result = prime * result + ((cptNop == null) ? 0 : cptNop.hashCode());
		result = prime * result + ((fonctionCollection == null) ? 0 : fonctionCollection.hashCode());
		result = prime * result + ((gradeCollection == null) ? 0 : gradeCollection.hashCode());
		result = prime * result + ((libA == null) ? 0 : libA.hashCode());
		result = prime * result + ((libL == null) ? 0 : libL.hashCode());
		result = prime * result + ((missionnaireCollection == null) ? 0 : missionnaireCollection.hashCode());
		result = prime * result + ((typDept == null) ? 0 : typDept.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeptGen other = (DeptGen) obj;
		if (codComm == null) {
			if (other.codComm != null)
				return false;
		} else if (!codComm.equals(other.codComm))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (cptMission != other.cptMission)
			return false;
		if (cptNbp == null) {
			if (other.cptNbp != null)
				return false;
		} else if (!cptNbp.equals(other.cptNbp))
			return false;
		if (cptNop == null) {
			if (other.cptNop != null)
				return false;
		} else if (!cptNop.equals(other.cptNop))
			return false;
		if (fonctionCollection == null) {
			if (other.fonctionCollection != null)
				return false;
		} else if (!fonctionCollection.equals(other.fonctionCollection))
			return false;
		if (gradeCollection == null) {
			if (other.gradeCollection != null)
				return false;
		} else if (!gradeCollection.equals(other.gradeCollection))
			return false;
		if (libA == null) {
			if (other.libA != null)
				return false;
		} else if (!libA.equals(other.libA))
			return false;
		if (libL == null) {
			if (other.libL != null)
				return false;
		} else if (!libL.equals(other.libL))
			return false;
		if (missionnaireCollection == null) {
			if (other.missionnaireCollection != null)
				return false;
		} else if (!missionnaireCollection.equals(other.missionnaireCollection))
			return false;
		if (typDept == null) {
			if (other.typDept != null)
				return false;
		} else if (!typDept.equals(other.typDept))
			return false;
		return true;
	}


    
 


	
    
    
}
