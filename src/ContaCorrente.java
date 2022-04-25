public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public boolean saca(double valor) {
        double valorSaque = valor + 0.20;
        return super.saca(valorSaque);
    }

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.1;
    }
}
