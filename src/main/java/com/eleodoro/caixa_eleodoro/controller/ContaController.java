package com.eleodoro.caixa_eleodoro.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.caixa_eleodoro.dto.ContaDTO;
import com.eleodoro.caixa_eleodoro.modelo.Conta;
import com.eleodoro.caixa_eleodoro.repository.ContaRepository;

@RestController

@CrossOrigin("*")
@RequestMapping(value = "/conta")
public class ContaController{

    @Autowired
    private ContaRepository contarepository;


    @GetMapping(value = "/imprimir")
    public String imprimir(){
        System.out.print("Chegou até Conta Controller");
        return null;
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<Conta> insert(@RequestBody ContaDTO contaDto){
        Conta novaConta = contaDto.novaConta();
        contarepository.save(novaConta);

        System.out.println("Chegou no metodo insert");
        System.out.println(contaDto.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("{/id}")
        .buildAndExpand(novaConta)
        .toUri();

        return ResponseEntity.created(uri).body(novaConta);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Conta> buscarPorid(@PathVariable Long id){
        // return Contarepository.findByid(id).map(registro -> ResponseEntity.ok().body(registro))
        // .orElse(ResponseEntity.notFound().build());
        return null;
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (contarepository.existsById(id)) {
            contarepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } 
        return ResponseEntity.notFound().build();       
        }

}
