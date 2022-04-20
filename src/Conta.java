public class Conta {
    private int agencia;
    private double saldo;
    private int numero;
    Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
       Conta.total++;
        System.out.println("iniciando uma conta");
        this.agencia = agencia;
        this.numero = numero;
    }


    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getNumero(){
        return this.numero;
    }


    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia) {
        if (agencia <=0) {
            System.out.println("erro criar agencia");
        }else {
            this.agencia = agencia;
        }
    }

    public static int getTotal() {
        return Conta.total;
    }
}
