package io.containerapps.javaruntime.workshop.domain;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface StatisticsRepository extends CrudRepository<Statistics, Long> {
    
    List<Statistics> findAll();
    
    List<Statistics> findByFramework(String framework);
}