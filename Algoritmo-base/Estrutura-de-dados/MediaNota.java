import java.util.Scanner; // importando a classe Scanner para ler a entrada do usuário

public class MediaNota{

    public static void main(String[] args) {

        // usando scanner para ler e armazenar as notas do usuário
        // scanner é uma classe que permite ler a entrada do usuário
        // objeto scanner é criado para ler a entrada do usuário
        // um objeto é uma instância de uma classe, que é criada a partir da classe Scanner
        Scanner scanner = new Scanner(System.in); // criando um objeto Scanner para ler a entrada do usuário
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble(); // lendo a primeira nota do usuário
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas é: " + media);

        // usando a função somar para somar dois números
        int resultadoSoma = somar(5, 10); // chamando a função somar com os argumentos 5 e 10
        System.out.println("A soma de 5 e 10 é: " + resultadoSoma);

    }

    // função para somar dois números
     public static int somar(int a, int b) { // método para somar dois números
        return a + b; // retorna a soma de a e b
    }
    public static int subtrair(int a, int b){ // método para subtrair dois números
        return a - b; // retorna a diferença entre a e b
    }
}