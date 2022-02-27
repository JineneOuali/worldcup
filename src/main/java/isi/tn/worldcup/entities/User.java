package isi.tn.worldcup.entities;

import java.io.Serializable;
//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;

//import com.fasterxml.jackson.annotation.JsonIgnore;

//import isi.tn.entities.Project;

@Entity
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="userid")
	private Long id;
	private String email;
	private String pwd;
	private String fname;
	private String lname;
	
	
	public User() {
		super();
	}
	
	public User(Long id, String email, String pwd, String fname, String lname) {
		super();
		this.id = id;
		this.email = email;
		this.pwd = pwd;
		this.fname = fname;
		this.lname = lname;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", pwd=" + pwd + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	

}
