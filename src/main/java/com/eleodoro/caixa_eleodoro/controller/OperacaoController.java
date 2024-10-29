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

import com.eleodoro.caixa_eleodoro.dto.OperacaoDTO;
import com.eleodoro.caixa_eleodoro.modelo.Operacao;
import com.eleodoro.caixa_eleodoro.repository.OperacaoRepository;

    
@RestController

@CrossOrigin("*")
@RequestMapping(value = "/operacao")
public class OperacaoController {

//     @Autowired
//     private OperacaoRepository operacaoRepository;


// @GetMapping(value = "/imprimir")
// public String imprimir(){
//     return "Chegou até operacao Controller";
// }

// @PostMapping(value = "/insert")
//     public ResponseEntity<Operacao> insert(@RequestBody OperacaoDTO operacaoDto){
//         Operacao novaOperacao = operacaoDto.novaOperacao();
//         operacaoRepository.save(novaOperacao);

//         System.out.println("Chegou no metodo insert");
//         System.out.println(operacaoDto.toString());

//         URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
//         .path("{/id}")
//         .buildAndExpand(novaOperacao)
//         .toUri();

//         return ResponseEntity.created(uri).body(novaOperacao);
//     }
    
//     @GetMapping(value = "/{id}")
//     public ResponseEntity<Operacao> buscarPorid(@PathVariable Long id){
//         // return Contarepository.findByid(id).map(registro -> ResponseEntity.ok().body(registro))
//         // .orElse(ResponseEntity.notFound().build());
//         return null;
//     }

// @DeleteMapping(value = "/{id}")
//     public ResponseEntity<Void> delete(@PathVariable Long id) {
//         if (operacaoRepository.existsById(id)) {
//             operacaoRepository.deleteById(id);
//             return ResponseEntity.noContent().build();
//         } 
//         return ResponseEntity.notFound().build();       
//         }

}   

