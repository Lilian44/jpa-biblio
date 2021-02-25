package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Emprunt")
public class Emprunt {
	@Id
	private int id;

	@Column(name="DATE_DEBUT")
	private String date_debut;
	
	@Column(name="DATE_FIN")
	private String date_fin;
	
	private int delai;

	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;

	@ManyToMany
	@JoinTable(name = "compo",

			joinColumns = @JoinColumn(name = "id_emp", referencedColumnName = "id"),

			inverseJoinColumns = @JoinColumn(name = "id_liv", referencedColumnName = "id"))

	List<Livre> livres ;

	public Emprunt() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}

	public String getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}


}
