public class CompteBancari {

    private double saldo;

    public CompteBancari(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no pot ser negatiu.");
        }
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingressar(double quantitat) {
        if (quantitat <= 0) {
            throw new IllegalArgumentException("L'ingrés ha de ser positiu.");
        }
        saldo += quantitat;
    }

    public void retirar(double quantitat) {
        if (quantitat <= 0) {
            throw new IllegalArgumentException("La retirada ha de ser positiva.");
        }
        if (quantitat > saldo) {
            throw new IllegalArgumentException("No hi ha saldo suficient.");
        }
        saldo -= quantitat;
    }
}
