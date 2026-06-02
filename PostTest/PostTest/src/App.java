public class App {
    public static void main(String[] args) throws Exception {
        
        try{
            AkunBank akun1 = new AkunBank("12345678", 10000000, 0);
            akun1.tarikTunai(60000000);
        } catch (SaldoTidakMencukupiException e) {
            System.out.println(e.getMessage());
        }

        try{
            AkunBank akun2 = new AkunBank("87654321", 5000000, 0);
            AkunBank akunTujuan = new AkunBank("87654321", 5000000, 0);
            akun2.transfer(akunTujuan, 60000000);
        } catch (BatasTransferHarianException e) {
            System.out.println(e.getMessage());
        }
    }
}
