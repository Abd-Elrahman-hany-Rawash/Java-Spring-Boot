package com.RelationDemo.cruddemoRelation.dao;

import com.RelationDemo.cruddemoRelation.entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class AppDAOImp implements AppDAO{
private EntityManager entityManager;

    public AppDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
@Transactional
    @Override
    public void save(Instructor theInstructor) {
        entityManager.persist(theInstructor);

    }

    @Override
    public Instructor findById(int id) {
        Instructor instructor=entityManager.find(Instructor.class,id);
return instructor;
    }
@Transactional
    @Override
    public void deletbyid(int id) {
        Instructor tinstructor=entityManager.find(Instructor.class,id);
        entityManager.remove(tinstructor);


    }
}
