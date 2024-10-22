package com.eleodoro.caixa_eleodoro.dto;

import com.eleodoro.caixa_eleodoro.modelo.Conta;

public class ContaDTO {

    private String nome;
    private String descricao;
   
    public ContaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Conta novaConta() {
        return new Conta(nome, descricao);
    }
}
