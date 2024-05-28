package ma.demo.flyway;

import ma.demo.flyway.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayDemoApplication implements CommandLineRunner {
    private PersonRepository personRepository;
    public FlywayDemoApplication(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public static void main(String[] args) {
        SpringApplication.run(FlywayDemoApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        personRepository.findAll()
                .forEach(person -> {
                    System.out.println(person.toString());
                });
    }
}