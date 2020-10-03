package com.template.template.MyRepository;

import com.template.template.MyModel.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repository extends JpaRepository<Model,Integer> {
    Optional<Model> findByStudent(String Student);
}