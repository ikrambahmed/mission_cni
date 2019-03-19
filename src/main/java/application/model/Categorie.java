package application.model;


import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the CATEGORIE database table.
 * 
 */
@Entity
@Table(name="categorie")
public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COD_CAT")
	private String codeCat;
	@Column(name="LIB_CATA")
	private String libCatAr;

	@Column(name="LIB_CATL")
	private String libCatFr;
	
	
	//bi-directional many-to-one association to Missionaire
	@OneToMany(mappedBy="codCat")
	@JsonIgnore
	private List<Missionnaire> missionaires;
	
	public Categorie() {
	}

	

	

	public String getCodeCat() {
		return codeCat;
	}





	public void setCodeCat(String codeCat) {
		this.codeCat = codeCat;
	}





	public String getLibCatAr() {
		return this.libCatAr;
	}

	public void setLibCatAr(String libCatAr) {
		this.libCatAr = libCatAr;
	}

	public String getLibCatFr() {
		return this.libCatFr;
	}

	public void setLibCatFr(String libCatFr) {
		this.libCatFr = libCatFr;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeCat == null) ? 0 : codeCat.hashCode());
		result = prime * result + ((libCatAr == null) ? 0 : libCatAr.hashCode());
		result = prime * result + ((libCatFr == null) ? 0 : libCatFr.hashCode());
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
		Categorie other = (Categorie) obj;
		if (codeCat == null) {
			if (other.codeCat != null)
				return false;
		} else if (!codeCat.equals(other.codeCat))
			return false;
		if (libCatAr == null) {
			if (other.libCatAr != null)
				return false;
		} else if (!libCatAr.equals(other.libCatAr))
			return false;
		if (libCatFr == null) {
			if (other.libCatFr != null)
				return false;
		} else if (!libCatFr.equals(other.libCatFr))
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "Categorie [codeCat=" + codeCat + ", libCatAr=" + libCatAr + ", libCatFr=" + libCatFr + "]";
	}




	public List<Missionnaire> getMissionaires() {
		return missionaires;
	}





	public void setMissionaires(List<Missionnaire> missionaires) {
		this.missionaires = missionaires;
	}





	public Categorie(String codeCat, String libCatAr, String libCatFr, List<Missionnaire> missionaires) {
		super();
		this.codeCat = codeCat;
		this.libCatAr = libCatAr;
		this.libCatFr = libCatFr;
		this.missionaires = missionaires;
	}
	

	
}