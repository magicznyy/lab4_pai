package jd.lab4_pai.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface StudentRepository  extends CrudRepository < Student, Integer> {

    @Override
    Iterable findAll();


    Student findStudentById(Integer id);
}
