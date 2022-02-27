package isi.tn.worldcup.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Billet implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	@Column(name="billetid")  
	private Long id;
	private String eventTime;
	private String eventSpace;
	private String eventPrice;
	
	
	public Billet() {
		super();
	}
	public Long getId() {
		return id;
	}
	

	public Billet(Long id, String eventTime, String eventSpace, String eventPrice) {
		super();
		this.id = id;
		this.eventTime = eventTime;
		this.eventSpace = eventSpace;
		this.eventPrice = eventPrice;
	
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String geteventTime() {
		return eventTime;
	}
	public void seteventTime(String eventTime) {
		this.eventTime = eventTime;
	}
	public String geteventSpace() {
		return eventSpace;
	}
	public void seteventSpace(String eventSpace) {
		this.eventSpace = eventSpace;
	}
	public String geteventPrice() {
		return eventPrice;
	}
	public void seteventPrice(String eventPrice) {
		this.eventPrice = eventPrice;
	}
	@Override
	public String toString() {
		return "Billet [id=" + id + ", eventTime=" + eventTime + ", eventSpace=" + eventSpace + ", eventPrice=" + eventPrice + "]";
	}
	
	
	

}