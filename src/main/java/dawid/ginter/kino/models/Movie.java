package dawid.ginter.kino.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Movie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private Integer duration;

    @Column(nullable = false, columnDefinition = "boolean default false")
    private Boolean deleted = false;
    private Integer yearOfProduction;

}
