package br.com.fiap.nac.bean;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="conta", sequenceName = "SQ_CONTA", allocationSize = 1)
public class ContaCorrente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conta")
    private int id;
    private String titular;
    private int agencia;
    private int conta;
    private double saldo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

