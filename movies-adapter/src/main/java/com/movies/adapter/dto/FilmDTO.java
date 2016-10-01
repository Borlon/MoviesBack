package com.movies.adapter.dto;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class FilmDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3173926033589557664L;

	/**
	 * Identificador del vídeo
	 */
	private Long id;

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
	private String genre;

	/**
	 * Duración del vídeo
	 */
	private Time duration;

	/**
	 * Calificación del contenido
	 */
	private Integer contentRating;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
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