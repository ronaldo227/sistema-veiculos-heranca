# Sistema de Veículos com Herança em Java

## 📚 Informações Acadêmicas

**Instituição:** Ampli Anhanguera  
**Disciplina:** Linguagem Orientada a Objetos
**Aluno:**  Ronaldo



---

## 🎯 Objetivos

- Compreender os conceitos de herança em programação orientada a objetos
- Implementar classes utilizando herança para resolver um problema prático
- Identificar os benefícios e desafios na reutilização de código

---

## 📋 Descrição do Projeto

**Nome do Experimento:** Criando um Sistema de Veículos com Herança em Java

**Atividade Proposta:** Criar um sistema básico de gerenciamento de veículos utilizando herança.

Este projeto implementa um sistema básico de gerenciamento de veículos utilizando o conceito de **herança** em Java. O sistema demonstra como reutilizar código através da criação de uma classe base (`Veiculo`) e classes derivadas (`Carro` e `Moto`).

### Especificação da Atividade

1. **Criar uma classe `Veiculo`** com:
   - Atributos: `marca`, `modelo`, `ano`
   - Métodos: `exibirDetalhes()` (exibe as informações do veículo)

2. **Criar duas subclasses:**
   - `Carro`: com atributo adicional `numeroPortas`
   - `Moto`: com atributo adicional `cilindradas`

3. **Sobrescrever o método `exibirDetalhes()`** em cada subclasse para incluir os novos atributos

4. **Testar o sistema** criando objetos das classes `Carro` e `Moto` e chamando o método `exibirDetalhes()`

---

## 🏗️ Estrutura do Projeto

```
sistema-veiculos-heranca/
├── Veiculo.java      # Classe base com atributos e métodos comuns
├── Carro.java        # Subclasse que herda de Veiculo
├── Moto.java         # Subclasse que herda de Veiculo
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

## 📝 Procedimentos para Realização da Atividade

1. ✅ Criar um novo projeto em Java
2. ✅ Implementar a classe `Veiculo` com os atributos e métodos indicados
3. ✅ Criar as subclasses `Carro` e `Moto`, sobrescrevendo o método `exibirDetalhes()`
4. ✅ No método `main`, instanciar objetos das classes `Carro` e `Moto`
5. ✅ Executar o código e analisar os resultados no console

---

## ✅ Checklist de Implementação

- ✅ A classe `Veiculo` foi criada com os atributos `marca`, `modelo` e `ano`
- ✅ O método `exibirDetalhes()` foi implementado na classe `Veiculo`
- ✅ As subclasses `Carro` e `Moto` foram criadas corretamente
- ✅ Os métodos sobrescritos em `Carro` e `Moto` exibem as informações completas
- ✅ O programa roda sem erros e exibe os resultados esperados

---

## 🔍 Avaliação dos Resultados

### 1. Quais são as vantagens de utilizar herança no código desenvolvido?

**Resposta:**
- **Reutilização de Código:** Os atributos `marca`, `modelo` e `ano` foram definidos apenas uma vez na classe `Veiculo`, evitando duplicação de código
- **Organização:** A hierarquia de classes deixa claro que `Carro` e `Moto` são tipos específicos de `Veiculo`
- **Manutenibilidade:** Alterações nos atributos comuns precisam ser feitas apenas na classe pai
- **Extensibilidade:** É fácil adicionar novos tipos de veículos (ex: Caminhão, Ônibus) sem reescrever código

### 2. O que acontece se removermos o método sobrescrito `exibirDetalhes()` das subclasses?

**Resposta:**
Se removermos o método `exibirDetalhes()` das subclasses `Carro` e `Moto`, o programa ainda funcionará, porém:
- Será executado o método `exibirDetalhes()` da classe pai `Veiculo`
- As informações específicas (`numeroPortas` e `cilindradas`) **NÃO serão exibidas**
- Apenas os atributos comuns (`marca`, `modelo`, `ano`) serão mostrados
- Perde-se o objetivo da especialização das subclasses

### 3. Quais foram os desafios ao implementar as subclasses?

**Resposta:**
- **Compreender a sintaxe de herança:** Uso correto da palavra-chave `extends`
- **Acesso aos atributos da superclasse:** Entender o uso de `protected` para permitir acesso nas subclasses
- **Sobrescrita de métodos:** Utilizar corretamente a anotação `@Override` e reimplementar o método
- **Chamada ao construtor da superclasse:** Uso da palavra-chave `super()` para inicializar atributos herdados
- **Decidir o que deve ser herdado:** Identificar quais atributos e métodos são comuns a todos os veículos

---

## 📊 Resultados do Experimento

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

## 🎓 Resultados de Aprendizagem

Ao concluir esta atividade prática, foram desenvolvidas as seguintes competências:

1. **Habilidade de criar hierarquias de classes com herança**
   - Compreensão da relação "é um" (is-a) entre classes
   - Implementação correta de classes pai e classes filhas
   - Uso adequado da palavra-chave `extends`

2. **Entendimento de reutilização de código**
   - Identificação de atributos e comportamentos comuns
   - Redução de duplicação através da herança
   - Melhoria na organização e manutenção do software

3. **Identificação de limitações e cuidados**
   - Reconhecimento de quando usar herança apropriadamente
   - Compreensão dos desafios de manutenção em hierarquias profundas
   - Avaliação crítica sobre a aplicação de herança em sistemas reais

---

## 📚 Conclusão

O experimento demonstrou com sucesso a aplicação prática do conceito de **herança** em programação orientada a objetos. A implementação do sistema de veículos permitiu observar como a herança facilita a reutilização de código e a organização de sistemas de software.

Os principais aprendizados incluem:
- A herança promove código mais limpo e organizado
- A sobrescrita de métodos permite especialização de comportamentos
- O uso adequado de modificadores de acesso (`protected`, `private`) é essencial
- A herança deve ser aplicada quando existe uma relação clara de especialização

Este projeto serve como base sólida para compreensão de conceitos mais avançados de orientação a objetos, como polimorfismo e classes abstratas.

---

## 📖 Referências Bibliográficas

DEITEL, Paul; DEITEL, Harvey. **Java: Como Programar**. 10. ed. São Paulo: Pearson, 2016.

ORACLE. **The Java™ Tutorials: Inheritance**. Disponível em: https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html. Acesso em: 13 nov. 2025.

SIERRA, Kathy; BATES, Bert. **Use a Cabeça! Java**. 2. ed. Rio de Janeiro: Alta Books, 2013.

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

## 📝 Autor

Projeto desenvolvido como atividade prática da disciplina de Linguagem Orientada a Objetos da **Ampli Anhanguera**.

---

## 📄 Licença

Este projeto é de uso educacional.
