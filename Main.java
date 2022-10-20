import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double raio;
        Scanner input = new Scanner(System.in);
        raio = input.nextDouble();
        double area;
        double n = 3.14159;

        area =  n * (raio * raio);

        System.out.printf("A=%.4f\n", area);
    }
}