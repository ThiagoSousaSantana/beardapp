package br.com.beardapp.service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    public ResponseEntity<String> testSwagger (){
        return ResponseEntity.ok("Este endPoint Funcionou");
    }
}
