package br.com.project.microservicespatricia.controller;
import br.com.project.microservicespatricia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicorserviceController {

    @Autowired
    UserService userService;

    public MicorserviceController(UserService userService) {
        this.userService = userService;
    }
}
