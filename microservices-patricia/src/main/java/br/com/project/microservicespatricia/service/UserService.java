package br.com.project.microservicespatricia.service;

import br.com.project.microservicespatricia.domain.dto.UserDTO;
import br.com.project.microservicespatricia.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private ObjectMapper objMapper;

    private UserRepository userRepository ;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<UserDTO> save(UserDTO userRequest){

        return null;
    }

    public Optional<UserDTO> findById(UserDTO userRequest){

        return null;
    }


}
