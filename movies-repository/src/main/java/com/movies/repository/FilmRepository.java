package com.movies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.domain.Film;

public interface FilmRepository extends JpaRepository<Film, Long> {
	  public List<Film> findByTitle(String title);
}
