import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int inputNumber = scanner.nextInt();
        scanner.close();
        System.out.println("Podana liczba to: " + inputNumber);
    }
}
