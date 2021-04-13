package com.example.h2beerdemo.repository;

import com.example.h2beerdemo.entity.Beer;
import org.springframework.data.repository.CrudRepository;

public interface BeerRepository extends CrudRepository<Beer, Long> {
}
