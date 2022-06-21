package rayhanasadel.interntrainingassignment.movieHall;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MovieHallConfig {
    @Bean
    CommandLineRunner commandLineRunner(MovieHallRepository repository){
        return args -> {
            MovieHall hall_a = new MovieHall(
                    "Hall-A",
                    50,
                    Boolean.FALSE
            );
            MovieHall hall_b = new MovieHall(
                    "Hall-B",
                    75,
                    Boolean.FALSE
            );
            MovieHall hall_c = new MovieHall(
                    "Hall-C",
                    150,
                    Boolean.FALSE
            );
            repository.saveAll(
                    List.of(hall_a, hall_b, hall_c)
            );
        };
    }
}
