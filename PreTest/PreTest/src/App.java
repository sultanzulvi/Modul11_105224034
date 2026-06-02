import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
    Scanner scanner = new Scanner(System.in);

    try{
        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();

        int hasil = angka1 / angka2;
        System.out.println(hasil);
    } catch (ArithmeticException e) {
        System.out.println("Error jika dibagi nol");
    } catch (java.util.InputMismatchException i) {
        System.out.println("Error jika input bukan angka");
    } finally {
        scanner.close();
        System.out.println("Proses kalkulasi selesai dan resource memori telah dibersihkan");

        }
    }
}
