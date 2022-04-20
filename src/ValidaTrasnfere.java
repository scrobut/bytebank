public class ValidaTrasnfere {
    public static void main(String[] args) {
        Conta contaDoDiogo = new Conta(123, 3131);
        Cliente diogo = new Cliente();
        diogo.setCpf("08630229950");

        System.out.println(diogo.getCpf());
        System.out.println(contaDoDiogo.getNumero());

    }

}
