import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero1, numero2, operador, resultado;


        System.out.println("Digite o primeiro numero:");
        numero1 = sc.nextDouble();
        System.out.println("Digite o segundo numero:");
        numero2 = sc.nextDouble();
        System.out.println("Escolha o operador aritmético: (1)soma(2)subtração(3)multiplicação(4)Divisão");
        operador = sc.nextDouble();

        if(operador == 1) {
            resultado = numero1 + numero2;
            System.out.println(resultado);

        }
    }
}