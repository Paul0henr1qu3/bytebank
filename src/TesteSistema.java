public class TesteSistema {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Administrador adm = new Administrador();

        gerente.setSenha(2222);
        adm.setSenha(3333);

        SistemaInterno sys = new SistemaInterno();

        sys.autentica(gerente);
        sys.autentica(adm);

    }
}
