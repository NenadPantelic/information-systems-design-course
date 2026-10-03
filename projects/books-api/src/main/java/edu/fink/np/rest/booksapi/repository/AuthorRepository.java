package edu.fink.np.rest.booksapi.repository;

import edu.fink.np.rest.booksapi.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
