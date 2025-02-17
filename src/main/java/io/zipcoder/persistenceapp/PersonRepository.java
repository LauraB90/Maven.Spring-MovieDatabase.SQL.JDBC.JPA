package io.zipcoder.persistenceapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findAllByFirstName(String firstName);
    List<Person> findAllByLastName(String lastName);
    List<Person> findAllByBirthday(Date birthday);
    List<Person> findAllByMobile(String mobile);
    List<Person> findAllByHomeId(Long homeId);

}

