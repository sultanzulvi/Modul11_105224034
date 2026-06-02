public class AkunBank {
    private String nomorRekening;
    private int saldo;
    private int totalTransferHariIni;

    public AkunBank(String nomorRekening, int saldo, int TotalTransferHarIni) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
        this.totalTransferHariIni = totalTransferHariIni;
    }
    
    public String getNomorRekening() {
        return nomorRekening;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getTotalTransferHariIni() {
        return totalTransferHariIni;
    }

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTotalTransferHariIni(int totalTransferHariIni) {
        this.totalTransferHariIni = totalTransferHariIni;
    }

    public void tarikTunai(double nominal) throws SaldoTidakMencukupiException {
        if (nominal > saldo) {
            throw new SaldoTidakMencukupiException("Saldo tidak mencukupi untuk melakukan penarikan.");
        }
        saldo -= nominal;
            System.out.println("Saldo berhasil ditarik");
    }

public void transfer(AkunBank tujuan, double nominal) throws BatasTransferHarianException {
        if(nominal > 5000000){
            throw new BatasTransferHarianException("Batas transfer harian adalah 5.000.000.");
        } else {
            this.saldo -= nominal;
            tujuan.saldo += nominal;
        }

    }
}