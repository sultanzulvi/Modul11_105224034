import java.io.FileNotFoundException;

public class SistemAkademik {
    public int kuotaKelas;

    public void gabungKelas(String kodeKelas, int kuotaTersedia) throws KelasPenuhException {
        if(kuotaTersedia <= 0){
            throw new KelasPenuhException("Kelas " + kodeKelas + " sudah penuh!");
        } else {
            System.out.println("Berhasil bergabung dengan kelas " + kodeKelas);
        }
    }

    public void cetakDokumenKrs(String namaFile) throws FileNotFoundException {
        if(namaFile == "krs_valid.txt"){
            throw new FileNotFoundException("Nama file tidak valid!!")
        } else {
            
        }
    }
}
