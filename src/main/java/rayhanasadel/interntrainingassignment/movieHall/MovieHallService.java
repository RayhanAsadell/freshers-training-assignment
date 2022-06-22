package rayhanasadel.interntrainingassignment.movieHall;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieHallService {

    private final MovieHallRepository movieHallRepository;

    public MovieHallService(MovieHallRepository movieHallRepository) {
        this.movieHallRepository = movieHallRepository;
    }

    public  void deleteMovieHall(Long id) {
        boolean exists = movieHallRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException(("Movie hall with id "+id+" does not exist"));
        }
        movieHallRepository.deleteById(id);
    }

    public List<MovieHall> getMovieHall(){
        return movieHallRepository.findAll();
    }

    public void addNewStudent(MovieHall movieHall) {

        Optional<MovieHall> movieHallByHall_name = movieHallRepository.findMovieHallByHall_name(movieHall.getHall_name());
        if (movieHallByHall_name.isPresent()){
            throw new IllegalStateException("name taken");
        }
        movieHallRepository.save(movieHall);
    }
}
