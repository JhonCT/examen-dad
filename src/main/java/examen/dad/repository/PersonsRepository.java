package examen.dad.repository;

import examen.dad.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends JpaRepository<Person, Long> {

    @Query(value = "select * from persons where dni = ?1", nativeQuery = true)
    Person getPersonByDni(String dni);
}
