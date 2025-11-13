// Classe pai que representa um veículo genérico
public class Veiculo {
    // Atributos protegidos para serem acessados pelas subclasses
    protected String marca;
    protected String modelo;
    protected int ano;
    
    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    // Método para exibir detalhes do veículo
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    
    // Métodos comuns a todos os veículos
    public void ligar() {
        System.out.println("Veículo ligado");
    }
    
    public void desligar() {
        System.out.println("Veículo desligado");
    }
    
    public void acelerar() {
        System.out.println("Veículo acelerando");
    }
}
