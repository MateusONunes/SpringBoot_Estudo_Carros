package com.carros.api;

import org.springframework.web.bind.annotation.*;

@RestController // esta notação indica que este arquivo é um webservice
@RequestMapping("/")

public class IndexController {
    @GetMapping
    public String get(){
        return "Get - Spring boot Mateus on";
    }

    @GetMapping("/teste2")
    public String get2(@RequestParam("testeParam") String testeParam){ // <= esta é a maneira que está na videoaula, mas aparentemente da maneira abaixo também funciona
//    public String get2(String testeParam){ // Se eu passar desta maneira o parâmetro não é obrigatório.
        return "Hello Spring boot Mateus on turbo -" + testeParam;  //http://localhost:8080/teste2?testeParam=MateusX
    }

    @GetMapping("/testePathVariable/testeParam1/{testeParam1}/testeParam2/{testeParam2}")
    public String testePathVariable(@PathVariable("testeParam1") String testeParam1, @PathVariable("testeParam2") String testeParam2){ // <= esta é a maneira que está na videoaula, mas aparentemente da maneira abaixo também funciona
        //aula: https://www.udemy.com/course/springboot-essencial/learn/lecture/14472648#overview
        return "Hello Spring boot Mateus on turbo -" + testeParam1 + "-" + testeParam2;  //http://localhost:8080/testePathVariable/testeParam1/Mateus/testeParam2/ONunes/
    }

    @PostMapping()
    public String post(String testeParam){
        return "Post - Spring boot Matdeus on - " + testeParam;
    }

    @PutMapping()
    public String put(){
        return "Put - Spring boot Mateus on";
    }

    @DeleteMapping()
    public String delete(){
        return "Delete - Spring boot Mateus on";
    }


}
