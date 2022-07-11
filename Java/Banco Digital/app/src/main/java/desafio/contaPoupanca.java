/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author Lucas
 */
public class contaPoupanca extends conta {
    
    public contaPoupanca(String nome) {
        super.nome = nome;
    }
    
    public void imprimirExtrato(){
        System.out.println("== Extrato Conta Poupanca ==");
        imprimirInfos();
    }
    
}
