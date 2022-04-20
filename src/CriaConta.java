public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(123,123);
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
    }
}
