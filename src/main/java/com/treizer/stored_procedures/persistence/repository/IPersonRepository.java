package com.treizer.stored_procedures.persistence.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.treizer.stored_procedures.persistence.entity.PersonEntity;

@Repository
public interface IPersonRepository extends CrudRepository<PersonEntity, Long> {

    /* Without parameters */

    // Forma 1
    // @Procedure(name = "Person.getAllPersons")
    // List<PersonEntity> getAllPersons();

    // Forma 2
    // @Query(value = "CALL getAllPersons()", nativeQuery = true)
    // List<PersonEntity> getAllPersons();

    // Forma 3
    // @Procedure(name = "getAllPersons")
    // List<PersonEntity> getAllPersons();

    // Forma 4
    // @Procedure
    // List<PersonEntity> getAllPersons();

    /* With parameters */

    // Forma 1
    // @Procedure(name = "Person.getPersonById")
    // PersonEntity getPersonById(@Param("p_id") Long id);

    // Forma 2
    // @Query(value = "CALL getPersonById(:p_id)", nativeQuery = true)
    // PersonEntity getPersonById(@Param("p_id") Long id);

    // Forma 3
    // @Procedure(name = "getPersonById")
    // PersonEntity getPersonById(@Param("p_id") Long id);

    // Forma 4
    @Procedure
    PersonEntity getPersonById(@Param("p_id") Long id);

}
