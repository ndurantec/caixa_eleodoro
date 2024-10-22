package com.eleodoro.caixa_eleodoro.dto;

import java.time.LocalDateTime;

import com.eleodoro.caixa_eleodoro.modelo.Conta;
import com.eleodoro.caixa_eleodoro.modelo.Fluxo;
import com.eleodoro.caixa_eleodoro.modelo.Operacao;

public class FluxoDTO {
    
    private Conta conta;
    private LocalDateTime data;
    private Operacao operacao;
    private Double valor;
    private String descricao;

    public FluxoDTO() {
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Fluxo novoFluxo() {
        return new Fluxo(conta, data, operacao, valor, descricao);
    }

}
