import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int metro;
        int centimetro;
        System.out.print("Informe o metro: ");
        metro = sc.nextInt();
        centimetro = metro * 100;
        sc.close();
        System.out.println("");
        System.out.print("O centimetro do metro informado tem: " +centimetro);   
    }
}