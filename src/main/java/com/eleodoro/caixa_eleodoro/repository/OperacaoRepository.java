package com.eleodoro.caixa_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.caixa_eleodoro.modelo.Operacao;

public interface OperacaoRepository extends JpaRepository<Operacao, Long> {
    
}
