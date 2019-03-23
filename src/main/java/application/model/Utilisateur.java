package application.model;


import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class Utilisateur {
	
	@Id
	private String username;
	private String nom ; 
	private String prenom ; 
	
	private String password;
	
	private boolean enable;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="USERS_ROLES",
	joinColumns={@JoinColumn(name="USER_ID")},
	inverseJoinColumns={@JoinColumn(name="ROLE_ID")})
	private List<Role> roles;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_stract")
	private Collection <DeptGen> deptGenCollection ; 
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Utilisateur other = (Utilisateur) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	public Utilisateur(String username, String password, boolean enable) {
		super();
		this.username = username;
		this.password = password;
		this.enable = enable;
	}

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	
	public Collection<DeptGen> getDeptGenCollection() {
		return deptGenCollection;
	}

	public void setDeptGenCollection(Collection<DeptGen> deptGenCollection) {
		this.deptGenCollection = deptGenCollection;
	}
	
	
	
	
}
