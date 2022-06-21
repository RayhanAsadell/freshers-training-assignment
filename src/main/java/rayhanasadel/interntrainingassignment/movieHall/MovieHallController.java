package rayhanasadel.interntrainingassignment.movieHall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/movie-hall")
public class MovieHallController {
    private final MovieHallService movieHallService;

    @Autowired
    public MovieHallController(MovieHallService movieHallService) {
        this.movieHallService = movieHallService;
    }

    @GetMapping
    public List<MovieHall> getMovieHall(){
        return movieHallService.getMovieHall();
    }
    @PostMapping
    public void registerNewMovieHall(@RequestBody MovieHall movieHall){
        movieHallService.addNewStudent(movieHall);
    }
    @DeleteMapping(path = "{hall_id}")
    public void deleteMovieHall(@PathVariable("hall_id") Long id){
        movieHallService.deleteMovieHall(id);
    }
}
