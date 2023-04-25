import java.util.Scanner;

public class App {

    //Faça um Programa que peça dois números e imprima a soma. 
    public static void main(String[] args) throws Exception {

        //entradas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        int n1 = teclado.nextInt();
        System.out.println("");
        System.out.println("Digite o segundo número:");
        System.out.println("");
        int n2 = teclado.nextInt();
        teclado.close();
        //processamento
        int soma = n1 + n2;

        //saidas

        System.out.printf("a soma de %d + %d é igual a %d", n1, n2, soma);
    }
}
