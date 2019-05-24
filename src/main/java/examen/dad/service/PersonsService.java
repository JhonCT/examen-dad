package examen.dad.service;

import examen.dad.model.Person;
import examen.dad.repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonsService {

    private PersonsRepository personsRepository;

    @Autowired
    public PersonsService(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    public List<Person> getPersons() {
       return personsRepository.findAll();
    }

    public Person getPerson(String dni) {
        return personsRepository.getPersonByDni(dni);
    }
}
