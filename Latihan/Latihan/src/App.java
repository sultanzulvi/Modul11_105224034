import java.util.Scanner;
import java.io.FileNotFoundException;

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


        SistemAkademik akademik1 = new SistemAkademik();
        akademik1.kuotaKelas = 0;
        try{
            akademik1.gabungKelas("PBO", 0);
        } catch (KelasPenuhException k){
            System.out.println("Exception : " + k.getMessage());
        }


        SistemAkademik akademik2 = new SistemAkademik();
        try{
            akademik2.cetakDokumenKrs("ikrs_valid.txt");
        } catch (FileNotFoundException e){
            System.out.println("Exception : " + e.getMessage());
        } finally {
            System.out.println("Sesi Sistem Rencana Studi telah ditutup. Koneksi database diputuskan,");
        }
    }
}
