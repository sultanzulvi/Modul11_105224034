public class SaldoTidakMencukupiException extends Exception {
    private String message;

    public SaldoTidakMencukupiException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
