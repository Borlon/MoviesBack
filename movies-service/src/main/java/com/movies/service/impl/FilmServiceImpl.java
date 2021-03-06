package com.movies.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.movies.domain.Film;
import com.movies.repository.FilmRepository;
import com.movies.service.IFilmService;

@Service
public class FilmServiceImpl implements IFilmService {
	
	@Inject
	FilmRepository filmRepository;

	@Override
	public List<Film> findAll() {
		return filmRepository.findAll();
	}

	public void save(Film film) {
		filmRepository.save(film);
	}

	@Override
	public Film findOne(Long id) {
		return filmRepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		filmRepository.delete(id);
	}

	@Override
	public List<Film> findByTitle(String title) {
		return filmRepository.findByTitle(title);
	}

}
