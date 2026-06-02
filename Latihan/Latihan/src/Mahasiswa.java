public class Mahasiswa {
    public int sisaSks;

    public void setSksMaksimal(int sks){
        if(sks > 24){
            throw new IllegalArgumentException("Kesalahan sistem: Batas SKS tidak valid (harus antara 2 - 24 SKS)!");
        } else if (sks < 2){
            throw new IllegalArgumentException("Kesalahan sistem: Batas SKS tidak valid (harus antara 2 - 24 SKS)!");
        } else {
            System.out.println("SKS yang diambil: " + sks);
        }
    }

    public void ambilMataKuliah(String namaMataKuliah, int bebanSks){
        if(bebanSks > sisaSks){
            throw new SksTidakCukupException("Tidak cukup SKS yang tersisa");
        } else {
            sisaSks -= bebanSks;
            System.out.println("Mata kuliah " + namaMataKuliah);
            System.out.println("Sisa SKS: " + sisaSks);
        }
    }
}
