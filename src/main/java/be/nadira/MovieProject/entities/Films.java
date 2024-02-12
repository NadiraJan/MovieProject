package be.nadira.MovieProject.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Films {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titel;
    private int voorraad;
    private int gereserveerd;
    private double prijs;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "genreId")
    private Genres genres;

    @OneToOne
    private Reservaties reservaties;


}
