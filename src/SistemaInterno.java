public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);

        if(autenticou){
            System.out.println("Acess Granted!");
        } else{
            System.out.println("Acess Denied!");
        }
    }

}
