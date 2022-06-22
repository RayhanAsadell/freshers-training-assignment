package rayhanasadel.interntrainingassignment.bookSchedule;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rayhanasadel.interntrainingassignment.movieHall.MovieHall;
import rayhanasadel.interntrainingassignment.movieHall.MovieHallRepository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class BookScheduleConfig {
    @Bean
    CommandLineRunner commandLineRunner1(BookScheduleRepository repository){
        return args -> {
            BookSchedule book_a = new BookSchedule(
                    1,
                    LocalDate.of(2022, Month.JUNE, 15)
            );
            BookSchedule book_b = new BookSchedule(
                    2,
                    LocalDate.of(2022, Month.JUNE, 10)
            );
            BookSchedule book_c = new BookSchedule(
                    3,
                    LocalDate.of(2022, Month.JUNE, 5)
            );

            repository.saveAll(
                    List.of(book_a, book_b, book_c)
            );
        };
    }

}
