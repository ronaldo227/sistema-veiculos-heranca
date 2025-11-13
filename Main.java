// Classe principal para testar o sistema de herança
public class Main {
    public static void main(String[] args) {
        // Criando e exibindo um objeto Carro
        Carro carro = new Carro("Toyota", "Corolla", 2023, 4);
        System.out.println("\n--- Carro ---");
        carro.exibirDetalhes();
        carro.ligar();
        carro.acelerar();
        carro.desligar();
        
        // Criando e exibindo um objeto Moto
        Moto moto = new Moto("Honda", "CB 500", 2023, 500);
        System.out.println("\n--- Moto ---");
        moto.exibirDetalhes();
        moto.ligar();
        moto.acelerar();
        moto.desligar();
    }
}
