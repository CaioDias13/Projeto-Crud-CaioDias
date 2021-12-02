package br.com.jlgregorio.springcrud.controller;

import br.com.jlgregorio.springcrud.model.Movie;
import br.com.jlgregorio.springcrud.services.MovieServiceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/movie/V2")
public class MovieControllerV2 {

    @Autowired
    private MovieServiceV2 service;

    @PostMapping
    public Movie save(@RequestBody Movie movie){
        return service.save(movie);
    }

    @GetMapping
    public List<Movie> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Movie findById(@PathVariable("id") long id) throws Exception{
        return service.findById(id);
    }

    @PutMapping
    public Movie update(@RequestBody Movie movie) throws Exception{
        return service.update(movie);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) throws Exception {
        service.delete(id);
    }


}
