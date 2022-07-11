/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author Lucas
 */
public interface intefaceConta  {
    public void depositar(double valor);
    public void sacar(double valor);
    public void transferir(int valor,int agencia, int numero);
    public void imprimirInfos();
}
