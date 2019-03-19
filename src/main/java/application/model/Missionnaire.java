package application.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;
import org.hibernate.annotations.JoinFormula;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "MISSIONNAIRE")
@XmlRootElement
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Missionnaire implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CIN", nullable = false, length = 20)
    private String cin;
    
    @Size(max = 10)
    @Column(name = "MATRICULE", length = 10)
    private String matricule;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOMA", nullable = false, length = 30)
    private String noma;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PRENA", nullable = false, length = 30)
    private String prena;
    
    @Size(max = 30)
    @Column(name = "NOML", length = 30)
    private String noml;
    
    @Size(max = 30)
    @Column(name = "PRENL", length = 30)
    private String prenl;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NATIONALITEA", nullable = false, length = 30)
    private String nationalitea;
    
    @Size(max = 30)
    @Column(name = "NATIONALITEL", length = 30)
    private String nationalitel;
    
    @Column(name = "RIB")
    private BigInteger rib;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_NAISS", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateNaiss;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "LIEU_NAISSA", nullable = false, length = 60)
    private String lieuNaissa;
    
    @Size(max = 60)
    @Column(name = "LIEU_NAISSL", length = 60)
    private String lieuNaissl;
    
    @Column(name = "DATE_CIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCin;
    
    @Size(max = 30)
    @Column(name = "CIN_DELIVREA", length = 30)
    private String cinDelivrea;
    
    @Size(max = 30)
    @Column(name = "CIN_DELIVREL", length = 30)
    private String cinDelivrel;
    
    @Column(name = "TAUX_SPEC", precision = 7, scale = 3)
    private BigDecimal tauxSpec;
    
    @Column(name = "NIV_REM")
    private Short nivRem;
    
    @Column(name = "MINISTR")
    private Short ministr;

    @Size(max = 3)
    @Column(name = "COD_FCT", length = 3)
    private String codFct;
    
    @JoinColumn(name = "COD_CAT", referencedColumnName = "COD_CAT")
    @ManyToOne(fetch = FetchType.LAZY)
    private Categorie codCat;
    
    @JoinColumn(name = "CLASSGRD", referencedColumnName = "CLASSGRD")
    @ManyToOne(fetch = FetchType.LAZY)
    private Classe classgrd;
    

    @JoinColumn(name = "CODE", referencedColumnName = "CODE")
    @ManyToOne(optional = false)
    private DeptGen codedept;
    
    @JoinColumns({
        @JoinColumn(name = "CODE", referencedColumnName = "CODE", insertable=false, updatable=false)
        , @JoinColumn(name = "COD_FONCTION", referencedColumnName = "COD_FONCTION" ,  nullable = false, insertable=false, updatable=false )})
    @ManyToOne(optional = false)
    private Fonction fonction;
    

  @JoinColumns({
        @JoinColumn(name = "CODE",referencedColumnName = "CODE" ,  insertable=false, updatable=false)
        , @JoinColumn(name = "COD_GRD",referencedColumnName="COD_GRD" ,  insertable=false, updatable=false)})
    @ManyToOne(optional = false)
    private Grade grade;
    
  
  
  
@JoinColumn(name = "CODGRP", referencedColumnName = "CODGRP", nullable = false )
@ManyToOne(optional = false, fetch = FetchType.LAZY)
private Groupe codgrp;


public Missionnaire() {
	super();
	// TODO Auto-generated constructor stub
}




public String getCin() {
	return cin;
}






public void setCin(String cin) {
	this.cin = cin;
}






public String getMatricule() {
	return matricule;
}






public void setMatricule(String matricule) {
	this.matricule = matricule;
}






public String getNoma() {
	return noma;
}






public void setNoma(String noma) {
	this.noma = noma;
}






public String getPrena() {
	return prena;
}






public void setPrena(String prena) {
	this.prena = prena;
}






public String getNoml() {
	return noml;
}






public void setNoml(String noml) {
	this.noml = noml;
}






public String getPrenl() {
	return prenl;
}






public void setPrenl(String prenl) {
	this.prenl = prenl;
}






public String getNationalitea() {
	return nationalitea;
}






public void setNationalitea(String nationalitea) {
	this.nationalitea = nationalitea;
}






public String getNationalitel() {
	return nationalitel;
}






public void setNationalitel(String nationalitel) {
	this.nationalitel = nationalitel;
}






public BigInteger getRib() {
	return rib;
}






public void setRib(BigInteger rib) {
	this.rib = rib;
}






public Date getDateNaiss() {
	return dateNaiss;
}






public void setDateNaiss(Date dateNaiss) {
	this.dateNaiss = dateNaiss;
}






public String getLieuNaissa() {
	return lieuNaissa;
}






public void setLieuNaissa(String lieuNaissa) {
	this.lieuNaissa = lieuNaissa;
}






public String getLieuNaissl() {
	return lieuNaissl;
}






public void setLieuNaissl(String lieuNaissl) {
	this.lieuNaissl = lieuNaissl;
}






public Date getDateCin() {
	return dateCin;
}






public void setDateCin(Date dateCin) {
	this.dateCin = dateCin;
}






public String getCinDelivrea() {
	return cinDelivrea;
}






public void setCinDelivrea(String cinDelivrea) {
	this.cinDelivrea = cinDelivrea;
}






public String getCinDelivrel() {
	return cinDelivrel;
}






public void setCinDelivrel(String cinDelivrel) {
	this.cinDelivrel = cinDelivrel;
}






public BigDecimal getTauxSpec() {
	return tauxSpec;
}






public void setTauxSpec(BigDecimal tauxSpec) {
	this.tauxSpec = tauxSpec;
}






public Short getNivRem() {
	return nivRem;
}






public void setNivRem(Short nivRem) {
	this.nivRem = nivRem;
}






public Short getMinistr() {
	return ministr;
}






public void setMinistr(Short ministr) {
	this.ministr = ministr;
}






public String getCodFct() {
	return codFct;
}






public void setCodFct(String codFct) {
	this.codFct = codFct;
}






public Categorie getCodCat() {
	return codCat;
}






public void setCodCat(Categorie codCat) {
	this.codCat = codCat;
}






public Classe getClassgrd() {
	return classgrd;
}






public void setClassgrd(Classe classgrd) {
	this.classgrd = classgrd;
}






public DeptGen getCodedept() {
	return codedept;
}






public void setCodedept(DeptGen codedept) {
	this.codedept = codedept;
}






public Fonction getFonction() {
	return fonction;
}






public void setFonction(Fonction fonction) {
	this.fonction = fonction;
}






public Grade getGrade() {
	return grade;
}






public void setGrade(Grade grade) {
	this.grade = grade;
}






public Groupe getCodgrp() {
	return codgrp;
}






public void setCodgrp(Groupe codgrp) {
	this.codgrp = codgrp;
}






public static long getSerialversionuid() {
	return serialVersionUID;
}









public Missionnaire(@NotNull @Size(min = 1, max = 20) String cin, @Size(max = 10) String matricule,
		@NotNull @Size(min = 1, max = 30) String noma, @NotNull @Size(min = 1, max = 30) String prena,
		@Size(max = 30) String noml, @Size(max = 30) String prenl,
		@NotNull @Size(min = 1, max = 30) String nationalitea, @Size(max = 30) String nationalitel, BigInteger rib,
		@NotNull Date dateNaiss, @NotNull @Size(min = 1, max = 60) String lieuNaissa, @Size(max = 60) String lieuNaissl,
		Date dateCin, @Size(max = 30) String cinDelivrea, @Size(max = 30) String cinDelivrel, BigDecimal tauxSpec,
		Short nivRem, Short ministr, @Size(max = 3) String codFct, Categorie codCat, Classe classgrd, DeptGen codedept,
		Fonction fonction, Grade grade, Groupe codgrp) {
	super();
	this.cin = cin;
	this.matricule = matricule;
	this.noma = noma;
	this.prena = prena;
	this.noml = noml;
	this.prenl = prenl;
	this.nationalitea = nationalitea;
	this.nationalitel = nationalitel;
	this.rib = rib;
	this.dateNaiss = dateNaiss;
	this.lieuNaissa = lieuNaissa;
	this.lieuNaissl = lieuNaissl;
	this.dateCin = dateCin;
	this.cinDelivrea = cinDelivrea;
	this.cinDelivrel = cinDelivrel;
	this.tauxSpec = tauxSpec;
	this.nivRem = nivRem;
	this.ministr = ministr;
	this.codFct = codFct;
	this.codCat = codCat;
	this.classgrd = classgrd;
	this.codedept = codedept;
	this.fonction = fonction;
	this.grade = grade;
	this.codgrp = codgrp;
}




@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cin == null) ? 0 : cin.hashCode());
	result = prime * result + ((cinDelivrea == null) ? 0 : cinDelivrea.hashCode());
	result = prime * result + ((cinDelivrel == null) ? 0 : cinDelivrel.hashCode());
	result = prime * result + ((classgrd == null) ? 0 : classgrd.hashCode());
	result = prime * result + ((codCat == null) ? 0 : codCat.hashCode());
	result = prime * result + ((codFct == null) ? 0 : codFct.hashCode());
	result = prime * result + ((codedept == null) ? 0 : codedept.hashCode());
	result = prime * result + ((codgrp == null) ? 0 : codgrp.hashCode());
	result = prime * result + ((dateCin == null) ? 0 : dateCin.hashCode());
	result = prime * result + ((dateNaiss == null) ? 0 : dateNaiss.hashCode());
	result = prime * result + ((fonction == null) ? 0 : fonction.hashCode());
	result = prime * result + ((grade == null) ? 0 : grade.hashCode());
	result = prime * result + ((lieuNaissa == null) ? 0 : lieuNaissa.hashCode());
	result = prime * result + ((lieuNaissl == null) ? 0 : lieuNaissl.hashCode());
	result = prime * result + ((matricule == null) ? 0 : matricule.hashCode());
	result = prime * result + ((ministr == null) ? 0 : ministr.hashCode());
	result = prime * result + ((nationalitea == null) ? 0 : nationalitea.hashCode());
	result = prime * result + ((nationalitel == null) ? 0 : nationalitel.hashCode());
	result = prime * result + ((nivRem == null) ? 0 : nivRem.hashCode());
	result = prime * result + ((noma == null) ? 0 : noma.hashCode());
	result = prime * result + ((noml == null) ? 0 : noml.hashCode());
	result = prime * result + ((prena == null) ? 0 : prena.hashCode());
	result = prime * result + ((prenl == null) ? 0 : prenl.hashCode());
	result = prime * result + ((rib == null) ? 0 : rib.hashCode());
	result = prime * result + ((tauxSpec == null) ? 0 : tauxSpec.hashCode());
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
	Missionnaire other = (Missionnaire) obj;
	if (cin == null) {
		if (other.cin != null)
			return false;
	} else if (!cin.equals(other.cin))
		return false;
	if (cinDelivrea == null) {
		if (other.cinDelivrea != null)
			return false;
	} else if (!cinDelivrea.equals(other.cinDelivrea))
		return false;
	if (cinDelivrel == null) {
		if (other.cinDelivrel != null)
			return false;
	} else if (!cinDelivrel.equals(other.cinDelivrel))
		return false;
	if (classgrd == null) {
		if (other.classgrd != null)
			return false;
	} else if (!classgrd.equals(other.classgrd))
		return false;
	if (codCat == null) {
		if (other.codCat != null)
			return false;
	} else if (!codCat.equals(other.codCat))
		return false;
	if (codFct == null) {
		if (other.codFct != null)
			return false;
	} else if (!codFct.equals(other.codFct))
		return false;
	if (codedept == null) {
		if (other.codedept != null)
			return false;
	} else if (!codedept.equals(other.codedept))
		return false;
	if (codgrp == null) {
		if (other.codgrp != null)
			return false;
	} else if (!codgrp.equals(other.codgrp))
		return false;
	if (dateCin == null) {
		if (other.dateCin != null)
			return false;
	} else if (!dateCin.equals(other.dateCin))
		return false;
	if (dateNaiss == null) {
		if (other.dateNaiss != null)
			return false;
	} else if (!dateNaiss.equals(other.dateNaiss))
		return false;
	if (fonction == null) {
		if (other.fonction != null)
			return false;
	} else if (!fonction.equals(other.fonction))
		return false;
	if (grade == null) {
		if (other.grade != null)
			return false;
	} else if (!grade.equals(other.grade))
		return false;
	if (lieuNaissa == null) {
		if (other.lieuNaissa != null)
			return false;
	} else if (!lieuNaissa.equals(other.lieuNaissa))
		return false;
	if (lieuNaissl == null) {
		if (other.lieuNaissl != null)
			return false;
	} else if (!lieuNaissl.equals(other.lieuNaissl))
		return false;
	if (matricule == null) {
		if (other.matricule != null)
			return false;
	} else if (!matricule.equals(other.matricule))
		return false;
	if (ministr == null) {
		if (other.ministr != null)
			return false;
	} else if (!ministr.equals(other.ministr))
		return false;
	if (nationalitea == null) {
		if (other.nationalitea != null)
			return false;
	} else if (!nationalitea.equals(other.nationalitea))
		return false;
	if (nationalitel == null) {
		if (other.nationalitel != null)
			return false;
	} else if (!nationalitel.equals(other.nationalitel))
		return false;
	if (nivRem == null) {
		if (other.nivRem != null)
			return false;
	} else if (!nivRem.equals(other.nivRem))
		return false;
	if (noma == null) {
		if (other.noma != null)
			return false;
	} else if (!noma.equals(other.noma))
		return false;
	if (noml == null) {
		if (other.noml != null)
			return false;
	} else if (!noml.equals(other.noml))
		return false;
	if (prena == null) {
		if (other.prena != null)
			return false;
	} else if (!prena.equals(other.prena))
		return false;
	if (prenl == null) {
		if (other.prenl != null)
			return false;
	} else if (!prenl.equals(other.prenl))
		return false;
	if (rib == null) {
		if (other.rib != null)
			return false;
	} else if (!rib.equals(other.rib))
		return false;
	if (tauxSpec == null) {
		if (other.tauxSpec != null)
			return false;
	} else if (!tauxSpec.equals(other.tauxSpec))
		return false;
	return true;
}






@Override
public String toString() {
	return "Missionnaire [cin=" + cin + ", matricule=" + matricule + ", noma=" + noma + ", prena=" + prena + ", noml="
			+ noml + ", prenl=" + prenl + ", nationalitea=" + nationalitea + ", nationalitel=" + nationalitel + ", rib="
			+ rib + ", dateNaiss=" + dateNaiss + ", lieuNaissa=" + lieuNaissa + ", lieuNaissl=" + lieuNaissl
			+ ", dateCin=" + dateCin + ", cinDelivrea=" + cinDelivrea + ", cinDelivrel=" + cinDelivrel + ", tauxSpec="
			+ tauxSpec + ", nivRem=" + nivRem + ", ministr=" + ministr + ", codFct=" + codFct + ", codCat=" + codCat
			+ ", classgrd=" + classgrd + ", codedept=" + codedept + ", fonction=" + fonction + ", grade=" + grade
			+ ", codgrp=" + codgrp + "]";
}










	
}

