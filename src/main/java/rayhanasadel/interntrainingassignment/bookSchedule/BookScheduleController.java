package rayhanasadel.interntrainingassignment.bookSchedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/book-schedule")
public class BookScheduleController {
    private final BookScheduleService bookScheduleService;

    @Autowired
    public BookScheduleController(BookScheduleService bookScheduleService){
        this.bookScheduleService = bookScheduleService;
    }

    @GetMapping
    public List<BookSchedule> getBookSchedule(){
        return bookScheduleService.getBookSchedule();
    }

    @PostMapping
    public void registerNewBookSchedule(@RequestBody BookSchedule bookSchedule){
        bookScheduleService.addNewBookSchedule(bookSchedule);
    }
    @DeleteMapping(path = {"{book_id}"})
    public void deleteBookSchedule(@PathVariable("book_id") Long id){
        bookScheduleService.deleteBookSchedule(id);
    }

}
