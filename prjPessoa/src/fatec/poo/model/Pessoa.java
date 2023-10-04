/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author labfatec
 */
public abstract class Pessoa {

    private String Nome;
    private int AnoInscricao;
    private double TotalCompras;

    public Pessoa(String Nome, int AnoInscricao) {
        this.Nome = Nome;
        this.AnoInscricao = AnoInscricao;
    }

    public abstract double calcBonus(int anoAtual);

    public void addCompras(double valorDaCompra) {
        TotalCompras = TotalCompras + valorDaCompra;

    }

    public String getNome() {
        return Nome;

    }

    public int getAnoInscricao() {
        return AnoInscricao;

    }

    public double getTotalCompras() {
        return TotalCompras;

    }

}
