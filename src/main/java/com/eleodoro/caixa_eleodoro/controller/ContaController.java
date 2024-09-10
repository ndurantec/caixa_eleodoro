package com.eleodoro.caixa_eleodoro.controller;

import java.net.URI;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.caixa_eleodoro.dto.ContaDTO;
import com.eleodoro.caixa_eleodoro.repository.Contarepository;

@RestController
@RequestMapping(value = "/conta")
public class ContaController{

private Contarepository contarepository;
    @GetMapping(value = "/imprimir")
    public String imprimir(){
        System.out.print("Chegou até Conta Controller");

    @PostMapping(value = "/insert")
    public Repositoryentity<Conta> insert(@RequestBody ContaDto contaDto){
        Conta novaConta = ContaDto.novaConta();
        contarepository.save(novaConta);

        System.out.println("Chegou no metodo insert");
        System.out.println(contaDto.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()

        .path(path:"{/id}")
        .bildAndexpand(novaConta.getID());
        .toUri();

        return ResponseEntity.created(uri).body(novaConta);
    }
}
}