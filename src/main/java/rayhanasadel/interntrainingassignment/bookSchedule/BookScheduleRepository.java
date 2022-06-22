package rayhanasadel.interntrainingassignment.bookSchedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rayhanasadel.interntrainingassignment.movieHall.MovieHall;

import java.util.Optional;

@Repository
public interface BookScheduleRepository extends JpaRepository<BookSchedule, Long> {

    @Query("select m from BookSchedule m where m.book_id =?1")
    Optional<BookSchedule> findBookScheduleById(Long id);
}
