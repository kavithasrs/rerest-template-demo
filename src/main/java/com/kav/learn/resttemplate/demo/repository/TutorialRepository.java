package com.kav.learn.resttemplate.demo.repository;

import com.kav.learn.resttemplate.demo.entities.Tutorial;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;

public interface TutorialRepository extends CassandraRepository<Tutorial, UUID> {

    @AllowFiltering
    List<Tutorial> findByPublishedIsTrue();

    //https://docs.spring.io/spring-data/cassandra/docs/current/reference/html/#cassandra.repositories.queries

    List<Tutorial> findByPublishedAndDescription(boolean published, String description);
}
