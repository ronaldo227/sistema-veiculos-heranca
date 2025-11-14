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
        super.exibirDetalhes(); // Chama o método da classe pai para exibir os detalhes básicos
        System.out.println("Cilindradas: " + cilindradas);
    }
    
    // Sobrescreve os métodos para comportamento específico da Moto
    @Override
    public void ligar() {
        System.out.println("Moto ligada - Motor 2 rodas ronronnando");
    }
    
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando rapidamente");
    }
}
