package br.com.jlgregorio.springcrud.repository;

import br.com.jlgregorio.springcrud.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
