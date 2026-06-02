import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try{
            int[] arrayInt = new int[3];
            for(int i = 0; i < 4; i++){
                arrayInt[i] = scanner.nextInt();
            }

        } catch (java.util.InputMismatchException i){
            System.out.println("Error input selain angka!!");
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Index melebihi batas");
        }



        try{
            Mahasiswa mahasiswa1 = new Mahasiswa();
            mahasiswa1.setSksMaksimal(25);
        } catch (IllegalArgumentException e){
            System.out.println("Exception : " + e.getMessage());
        }

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.sisaSks = 1;
        try{
            mahasiswa2.ambilMataKuliah("PBO", 12);

        } catch (SksTidakCukupException s){
            System.out.println("Exception : " + s.getMessage());
        }
    }
}
