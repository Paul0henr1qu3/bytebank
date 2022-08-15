public class Administrador extends Funcionario implements Autenticavel{

    private int senha;

    private AutenticacaoUtil authUtil;

    public Administrador(){
        this.authUtil = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.authUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        boolean autenticou = this.authUtil.autentica(senha);
        return autenticou;
    }
}
