public class Diretor extends Funcionario implements Autenticavel {
    public Diretor(String nome) { super(nome); }
    @Override public void calcSalario() { System.out.println("Salário Diretor"); }
    @Override public void login() { System.out.println("Diretor logado"); }
    @Override public void exibirDados() { System.out.println("Diretor: " + nome); }
}