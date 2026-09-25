// Leia um numero fornecido pelo usuario. Se esse numero for positivo, calcule a raiz  ́
// quadrada do numero. Se o n  ́ umero for negativo, mostre uma mensagem dizendo que o  ́
//numero  ́ e inv  ́ alido.
import java.util.Scanner;
import java.lang.Math; // import da biblioteca math
public class CalcularRaiz{
    public static void main(String[] args) {

        // propriedades da biblioteca math
        // Math.sqrt(100); - raiz quadrada (ESTAMOS USANDO ESTE)
        // Math.pow(2, 3); - 2 elevado a 3
        // Math.abs(-10);  - valor absoluto
        // Math.max(10, 20); -maior valor
        // Math.min(10, 20); - menor valor

        Scanner scanner = new Scanner(System.in);
        float n1;

        System.out.print("numero: ");
        n1 = scanner.nextFloat();

        if (n1 >= 0){
            double resultado = Math.sqrt(n1); // precisa manter double já que o sqrt retorna o tipo double
            // float resultado = (float) Math.sqrt(n1); - é possivel converter pra float
            System.out.print("o numero e positivo e sua raiz é" + resultado);
        } else{
            System.out.print("Numero invalido");
        }
    }
    


}