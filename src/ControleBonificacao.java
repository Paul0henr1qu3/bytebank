public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario funcionario){
        double bonificacao = funcionario.getBonificacao();
        System.out.println(bonificacao);
        this.soma += bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
