package com.example.skistation.repository;

import com.example.skistation.Entity.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CourseRep extends CrudRepository<Course,Long> {
    /* Méthode avec SQL :
    - il ya plusieurs serveur SQL et chaque server a son proprre language donc il faut changer la requete du querry par exemple PostGresql et Oracle etc....
     */
    @Query(value = "select " +
            "FROM course c " +
            "JOIN moniteur_courses mc on c.num_cours=mc.courses_num_cours " +
            "JOIN moniteur m ON m.num_moniteur=mc.moniteur_num_moniteur " +
            "WHERE m.nomm = :name ",nativeQuery = true)
 List<Course> getCourseByMoniteurSql(@Param("name") String name);
    //Méthode avec JPQL
    @Query(value = "select c " +
            "FROM Course c " +
            "JOIN Moniteur m on c member m.courses " +
            "WHERE m.nomM = :name ")
    List<Course> getCourseByMoniteurJPql(@Param("name") String name);

}
