package ma.demo.flyway.repositories;

import ma.demo.flyway.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
