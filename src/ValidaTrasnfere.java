public class ValidaTrasnfere {
    public static double main(String[] args) {
        Conta contaDoDiogo = new Conta();
        contaDoDiogo.saldo = 100;
        contaDoDiogo.transfere(50);
        return contaDoDiogo.saldo;
    }

}
