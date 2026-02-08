public class Diretor extends Funcionario implements Autenticavel {
    @Override
    public void calcSalario() {
        System.out.println("Salário do Diretor: Fixo + Participação nos Lucros.");
    }

    @Override
    public void login() {
        System.out.println("Diretor logado com sucesso (Acesso Total).");
    }
}