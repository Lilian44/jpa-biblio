package fr.diginamic;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Livre")

public class Livre {

	@Id
	private Integer id;

	@ManyToMany
	@JoinTable(name = "compo",

			joinColumns = @JoinColumn(name = "id_liv", referencedColumnName = "id"),

			inverseJoinColumns = @JoinColumn(name = "id_emp", referencedColumnName = "id"))

	private List<Emprunt> emprunt;

	@Column(name = "TITRE")
	private String titre;
	
	@Column(name = "AUTEUR")
	private String auteur;

	public Livre() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}
