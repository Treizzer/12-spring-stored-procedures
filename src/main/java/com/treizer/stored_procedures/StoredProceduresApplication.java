package com.treizer.stored_procedures;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.treizer.stored_procedures.persistence.repository.IPersonRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class StoredProceduresApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StoredProceduresApplication.class, args);
	}

	private final IPersonRepository personRepository;

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		// var persons = this.personRepository.getAllPersons();

		// log.info("\n");
		// persons.forEach(person -> log.info(person.toString()));

		var person = this.personRepository.getPersonById(3L);
		log.info("\n");
		log.info(person.toString());
	}

	// @Bean
	// @Transactional
	// CommandLineRunner init() {
	// return args -> {
	// var persons = this.personRepository.getAllPersons();

	// log.info("\n");
	// persons.forEach(person -> log.info(person.toString()));
	// };
	// }

}
