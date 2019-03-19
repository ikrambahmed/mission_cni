package application.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author dell
 */
@Embeddable
public class FonctionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "CODE", nullable = false, length = 6)
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_FONCTION", nullable = false, length = 2)
    private String codFonction;

    public FonctionPK() {
    }

    public FonctionPK(String code, String codFonction) {
        this.code = code;
        this.codFonction = codFonction;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodFonction() {
        return codFonction;
    }

    public void setCodFonction(String codFonction) {
        this.codFonction = codFonction;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        hash += (codFonction != null ? codFonction.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FonctionPK)) {
            return false;
        }
        FonctionPK other = (FonctionPK) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        if ((this.codFonction == null && other.codFonction != null) || (this.codFonction != null && !this.codFonction.equals(other.codFonction))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FonctionPK[ code=" + code + ", codFonction=" + codFonction + " ]";
    }
    
}
