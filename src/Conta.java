public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero, Cliente titular){
        Conta.total++;
        System.out.println("Total de Contas abertas: " + Conta.totalContasAbertas());
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public abstract void deposita(double valor);

    public int getNumero() {
        return numero;
    }

    public boolean saca(double valor){

        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }

        return false;

    }

    public boolean transfere(Conta contaDestino, double valor){

        if(saca(valor)){

            contaDestino.deposita(valor);
            return true;
        }

        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int totalContasAbertas(){
        return Conta.total;

    }


}
