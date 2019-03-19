package application.model;

	import java.io.Serializable;
	import javax.persistence.Basic;
	import javax.persistence.Column;
	import javax.persistence.Embeddable;
	import javax.validation.constraints.NotNull;
	import javax.validation.constraints.Size;

	@Embeddable
	public class GradePK implements Serializable {

	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Basic(optional = false)
	    @Column(name = "CODE")
	    private String code;
	   
	    @Basic(optional = false)
	    @Column(name = "COD_GRD")
	    private String codGrd;

	    
	    public GradePK() {
	    }

	    public GradePK(String code, String codGrd) {
	        this.code = code;
	        this.codGrd = codGrd;
	    }

	    public String getCode() {
	        return code;
	    }

	    public void setCode(String code) {
	        this.code = code;
	    }

	    public String getCodGrd() {
	        return codGrd;
	    }

	    public void setCodGrd(String codGrd) {
	        this.codGrd = codGrd;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 0;
	        hash += (code != null ? code.hashCode() : 0);
	        hash += (codGrd != null ? codGrd.hashCode() : 0);
	        return hash;
	    }

	    @Override
	    public boolean equals(Object object) {
	        // TODO: Warning - this method won't work in the case the id fields are not set
	        if (!(object instanceof GradePK)) {
	            return false;
	        }
	        GradePK other = (GradePK) object;
	        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
	            return false;
	        }
	        if ((this.codGrd == null && other.codGrd != null) || (this.codGrd != null && !this.codGrd.equals(other.codGrd))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "entities.GradePK[ code=" + code + ", codGrd=" + codGrd + " ]";
	    }
	    
	}
