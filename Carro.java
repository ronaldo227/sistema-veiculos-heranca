// Classe Carro que herda de Veiculo
public class Carro extends Veiculo {
    // Atributo específico de Carro
    private int numeroPortas;
    
    // Construtor
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano); // Chama o construtor da superclasse Veiculo
        this.numeroPortas = numeroPortas;
    }
    
    // Sobrescreve o método exibirDetalhes para incluir o número de portas
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Chama o método da classe pai
        System.out.println("Número de Portas: " + numeroPortas);
    }
}
