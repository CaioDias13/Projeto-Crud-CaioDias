package br.com.jlgregorio.springcrud.services;

import br.com.jlgregorio.springcrud.model.Movie;
import br.com.jlgregorio.springcrud.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceV2 {

    @Autowired
    private MovieRepository repository;

    public Movie save(Movie movie){return repository.save(movie);
    }

    public Movie findById(long id) throws Exception{
        return repository.findById(id).orElseThrow( () -> new Exception("Not Found!") );
    }

    public List<Movie> findAll(){
        return repository.findAll();
    }

    public Movie update(Movie movie) throws Exception{
        Movie p = repository.findById(movie.getId()).orElseThrow( () -> new Exception("Not Found"));
        p.setName(movie.getName());
        p.setDirector(movie.getDirector());
        p.setYear(movie.getYear());
        p.setCast(movie.getCast());
        p.setGenre(movie.getGenre());
        return repository.save(p);
    }

    public void delete(long id) throws  Exception{
        Movie p = repository.findById(id).orElseThrow( () -> new Exception("Not Found!") );
        repository.delete(p);
    }




}

