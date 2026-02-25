import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=====CALCULADORA=====");

        System.out.println("Selecione qual será a operação:");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");

        int opcao = sc.nextInt();
        double resultado = 0;


        System.out.println("Digite o primeiro número:");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 =  sc.nextDouble();

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!!!");
                    return;
                }break;
            default:
                System.out.println("Opção Inválida!");
                return;
        }
        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}


