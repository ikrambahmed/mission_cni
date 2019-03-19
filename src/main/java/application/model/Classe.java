package application.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * The persistent class for the CLASSE database table.
 * 
 */
@Entity
@Table(name = "CLASSE")
@XmlRootElement
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Classe implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLASSGRD", nullable = false, length = 1)
    
    private String classgrd;
    @Basic(optional = false)
    @NotNull

    @Column(name = "LIBCLASSGRDA", nullable = false, length = 30)
    private String libclassgrda;

    @Column(name = "LIBCLASSGRDL", length = 30)
    private String libclassgrdl;
   
    @OneToMany(mappedBy = "classgrd", fetch = FetchType.LAZY)
    @JsonIgnore
    private Collection<Missionnaire> missionnaireCollection;

    
    
	
	//bi-directional many-to-one association to Missionaire
	/*@OneToMany(mappedBy="classgrd")
	@JsonIgnore
	private List<Missionnaire> missionaires;*/
		
	public Classe() {
		super() ; 
	}
	
	
    @XmlTransient
	public Collection<Missionnaire> getMissionnaireCollection() {
		return missionnaireCollection;
	}



	public void setMissionnaireCollection(Collection<Missionnaire> missionnaireCollection) {
		this.missionnaireCollection = missionnaireCollection;
	}



	public String getClassgrd() {
		return classgrd;
	}

	public void setClassgrd(String classgrd) {
		this.classgrd = classgrd;
	}

	public String getLibclassgrda() {
		return libclassgrda;
	}

	public void setLibclassgrda(String libclassgrda) {
		this.libclassgrda = libclassgrda;
	}

	public String getLibclassgrdl() {
		return libclassgrdl;
	}

	public void setLibclassgrdl(String libclassgrdl) {
		this.libclassgrdl = libclassgrdl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classgrd == null) ? 0 : classgrd.hashCode());
		result = prime * result + ((libclassgrda == null) ? 0 : libclassgrda.hashCode());
		result = prime * result + ((libclassgrdl == null) ? 0 : libclassgrdl.hashCode());
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
		Classe other = (Classe) obj;
		if (classgrd == null) {
			if (other.classgrd != null)
				return false;
		} else if (!classgrd.equals(other.classgrd))
			return false;
		if (libclassgrda == null) {
			if (other.libclassgrda != null)
				return false;
		} else if (!libclassgrda.equals(other.libclassgrda))
			return false;
		if (libclassgrdl == null) {
			if (other.libclassgrdl != null)
				return false;
		} else if (!libclassgrdl.equals(other.libclassgrdl))
			return false;
		return true;
	}

	/*public Collection<Missionnaire> getMissionnaireCollection() {
		return missionnaireCollection;
	}

	public void setMissionnaireCollection(Collection<Missionnaire> missionnaireCollection) {
		this.missionnaireCollection = missionnaireCollection;
	}
*/
	/*public List<Missionnaire> getMissionaires() {
		return missionaires;
	}

	public void setMissionaires(List<Missionnaire> missionaires) {
		this.missionaires = missionaires;
	}*/

	
	
	
}