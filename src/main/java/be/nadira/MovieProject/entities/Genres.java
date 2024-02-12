package be.nadira.MovieProject.entities;

import jakarta.persistence.*;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Genres {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String naam;


    @OneToMany(mappedBy = "genres", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Films> films = new HashSet<>();


}
