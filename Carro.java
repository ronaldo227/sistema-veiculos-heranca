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
        super.exibirDetalhes(); // Chama o método da classe pai para exibir os detalhes básicos
        System.out.println("Número de Portas: " + numeroPortas);
    }
    
    // Sobrescreve os métodos para comportamento específico do Carro
    @Override
    public void ligar() {
        System.out.println("Carro ligado - Motor 4 rodas em funcionamento");
    }
    
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando suavemente");
    }
}
