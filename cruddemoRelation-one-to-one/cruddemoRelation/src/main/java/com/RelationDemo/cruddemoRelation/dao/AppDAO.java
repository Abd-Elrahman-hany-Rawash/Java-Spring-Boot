package com.RelationDemo.cruddemoRelation.dao;

import com.RelationDemo.cruddemoRelation.entity.Instructor;
import org.springframework.stereotype.Repository;

@Repository
public interface AppDAO {

     void save ( Instructor theInstructor);
     Instructor findById(int id);
     void deletbyid (int id);
}
