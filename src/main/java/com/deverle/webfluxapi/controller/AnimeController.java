package com.deverle.webfluxapi.controller;

import com.deverle.webfluxapi.domain.Anime;
import com.deverle.webfluxapi.repository.AnimeRepository;
import com.deverle.webfluxapi.service.AnimeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
@RequestMapping("animes")
@Slf4j
public class AnimeController {
    private final AnimeService animeService;

    @GetMapping
    public Flux<Anime> listAll() {
        return animeService.findAll();
    }
}