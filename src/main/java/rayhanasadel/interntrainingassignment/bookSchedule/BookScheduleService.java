package rayhanasadel.interntrainingassignment.bookSchedule;

import org.springframework.stereotype.Service;
import rayhanasadel.interntrainingassignment.movieHall.MovieHall;

import java.util.List;
import java.util.Optional;

@Service
public class BookScheduleService {

    private final BookScheduleRepository bookScheduleRepository;

    public BookScheduleService(BookScheduleRepository bookScheduleRepository){
        this.bookScheduleRepository = bookScheduleRepository;
    }
    public List<BookSchedule> getBookSchedule() {
        return bookScheduleRepository.findAll();
    }

    public void addNewBookSchedule(BookSchedule bookSchedule) {
        Optional<BookSchedule> bookScheduleByID = bookScheduleRepository.findBookScheduleById(bookSchedule.getBook_id());
        if (bookScheduleByID.isPresent()){
            throw new IllegalStateException("name taken");
        }
        bookScheduleRepository.save(bookSchedule);
    }

    public void deleteBookSchedule(Long id) {
        boolean exists = bookScheduleRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException(("Book schedule with id "+id+" does not exist"));
        }
        bookScheduleRepository.deleteById(id);
    }
}
