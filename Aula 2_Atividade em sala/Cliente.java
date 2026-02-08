public class Cliente extends Pessoa implements Autenticavel {
    public Cliente(String nome, String documento) {
        super(nome, documento);
    }

    @Override
    public void login() {
        System.out.println("Cliente " + nome + " logado no portal.");
    }

    @Override
    public void exibirDados() {
        System.out.println("Cliente: " + nome + " | CPF: " + documento);
    }
}