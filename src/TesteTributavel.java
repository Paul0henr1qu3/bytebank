public class TesteTributavel {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Paulo Henrique");

        ContaCorrente cc = new ContaCorrente(42,42,cliente);
        cc.deposita(100);

        SeguroDeVida sv = new SeguroDeVida();

        CalculadorDeImposto ci = new CalculadorDeImposto();

        ci.registra(sv);
        ci.registra(cc);

        System.out.println("Total de Imposto: " + ci.getSomaImposto());

    }
}
