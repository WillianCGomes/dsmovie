package com.wcg.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcg.dsmovie.entities.Score;
import com.wcg.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}