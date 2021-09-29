package com.hiberus.heroes.service;

import com.hiberus.heroes.dto.HeroDTO;

import java.util.Collection;
import java.util.Optional;

public interface IHeroService {

    Collection<HeroDTO> findAll();

    Optional<HeroDTO> findById(Long id);

    Collection<HeroDTO> findByName(String name);

    void deleteById(Long id);

    HeroDTO save(HeroDTO hero);

}
