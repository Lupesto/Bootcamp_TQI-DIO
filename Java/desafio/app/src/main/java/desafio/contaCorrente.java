/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author Lucas
 */
public class contaCorrente extends conta {

    public contaCorrente(String nome) {
        super.nome = nome;
    }
    
    
    public void imprimirExtrato(){
        System.out.println("== Extrato Conta Corrente ==");
        imprimirInfos();
    }
}
