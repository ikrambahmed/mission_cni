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


@Entity
@Table(name = "GROUPE")
@XmlRootElement
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Groupe implements Serializable {
	
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODGRP")
    private String codgrp;
    @Basic(optional = false)
    @Column(name = "LIBGRP")
    private String libgrp;
    @Column(name = "LIBGRPL", length = 60)
    private String libgrpl;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codgrp", fetch = FetchType.LAZY)
    @JsonIgnore
    private Collection<Missionnaire> missionnaireCollection;

	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Groupe(@NotNull String codgrp, @NotNull String libgrp, String libgrpl,
			Collection<Missionnaire> missionnaireCollection) {
		super();
		this.codgrp = codgrp;
		this.libgrp = libgrp;
		this.libgrpl = libgrpl;
		this.missionnaireCollection = missionnaireCollection;
	}

	public String getCodgrp() {
		return codgrp;
	}

	public void setCodgrp(String codgrp) {
		this.codgrp = codgrp;
	}

	public String getLibgrp() {
		return libgrp;
	}

	public void setLibgrp(String libgrp) {
		this.libgrp = libgrp;
	}

	public String getLibgrpl() {
		return libgrpl;
	}

	public void setLibgrpl(String libgrpl) {
		this.libgrpl = libgrpl;
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
		result = prime * result + ((codgrp == null) ? 0 : codgrp.hashCode());
		result = prime * result + ((libgrp == null) ? 0 : libgrp.hashCode());
		result = prime * result + ((libgrpl == null) ? 0 : libgrpl.hashCode());
		result = prime * result + ((missionnaireCollection == null) ? 0 : missionnaireCollection.hashCode());
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
		Groupe other = (Groupe) obj;
		if (codgrp == null) {
			if (other.codgrp != null)
				return false;
		} else if (!codgrp.equals(other.codgrp))
			return false;
		if (libgrp == null) {
			if (other.libgrp != null)
				return false;
		} else if (!libgrp.equals(other.libgrp))
			return false;
		if (libgrpl == null) {
			if (other.libgrpl != null)
				return false;
		} else if (!libgrpl.equals(other.libgrpl))
			return false;
		if (missionnaireCollection == null) {
			if (other.missionnaireCollection != null)
				return false;
		} else if (!missionnaireCollection.equals(other.missionnaireCollection))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Groupe [codgrp=" + codgrp + ", libgrp=" + libgrp + ", libgrpl=" + libgrpl + ", missionnaireCollection="
				+ missionnaireCollection + "]";
	}

  
    
    
}
