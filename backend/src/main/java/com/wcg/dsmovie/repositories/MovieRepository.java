package com.wcg.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wcg.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}