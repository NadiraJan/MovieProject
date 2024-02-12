package be.nadira.MovieProject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Reservaties {
    @Id
    private int id;

    private LocalDate reservaties;
    @OneToMany (mappedBy = "reservaties", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Klanten> klanten;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "reservaties")
    private Films films;


}
