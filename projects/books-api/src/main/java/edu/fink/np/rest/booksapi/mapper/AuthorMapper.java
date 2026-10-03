package edu.fink.np.rest.booksapi.mapper;

import edu.fink.np.rest.booksapi.dto.response.AuthorDTO;
import edu.fink.np.rest.booksapi.dto.response.MinimalAuthorDTO;
import edu.fink.np.rest.booksapi.model.Author;

import java.util.Collection;
import java.util.List;

public class AuthorMapper {

    public static AuthorDTO mapToDTO(Author author) {
        if (author == null) {
            return null;
        }

        return new AuthorDTO(
                author.getId(),
                author.getFullName(),
                author.getBiography(

                ));
    }

    public static MinimalAuthorDTO mapToMinimalDTO(Author author) {
        if (author == null) {
            return null;
        }

        return new MinimalAuthorDTO(
                author.getId(),
                author.getFullName()
        );
    }


    public static List<MinimalAuthorDTO> mapToDTOList(Collection<Author> authors) {
        if (authors == null) {
            return null;
        }


        return authors.stream()
                .map(AuthorMapper::mapToMinimalDTO)
                .toList();
    }
}
