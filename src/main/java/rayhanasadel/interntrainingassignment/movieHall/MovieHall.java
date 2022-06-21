package rayhanasadel.interntrainingassignment.movieHall;

import javax.persistence.*;

@Entity
@Table
public class MovieHall {
    @Id
    @SequenceGenerator(
            name = "movie_hall_sequence",
            sequenceName = "movie_hall_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_hall_sequence"
    )
    private Long hall_id;
    private String hall_name;
    private Integer capacity;
    private Boolean booked;

    public MovieHall() {
    }

    public MovieHall(
            Long hall_id,
            String hall_name,
            Integer capacity,
            Boolean booked) {
        this.hall_id = hall_id;
        this.hall_name = hall_name;
        this.capacity = capacity;
        this.booked = booked;
    }

    public MovieHall(
            String hall_name,
            Integer capacity,
            Boolean booked) {
        this.hall_name = hall_name;
        this.capacity = capacity;
        this.booked = booked;
    }

    public Long getHall_id() {
        return hall_id;
    }

    public void setHall_id(Long hall_id) {
        this.hall_id = hall_id;
    }

    public String getHall_name() {
        return hall_name;
    }

    public void setHall_name(String hall_name) {
        this.hall_name = hall_name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Boolean getBooked() {
        return booked;
    }

    public void setBooked(Boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        return "MovieHall{" +
                "hall_id=" + hall_id +
                ", hall_name='" + hall_name + '\'' +
                ", capacity=" + capacity +
                ", booked=" + booked +
                '}';
    }
}
