package com.eleodoro.caixa_eleodoro.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fluxo {

    @SuppressWarnings("unused")
    private static final long serialVersionUID = 1L; 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Conta conta;
    private LocalDateTime data;
    private Operacao operacao;
    private Double valor;
    private String descricao;
    public Fluxo() {
    }
    public Fluxo(Conta conta, LocalDateTime data, Operacao operacao, Double valor, String descricao) {
        this.conta = conta;
        this.data = data;
        this.operacao = operacao;
        this.valor = valor;
        this.descricao = descricao;
        }
        
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
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

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((conta == null) ? 0 : conta.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((operacao == null) ? 0 : operacao.hashCode());
        result = prime * result + ((valor == null) ? 0 : valor.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fluxo other = (Fluxo) obj;
        if (conta == null) {
            if (other.conta != null)
                return false;
        } else if (!conta.equals(other.conta))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (operacao == null) {
            if (other.operacao != null)
                return false;
        } else if (!operacao.equals(other.operacao))
            return false;
        if (valor == null) {
            if (other.valor != null)
                return false;
        } else if (!valor.equals(other.valor))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Fluxo [conta=" + conta + ", data=" + data + ", operacao=" + operacao + ", valor=" + valor
                + ", descricao=" + descricao + ", getConta()=" + getConta() + ", getData()=" + getData()
                + ", getOperacao()=" + getOperacao() + ", getValor()=" + getValor() + ", getDescricao()="
                + getDescricao() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
                + super.toString() + "]";
    }


    
}
