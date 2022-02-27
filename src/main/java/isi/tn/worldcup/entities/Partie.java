package isi.tn.worldcup.entities;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Partie implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="partieid")
	private Long id;
	private String equipe1;
	private String equipe2;
	private String stade;
	private String datePartie;
	
	public Partie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Partie(Long id, String equipe1, String equipe2, String stade, String datePartie) {
		super();
		this.id = id;
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
		this.stade = stade;
		this.datePartie = datePartie;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEquipe1() {
		return equipe1;
	}
	public void setEquipe1(String equipe1) {
		this.equipe1 = equipe1;
	}
	public String getEquipe2() {
		return equipe2;
	}
	public void setEquipe2(String equipe2) {
		this.equipe2 = equipe2;
	}
	public String getStade() {
		return stade;
	}
	public void setStade(String stade) {
		this.stade = stade;
	}
	public String getDatePartie() {
		return datePartie;
	}
	public void setDatePartie(String datePartie) {
		this.datePartie = datePartie;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Partie [id=" + id + ", equipe1=" + equipe1 + ", equipe2=" + equipe2 + ", stade=" + stade
				+ ", datePartie=" + datePartie + "]";
	}
	
	
	

}
