package com.eleodoro.caixa_eleodoro.dto;

import com.eleodoro.caixa_eleodoro.modelo.Operacao;

public class OperacaoDTO {

    private String nome;

    public OperacaoDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }  

    public Operacao novaOperacao() {
        return new Operacao(nome);
    }
}
