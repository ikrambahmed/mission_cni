package application.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "ORD_MIS")
@XmlRootElement
public class OrdMis implements Serializable{

	

    @EmbeddedId
    protected OrdMisPK ordMisPK;
  
    @Column(name = "DATDEP_P")
    private Date datdepP;
    

    @Column(name = "DATARR_P")
    private Date datarrP;
    
    @Column(name = "DATDEP_R")
    private Date datdepR;
    
    @Column(name = "DATARR_R")
    private Date datarrR;
    
    @Column(name = "TIMBR")
    private BigDecimal timbr;
    
    @Column(name = "AVANCE")
    private BigDecimal avance;
    


    @Column(name = "ETAT")
    private String etat;
    

    @Column(name = "COD_CAT")
    private String codCat;
    
    @Column(name = "NIV_REM")
    private Short nivRem;
    
  
    @Column(name = "CLASSGRD")
    private String classgrd;
    

    @Column(name = "COD_GRP")
    private String codGrp;

    @Column(name = "COD_FONCTION")
    private String codFonction;
    
    @Column(name = "COD_GRD")
    private String codGrd;
    

    @Column(name = "NUM_PB")
    private String numPb;
    
    @Column(name = "DATE_PAY")
    private Date datePay;
    
    @Column(name = "AVANCE_ACC")
    private BigDecimal avanceAcc;
    
    @Column(name = "DAT_RAP")
    private Date datRap;
    
    @Column(name = "NUM_OP")
    private String numOp;
    
    @Column(name = "TAUX_SPEC")
    private BigDecimal tauxSpec;
    
    @Column(name = "MINISTR")
    private Short ministr;
    
    @Column(name = "AVANCE_OLD")
    private BigDecimal avanceOld;
    
    @Column(name = "OBS_CTRL")
    private String obsCtrl;
    @Column(name = "TYP_AV")
    private String typAv;  
    @Column(name = "RESUME")
    private String resume;
    

    

   /* @JoinColumns({
        @JoinColumn(name = "NUM_MISSION", referencedColumnName = "NUM_MISSION", insertable = false, updatable = false)
        , @JoinColumn(name = "CODE", referencedColumnName = "CODE", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Mission mission;*/
    
   /*@JoinColumn(name = "CIN", referencedColumnName = "CIN")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Missionnaire cin;*/


    
    
    
    
    
    
    
    
    
    
    
    
    
    
	public OrdMis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrdMis(OrdMisPK ordMisPK, Date datdepP, Date datarrP, Date datdepR, Date datarrR, BigDecimal timbr,
			BigDecimal avance, String etat, String codCat, Short nivRem, String classgrd, String codGrp,
			String codFonction, String codGrd, String numPb, Date datePay, BigDecimal avanceAcc, Date datRap,
			String numOp, BigDecimal tauxSpec, Short ministr, BigDecimal avanceOld, String obsCtrl, String resume,
			String typAv) {
		super();
		this.ordMisPK = ordMisPK;
		this.datdepP = datdepP;
		this.datarrP = datarrP;
		this.datdepR = datdepR;
		this.datarrR = datarrR;
		this.timbr = timbr;
		this.avance = avance;
		this.etat = etat;
		this.codCat = codCat;
		this.nivRem = nivRem;
		this.classgrd = classgrd;
		this.codGrp = codGrp;
		this.codFonction = codFonction;
		this.codGrd = codGrd;
		this.numPb = numPb;
		this.datePay = datePay;
		this.avanceAcc = avanceAcc;
		this.datRap = datRap;
		this.numOp = numOp;
		this.tauxSpec = tauxSpec;
		this.ministr = ministr;
		this.avanceOld = avanceOld;
		this.obsCtrl = obsCtrl;
		this.resume = resume;
		this.typAv = typAv;
	}

	public OrdMisPK getOrdMisPK() {
		return ordMisPK;
	}

	public void setOrdMisPK(OrdMisPK ordMisPK) {
		this.ordMisPK = ordMisPK;
	}

	public Date getDatdepP() {
		return datdepP;
	}

	public void setDatdepP(Date datdepP) {
		this.datdepP = datdepP;
	}

	public Date getDatarrP() {
		return datarrP;
	}

	public void setDatarrP(Date datarrP) {
		this.datarrP = datarrP;
	}

	public Date getDatdepR() {
		return datdepR;
	}

	public void setDatdepR(Date datdepR) {
		this.datdepR = datdepR;
	}

	public Date getDatarrR() {
		return datarrR;
	}

	public void setDatarrR(Date datarrR) {
		this.datarrR = datarrR;
	}

	public BigDecimal getTimbr() {
		return timbr;
	}

	public void setTimbr(BigDecimal timbr) {
		this.timbr = timbr;
	}

	public BigDecimal getAvance() {
		return avance;
	}

	public void setAvance(BigDecimal avance) {
		this.avance = avance;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getCodCat() {
		return codCat;
	}

	public void setCodCat(String codCat) {
		this.codCat = codCat;
	}

	public Short getNivRem() {
		return nivRem;
	}

	public void setNivRem(Short nivRem) {
		this.nivRem = nivRem;
	}

	public String getClassgrd() {
		return classgrd;
	}

	public void setClassgrd(String classgrd) {
		this.classgrd = classgrd;
	}

	public String getCodGrp() {
		return codGrp;
	}

	public void setCodGrp(String codGrp) {
		this.codGrp = codGrp;
	}

	public String getCodFonction() {
		return codFonction;
	}

	public void setCodFonction(String codFonction) {
		this.codFonction = codFonction;
	}

	public String getCodGrd() {
		return codGrd;
	}

	public void setCodGrd(String codGrd) {
		this.codGrd = codGrd;
	}

	public String getNumPb() {
		return numPb;
	}

	public void setNumPb(String numPb) {
		this.numPb = numPb;
	}

	public Date getDatePay() {
		return datePay;
	}

	public void setDatePay(Date datePay) {
		this.datePay = datePay;
	}

	public BigDecimal getAvanceAcc() {
		return avanceAcc;
	}

	public void setAvanceAcc(BigDecimal avanceAcc) {
		this.avanceAcc = avanceAcc;
	}

	public Date getDatRap() {
		return datRap;
	}

	public void setDatRap(Date datRap) {
		this.datRap = datRap;
	}

	public String getNumOp() {
		return numOp;
	}

	public void setNumOp(String numOp) {
		this.numOp = numOp;
	}

	public BigDecimal getTauxSpec() {
		return tauxSpec;
	}

	public void setTauxSpec(BigDecimal tauxSpec) {
		this.tauxSpec = tauxSpec;
	}

	public Short getMinistr() {
		return ministr;
	}

	public void setMinistr(Short ministr) {
		this.ministr = ministr;
	}

	public BigDecimal getAvanceOld() {
		return avanceOld;
	}

	public void setAvanceOld(BigDecimal avanceOld) {
		this.avanceOld = avanceOld;
	}

	public String getObsCtrl() {
		return obsCtrl;
	}

	public void setObsCtrl(String obsCtrl) {
		this.obsCtrl = obsCtrl;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getTypAv() {
		return typAv;
	}

	public void setTypAv(String typAv) {
		this.typAv = typAv;
	}


    
    
    
    
}
