package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the photo database table.
 * 
 */
@Entity
@NamedQuery(name="Photo.findAll", query="SELECT p FROM Photo p")
public class Photo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cheminfichier;

	private Timestamp datecreation;

	private String description;

	@Id
	private Integer id;

	private Integer publieur;

	private Boolean publique;

	private Integer theme;

	private String titre;

	public Photo() {
	}

	public String getCheminfichier() {
		return this.cheminfichier;
	}

	public void setCheminfichier(String cheminfichier) {
		this.cheminfichier = cheminfichier;
	}

	public Timestamp getDatecreation() {
		return this.datecreation;
	}

	public void setDatecreation(Timestamp datecreation) {
		this.datecreation = datecreation;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPublieur() {
		return this.publieur;
	}

	public void setPublieur(Integer publieur) {
		this.publieur = publieur;
	}

	public Boolean getPublique() {
		return this.publique;
	}

	public void setPublique(Boolean publique) {
		this.publique = publique;
	}

	public Integer getTheme() {
		return this.theme;
	}

	public void setTheme(Integer theme) {
		this.theme = theme;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

}