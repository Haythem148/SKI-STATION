package com.example.skistation.repository;

import com.example.skistation.Entity.*;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SkieurRep extends CrudRepository<Skieur,Long> {

    List<Skieur>  findByAbonnementTypeAbonnement(TypeAbonnement typeAbonnement);
 //List<Skieur> findByAbonnementTypeAbonnementAndPistesCouleurAndInscriptionsCourseSupportAndInscriptionsCourseTypeCours();
 List <Skieur> findByAbonnementTypeAbonnementAndInscriptionsCoursesSupportAndInscriptionsCoursesTypeCoursAndPistesCouleur(TypeAbonnement abonnement_typeAbonnement, Support inscriptions_courses_support, TypeCours inscriptions_courses_typeCours, Couleur pistes_couleur);
@Query("select i.skieur " +
        "from Inscription i " +
        "join Moniteur m on i.courses member m.courses " +
        "where m.nomM=:nomMoniteur " +
        "ORDER BY size(i.skieur.pistes)  DESC")
 List<Skieur>findSkieurByNomMoniteurJPQL(@Param("nomMoniteur") String nomMoniteur);

}
