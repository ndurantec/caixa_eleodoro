package com.eleodoro.caixa_eleodoro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/conta")
public class ContaController {


@GetMapping(value = "/imprimir")
public String imprimir(){
    return "Chegou até Conta Controller";

}
}