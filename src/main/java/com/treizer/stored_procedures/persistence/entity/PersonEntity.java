package com.treizer.stored_procedures.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "persons")
// @NamedStoredProcedureQuery(name = "Person.getAllPersons", procedureName =
// "getAllPersons", resultClasses = PersonEntity.class)
// @NamedStoredProcedureQuery(name = "Person.getPersonById", procedureName =
// "getPersonById", resultClasses = PersonEntity.class, parameters = {
// @StoredProcedureParameter(mode = ParameterMode.IN, name = "p_id", type =
// Long.class)
// })
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

}
