import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de lados: ");
        int n = sc.nextInt();
        System.out.print("Digite a medida do lado: ");
        double lado = sc.nextDouble();

        if (n < 3) {
            System.out.println("Não é um polígono");
        } else if (n == 3) {
            
            double a = lado, b = lado, c = lado;
            double s = (a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("TRIÂNGULO - Área: " + area);
        } else if (n == 4) {
            System.out.println("QUADRADO - Área: " + (lado*lado));
        } else if (n == 5) {
            
            double area = (5 * lado * lado) / (4 * Math.tan(Math.PI/5));
            System.out.println("PENTÁGONO - Área: " + area);
        } else {
            System.out.println("Polígono não identificado");
        }
        sc.close();
    }
}