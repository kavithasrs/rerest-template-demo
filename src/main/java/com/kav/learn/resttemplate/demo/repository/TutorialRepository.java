package com.kav.learn.resttemplate.demo.repository;

import com.kav.learn.resttemplate.demo.entities.Tutorial;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface TutorialRepository extends CassandraRepository<Tutorial, UUID> {
}
