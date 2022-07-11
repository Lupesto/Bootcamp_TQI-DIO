/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author Lucas
 */
public class banco {
    public static void main(String[] args) {
        contaPoupanca lucas = new contaPoupanca("Lucas");
        contaCorrente everton = new contaCorrente("Everton");
        
        
        
        lucas.depositar(30);
        lucas.transferir(30, everton);
 
        everton.imprimirExtrato();
        lucas.imprimirExtrato();
    }
}
