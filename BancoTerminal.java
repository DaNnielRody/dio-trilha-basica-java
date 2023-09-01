package edu.dan.ContaBanco;

public class BancoTerminal {

    public static void main(String[] args){
     double balance = 25.00;
     double resquestedBalance = 18.00;

     if(balance > resquestedBalance){
         balance -= resquestedBalance;
     }else{
         System.out.println("Saldo insuficiente");
     }
        System.out.println(balance);

    }
}
