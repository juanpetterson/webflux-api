package com.deverle.webfluxapi.repository;

import com.deverle.webfluxapi.domain.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {
}
