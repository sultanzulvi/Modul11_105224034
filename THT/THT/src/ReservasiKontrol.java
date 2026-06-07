import java.util.ArrayList;
import java.util.List;

public class ReservasiKontrol {
    private List<Kereta> daftarKereta;

    public ReservasiKontrol() {
        daftarKereta = new ArrayList<>();
        inisialisasiDataAwal();
    }

    private void inisialisasiDataAwal() {
        daftarKereta.add(new Kereta("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarKereta.add(new Kereta("K02", "Parahyangan", "JKT - BDG", 15));
    }

    public List<Kereta> getDaftarKereta() {
        return daftarKereta;
    }

    public void pesanTiket(String kodeKereta, String nik, String namaPenumpang, int jumlahTiket) 
            throws RuteTidakDitemukanException, TiketHabisException {
        
        if (nik.length() != 16 || !nik.matches("\\d+")) {
            throw new DataPenumpangTidakValidException("Format NIK tidak valid! NIK harus tepat 16 digit angka.");
        }

        Kereta keretaDipilih = null;
        for (Kereta k : daftarKereta) {
            if (k.getKodeKereta().equalsIgnoreCase(kodeKereta)) {
                keretaDipilih = k;
                break;
            }
        }

        if (keretaDipilih == null) {
            throw new RuteTidakDitemukanException("Kereta dengan kode '" + kodeKereta + "' tidak ditemukan.");
        }

        // 3. Validasi Sisa Kursi
        if (jumlahTiket > keretaDipilih.getSisaKursi()) {
            throw new TiketHabisException(
                "Jumlah pemesanan melebihi sisa kursi yang tersedia.", 
                keretaDipilih.getNamaKereta(), 
                keretaDipilih.getSisaKursi()
            );
        }

        keretaDipilih.kurangiKursi(jumlahTiket);
        System.out.println("Pemesanan Berhasil!");
        System.out.println("Penumpang: " + namaPenumpang);
        System.out.println("Kereta: " + keretaDipilih.getNamaKereta() + " (" + jumlahTiket + " tiket)");
    }
}