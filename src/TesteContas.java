public class TesteContas {

    public static void main(String[] args) {

        ContaCorrente outra = null;

        int numero = 3;

        try{
            int divisao = numero/ 0;

            System.out.println(divisao);

            outra.deposita(500);
        }catch(Exception e){
            System.out.println(e);
        }

        Cliente cliente = new Cliente();
        cliente.setNome("Paulo Henrique");

        ContaCorrente cc = new ContaCorrente(42,42,cliente);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(12, 12,cliente);
        cp.deposita(200);

        cc.transfere(cp,50);

        System.out.println("CP: " + cp.getSaldo());
        System.out.println("CC: " + cc.getSaldo());
    }
}
