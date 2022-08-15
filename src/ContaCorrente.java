public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero, Cliente titular){
        super(agencia, numero, titular);
    }

    @Override
    public boolean saca(double valor){
        double taxa = valor * 0.02;
        double valorComTaxa = valor + taxa;

        return super.saca(valorComTaxa);
    }

    @Override
    public void deposita(double valor){
        super.saldo += valor;
    }

    @Override
    public double pegaValorImposto() {
        return super.saldo * 0.01;
    }
}
