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
        lucas.depositar(30);
        System.out.println(lucas.getSaldo());
        
        System.out.println(lucas.getNumero());
        
        contaCorrente everton = new contaCorrente("Everton");
        System.out.println(everton.getNumero());
        everton.imprimirExtrato();
    }
}
