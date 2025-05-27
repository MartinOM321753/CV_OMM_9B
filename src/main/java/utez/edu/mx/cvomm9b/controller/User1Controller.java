package utez.edu.mx.cvomm9b.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin({"*"})
public class User1Controller {

    @GetMapping
    public String user1(){
        return "Hello  desde controller User1Controller";
    }
}
