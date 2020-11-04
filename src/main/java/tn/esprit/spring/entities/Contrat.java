package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Contrat implements Serializable {
	
	private static final long serialVersionUID = 6191889143079517027L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reference;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	private String typeContrat;
	
	
	private int telephone;
	
	@OneToOne
	private Employe employe;

	private int salaire;

	public Contrat() {
		super();
	}
	
	
	
	public Contrat(int reference, Date dateDebut, String typeContrat, int telephone, int salaire) {
		super();
		this.reference = reference;
		this.dateDebut = dateDebut;
		this.typeContrat = typeContrat;
		this.telephone = telephone;
		this.salaire = salaire;
	}



	public Contrat(Date dateDebut, String typeContrat, int salaire) {
		this.dateDebut = dateDebut;
		this.typeContrat = typeContrat;
		this.salaire = salaire;
	}



	public int getReference() {
		return reference;
	}



	public void setReference(int reference) {
		this.reference = reference;
	}



	public Date getDateDebut() {
		return dateDebut;
	}



	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}



	public String getTypeContrat() {
		return typeContrat;
	}



	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}



	public int getTelephone() {
		return telephone;
	}



	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}



	public Employe getEmploye() {
		return employe;
	}



	public void setEmploye(Employe employe) {
		this.employe = employe;
	}



	public int getSalaire() {
		return salaire;
	}



	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

	
	
}
