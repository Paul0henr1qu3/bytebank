public class CalculadorDeImposto {

    private double somaImposto;

    public void registra(Tributavel tributavel){
        double valor = tributavel.pegaValorImposto();
        this.somaImposto += valor;
    }

    public double getSomaImposto() {
        return somaImposto;
    }
}
