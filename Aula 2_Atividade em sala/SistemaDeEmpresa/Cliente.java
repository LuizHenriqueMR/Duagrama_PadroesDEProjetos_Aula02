public class Cliente extends Pessoa implements Autenticavel {
    public Cliente(String nome) { super(nome); }
    @Override public void login() { System.out.println("Cliente logado"); }
    @Override public void exibirDados() { System.out.println("Cliente: " + nome); }
}