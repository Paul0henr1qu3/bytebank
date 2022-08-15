public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    private AutenticacaoUtil authUtil;

    public Gerente(){
        this.authUtil = new AutenticacaoUtil();
    }
    @Override
    public double getBonificacao(){
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.authUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        boolean autenticou = this.authUtil.autentica(senha);
        return false;
    }
}
