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

@Entity
@Table(name = "FONCTION")
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
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "TYP_FONC", nullable = false, length = 1)
    private String typFonc;
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fonction", fetch = FetchType.LAZY)
    private Collection<Missionnaire> missionnaireCollection;

	@JoinColumn(name="CODE", nullable = false , insertable=false , updatable=false)
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DeptGen deptGen;

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
		this.missionnaireCollection = missionnaireCollection;
		this.deptGen = deptGen;
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

	public Collection<Missionnaire> getMissionnaireCollection() {
		return missionnaireCollection;
	}

	public void setMissionnaireCollection(Collection<Missionnaire> missionnaireCollection) {
		this.missionnaireCollection = missionnaireCollection;
	}

	public DeptGen getDeptGen() {
		return deptGen;
	}

	public void setDeptGen(DeptGen deptGen) {
		this.deptGen = deptGen;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptGen == null) ? 0 : deptGen.hashCode());
		result = prime * result + ((fonctionPK == null) ? 0 : fonctionPK.hashCode());
		result = prime * result + ((libFonca == null) ? 0 : libFonca.hashCode());
		result = prime * result + ((libFoncl == null) ? 0 : libFoncl.hashCode());
		result = prime * result + ((missionnaireCollection == null) ? 0 : missionnaireCollection.hashCode());
		result = prime * result + ((typFonc == null) ? 0 : typFonc.hashCode());
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
		Fonction other = (Fonction) obj;
		if (deptGen == null) {
			if (other.deptGen != null)
				return false;
		} else if (!deptGen.equals(other.deptGen))
			return false;
		if (fonctionPK == null) {
			if (other.fonctionPK != null)
				return false;
		} else if (!fonctionPK.equals(other.fonctionPK))
			return false;
		if (libFonca == null) {
			if (other.libFonca != null)
				return false;
		} else if (!libFonca.equals(other.libFonca))
			return false;
		if (libFoncl == null) {
			if (other.libFoncl != null)
				return false;
		} else if (!libFoncl.equals(other.libFoncl))
			return false;
		if (missionnaireCollection == null) {
			if (other.missionnaireCollection != null)
				return false;
		} else if (!missionnaireCollection.equals(other.missionnaireCollection))
			return false;
		if (typFonc == null) {
			if (other.typFonc != null)
				return false;
		} else if (!typFonc.equals(other.typFonc))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fonction [fonctionPK=" + fonctionPK + ", libFonca=" + libFonca + ", libFoncl=" + libFoncl + ", typFonc="
				+ typFonc + ", missionnaireCollection=" + missionnaireCollection + ", deptGen=" + deptGen + "]";
	}
    
   
	
}
