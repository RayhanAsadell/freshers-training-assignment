package rayhanasadel.interntrainingassignment.movieHall;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieHallRepository extends JpaRepository<MovieHall, Long> {

    @Query("select m from MovieHall m where m.hall_name =?1")
    Optional<MovieHall> findMovieHallByHall_name(String hall_name);
}
