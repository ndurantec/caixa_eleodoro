package com.eleodoro.caixa_eleodoro.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.caixa_eleodoro.dto.FluxoDTO;
import com.eleodoro.caixa_eleodoro.modelo.Fluxo;
import com.eleodoro.caixa_eleodoro.repository.FluxoRepository;

    
@RestController
@CrossOrigin("*")
@RequestMapping(value = "/fluxo")
public class FluxoController {


    // @Autowired
    // private FluxoRepository fluxoRepository;

    
    // @GetMapping(value = "/imprimir")
    // public String imprimir(){
    //     return "Chegou até Fluxo Controller";
    // }


    //  @PostMapping(value = "/insert")
    // public ResponseEntity<Fluxo> insert(@RequestBody FluxoDTO fluxoDto){
    //     Fluxo novoFluxo = fluxoDto.novoFluxo();
    //     fluxoRepository.save(novoFluxo);

    //     System.out.println("Chegou no metodo insert");
    //     System.out.println(fluxoDto.toString());

    //     URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
    //     .path("{/id}")
    //     .buildAndExpand(novoFluxo)
    //     .toUri();

    //     return ResponseEntity.created(uri).body(novoFluxo);
    // }
    
    // @GetMapping(value = "/{id}")
    // public ResponseEntity<Fluxo> buscarPorid(@PathVariable Long id){
    //     // return Contarepository.findByid(id).map(registro -> ResponseEntity.ok().body(registro))
    //     // .orElse(ResponseEntity.notFound().build());
    //     return null;
    // }
    // @PutMapping(value = "/{id}")
    // public ResponseEntity<Fluxo> update(@PathVariable Long id, @RequestBody FluxoDTO fluxoDto) {
        
    //     Optional<Fluxo> fluxoBanco = fluxoRepository.findById(id);

    //     Fluxo fluxoModificado = fluxoBanco.get();

    //     fluxoModificado.setDescricao(fluxoDto.getDescricao());
    //     fluxoModificado.setData(fluxoDto.getData());
    //     fluxoModificado.setValor(fluxoDto.getValor());

    //     fluxoRepository.save(fluxoModificado);

    //     return ResponseEntity.ok().body(fluxoModificado);
    // }

    // @DeleteMapping(value = "/{id}")
    // public ResponseEntity<Void> delete(@PathVariable Long id) {
    //     if (fluxoRepository.existsById(id)) {
    //         fluxoRepository.deleteById(id);
    //         return ResponseEntity.noContent().build();
    //     } 
    //     return ResponseEntity.notFound().build();       
    //     }

}

