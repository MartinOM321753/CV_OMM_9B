package utez.edu.mx.cvomm9b.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin({"*"})
public class User2Controller {

    @GetMapping
    public String user2(){
        return "Hello  desde controller User2Controller";
    }
}
