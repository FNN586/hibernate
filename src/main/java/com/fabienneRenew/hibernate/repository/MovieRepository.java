package com.fabienneRenew.hibernate.repository;

import com.fabienneRenew.hibernate.domain.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepository {
    public void persist(Movie movie){
        throw new UnsupportedOperationException();
    }

    public List<Movie> getAll(){
        throw new UnsupportedOperationException();
    }
}
