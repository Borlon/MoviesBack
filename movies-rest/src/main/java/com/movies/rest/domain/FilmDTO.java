package com.movies.rest.domain;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class MovieDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3173926033589557664L;

	/**
	 * Identificador del vídeo
	 */
	private Integer id;
	
	/**
	 * Título España
	 */
	private String title;
	
	/**
	 * Titulo Original
	 */
	private String originalTitle;
	
	/**
	 * Fecha de estreno
	 */
	private Date releaseDate;
	
	/**
	 * Género
	 */
	private String genero;
	
	/**
	 * Duración del vídeo
	 */
	private Time duration;
	
	/**
	 * Calificación del contenido
	 */
	private Integer contentRating;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Time getDuration() {
		return duration;
	}

	public void setDuration(Time duration) {
		this.duration = duration;
	}

	public Integer getContentRating() {
		return contentRating;
	}

	public void setContentRating(Integer contentRating) {
		this.contentRating = contentRating;
	}	
}