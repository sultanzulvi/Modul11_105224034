public class Mahasiswa {
    public void setSksMaksimal(int sks){
        if(sks > 24){
            throw new IllegalArgumentException("Kesalahan sistem: Batas SKS tidak valid (harus antara 2 - 24 SKS)!");
        } else if (sks < 2){
            throw new IllegalArgumentException("Kesalahan sistem: Batas SKS tidak valid (harus antara 2 - 24 SKS)!");
        } else {
            System.out.println("SKS yang diambil: " + sks);
        }
    }
}
