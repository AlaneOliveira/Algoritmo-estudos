import java.util.Scanner;

public class NumeroMaior{
    public static void main(String[] args) {
        // algoritmo: Faca um programa que receba dois numeros 
        // e mostre qual deles eh o maior.

        double n1, n2; // declaracao onde armazena variavel
        Scanner ler = new Scanner(System.in); // objeto que faz a leitura da entrada de dados

        System.out.print("primeiro numero: "); // mostra na tela
        n1 = ler.nextDouble(); // chama n1 para armazenar

        System.out.print("segundo numero: ");
        n2 = ler.nextDouble(); // chama n2 para armazenar 

        if(n1 > n2){
            System.out.print("O primeiro valor é maior e o segundo menor");
        } else if (n1 == n2){
            System.out.print("Ambos valores são iguais");
        } else {
            System.out.print("O primeiro valor é menor e o segundo é maior");
        }
    }
}