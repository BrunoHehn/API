package hehn.bruno.projectShopStore.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "Seja Bem vindo ao Sistema API de mercado.";
    }
}
