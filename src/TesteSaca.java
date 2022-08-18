public class TesteSaca {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        ContaCorrente cc = new ContaCorrente(42,42,cliente);

        cc.deposita(200);

        try{
            cc.saca(199);
        } catch (SaldoInsuficienteException si){
            System.out.println(si.getMessage());
        }


        System.out.println(cc.getSaldo());

    }
}
