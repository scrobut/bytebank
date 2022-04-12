public class Conta {
    int agencia;
    double saldo;
    int numero;
    String titular;

    public void transfere(double valor){
        saldo = saldo + valor;
    }
}
