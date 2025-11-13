# Sistema de Veículos com Herança em Java

## 📚 Informações Acadêmicas

**Instituição:** Ampli Anhanguera  
**Disciplina:** Linguagem Orientada a Objetos

---

## 🎯 Objetivos

- Compreender os conceitos de herança em programação orientada a objetos
- Implementar classes utilizando herança para resolver um problema prático
- Identificar os benefícios e desafios na reutilização de código

---

## 📋 Descrição do Projeto

Este projeto implementa um sistema básico de gerenciamento de veículos utilizando o conceito de **herança** em Java. O sistema demonstra como reutilizar código através da criação de uma classe base (`Veiculo`) e classes derivadas (`Carro` e `Moto`).

---

## 🏗️ Estrutura do Projeto

```
sistema-veiculos-heranca/
├── Veiculo.java      # Classe base com atributos e métodos comuns
├── Carro.java        # Subclasse que herda de Veiculo
├── Moto.java         # Subclasse que herda de Veiculo
├── Dirigivel.java    # Interface para veículos dirigíveis
└── Main.java         # Classe principal para testes
```

---

## 🔧 Componentes do Sistema

### 1. Classe `Veiculo` (Classe Base)

**Atributos:**
- `marca` (String): Marca do veículo
- `modelo` (String): Modelo do veículo
- `ano` (int): Ano de fabricação

**Métodos:**
- `exibirDetalhes()`: Exibe as informações básicas do veículo

### 2. Classe `Carro` (Subclasse)

**Atributos adicionais:**
- `numeroPortas` (int): Quantidade de portas do carro

**Métodos sobrescritos:**
- `exibirDetalhes()`: Exibe informações do carro incluindo o número de portas

### 3. Classe `Moto` (Subclasse)

**Atributos adicionais:**
- `cilindradas` (int): Cilindradas do motor da moto

**Métodos sobrescritos:**
- `exibirDetalhes()`: Exibe informações da moto incluindo as cilindradas

### 4. Interface `Dirigivel`

Define métodos comuns para veículos dirigíveis:
- `acelerar()`
- `frear()`
- `virar()`

---

## 💻 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior instalado
- Compilador Java (javac)

### Compilação e Execução

1. **Compilar todos os arquivos:**
```bash
javac *.java
```

2. **Executar o programa:**
```bash
java Main
```

---

## 📊 Exemplo de Saída

```
=== Informações dos Veículos ===

--- Detalhes do Carro ---
Marca: Toyota
Modelo: Corolla
Ano: 2023
Número de Portas: 4
Acelerando o carro...
Freando o carro...
Virando o carro...

--- Detalhes da Moto ---
Marca: Honda
Modelo: CB 500
Ano: 2022
Cilindradas: 500
Acelerando a moto...
Freando a moto...
Virando a moto...
```

---

## 🎓 Conceitos Aplicados

### Herança
- A classe `Veiculo` serve como superclasse
- `Carro` e `Moto` herdam atributos e métodos de `Veiculo`
- Permite reutilização de código e organização hierárquica

### Sobrescrita de Métodos (Override)
- Subclasses redefinem o método `exibirDetalhes()`
- Uso da anotação `@Override` para maior clareza
- Permite comportamento específico para cada tipo de veículo

### Interface
- `Dirigivel` define um contrato para veículos dirigíveis
- Todas as classes que implementam devem fornecer os métodos
- Promove polimorfismo e flexibilidade

### Encapsulamento
- Atributos privados (`private`)
- Acesso via construtor e métodos públicos

---

## ✅ Benefícios da Herança Observados

1. **Reutilização de Código**: Atributos comuns definidos uma única vez
2. **Manutenibilidade**: Alterações na classe base refletem nas subclasses
3. **Organização**: Estrutura hierárquica clara e lógica
4. **Extensibilidade**: Fácil adicionar novos tipos de veículos

---

## 🚀 Possíveis Extensões

- Adicionar mais tipos de veículos (Caminhão, Ônibus, etc.)
- Implementar métodos para cálculo de consumo de combustível
- Criar sistema de registro e busca de veículos
- Adicionar validações nos construtores
- Implementar persistência de dados

---

## 📝 Autor

Projeto desenvolvido como atividade prática da disciplina de Linguagem Orientada a Objetos da **Ampli Anhanguera**.

---

## 📄 Licença

Este projeto é de uso educacional.
