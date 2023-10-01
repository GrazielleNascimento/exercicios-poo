/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author grazi
 */
public class Instrutor extends Pessoa {
    
    private int identificacao;
    private String areaAtuacao;

    public Instrutor( int identificacao, String nome, String telefone) {
        super(nome, telefone); // chamada do metodo construtor da superClasse Pessoa
        this.identificacao = identificacao;
    }
    
    public void setAreaAtuacao(String areaAtuacao){
        this.areaAtuacao= areaAtuacao;
        
    }
    
    public int getIdentificacao(){
        return identificacao;
    }
    
    public String getAreaAtuacao(){
        return areaAtuacao;
    }
    
}
