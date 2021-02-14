package br.com.project.microservicespatricia.repository;

import br.com.project.microservicespatricia.domain.User;
import br.com.project.microservicespatricia.domain.dto.UserDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {

    public ResponseEntity<UserDTO> save( UserDTO userRequest);

    public Optional<UserDTO> findById(UserDTO userRequest);


}
