// Classe Moto que herda de Veiculo
public class Moto extends Veiculo {
    // Atributo específico de Moto
    private int cilindradas;
    
    // Construtor
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano); // Chama o construtor da superclasse Veiculo
        this.cilindradas = cilindradas;
    }
    
    // Sobrescreve o método exibirDetalhes para incluir as cilindradas
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Chama o método da classe pai
        System.out.println("Cilindradas: " + cilindradas);
    }
}
