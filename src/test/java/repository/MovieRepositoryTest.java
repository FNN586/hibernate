package repository;

import com.fabienneRenew.hibernate.domain.Movie;
import com.fabienneRenew.hibernate.repository.MovieRepository;
import config.PersistConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//permet l'exécution dans un contexte spring
@ExtendWith(SpringExtension.class)
//classe de configuration dont a besoin spring pour s'initialiser
@ContextConfiguration(classes = {PersistConfig.class})
public class MovieRepositoryTest {
    @Autowired
    private MovieRepository repository;

    @Test
    public  void save_casNominal(){
        Movie movie = new Movie();
        movie.setName("Inception");
        repository.persist(movie);
    }
}
