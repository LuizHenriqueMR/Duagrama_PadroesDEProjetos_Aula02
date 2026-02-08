public class Main {
    public static void main(String[] args) {
        // Agora você PRECISA passar um nome entre aspas, 
        // porque criamos o construtor que exige isso.
        
        Diretor dir = new Diretor("Carlos Alberto");
        Secretario sec = new Secretario("Ana Paula");
        Gerente ger = new Gerente("Ricardo Souza");
        Engenheiro eng = new Engenheiro("Roberto Silva");
        Cliente cli = new Cliente("Loja de Materiais Ltda");

        System.out.println("=== RELATÓRIO DE DADOS ===");
        dir.exibirDados();
        sec.exibirDados();
        eng.exibirDados();

        System.out.println("\n=== TESTANDO SISTEMA DE LOGIN ===");
        dir.login();
        ger.login();
        cli.login();
        
   
    }
}