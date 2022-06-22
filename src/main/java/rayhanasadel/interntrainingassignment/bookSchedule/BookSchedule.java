package rayhanasadel.interntrainingassignment.bookSchedule;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class BookSchedule {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    private Long book_id;
    private Integer hall_id;
    private LocalDate book_time;

    public BookSchedule() {
    }

    public BookSchedule(Long book_id, Integer hall_id, LocalDate book_time) {
        this.book_id = book_id;
        this.hall_id = hall_id;
        this.book_time = book_time;
    }

    public BookSchedule(Integer hall_id, LocalDate book_time) {
        this.hall_id = hall_id;
        this.book_time = book_time;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public Integer getHall_id() {
        return hall_id;
    }

    public void setHall_id(Integer hall_id) {
        this.hall_id = hall_id;
    }

    public LocalDate getBook_time() {
        return book_time;
    }

    public void setBook_time(LocalDate book_time) {
        this.book_time = book_time;
    }

    @Override
    public String toString() {
        return "BookSchedule{" +
                "book_id=" + book_id +
                ", hall_id=" + hall_id +
                ", book_time=" + book_time +
                '}';
    }
}
