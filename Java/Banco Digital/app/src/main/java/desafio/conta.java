/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author Lucas
 */
public abstract class conta implements intefaceConta { //Necessidade de abstract ao implementar.
    private static final int AGENCIA_PADRAO = 0001;
    private static int NUMERO = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    public String nome;
    
    
    
    public conta(){
        this.agencia = conta.AGENCIA_PADRAO;
        this.numero = NUMERO++;
        
    }
    
    @Override
    public void imprimirInfos(){
        System.out.println("Nome: " + this.nome);
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        
    }
    
    @Override
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito feito");
    }

    @Override
    public void sacar(double valor){
        saldo -= valor;
        System.out.println("Saque realizado");
        
        
    }
    
    @Override
    public void transferir(int valor, conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
        
        System.out.println("Valor tranferido");
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    
}


