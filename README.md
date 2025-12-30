# 🎲 Simulador RPG com Testes Unitários

## 📌 Sobre o Projeto

O **Simulador RPG com Testes Unitários** é um projeto desenvolvido em **Java** com foco em **boas práticas de programação**, **orientação a objetos** e **testes unitários automatizados**.

O projeto simula mecânicas clássicas de RPG, como cálculo de atributos e regras básicas de jogo, servindo como um **projeto educacional** para estudo de lógica, organização de código e testes com **JUnit**.

Este repositório também é utilizado como prática para versionamento com **Git/GitHub** e execução de testes automatizados com **Maven**.

---

## 🎯 Objetivos

- Praticar **Java Orientado a Objetos**
- Aplicar **testes unitários** de forma correta
- Garantir código limpo, testável e organizado
- Simular regras comuns de jogos de RPG
- Servir como projeto de estudo e portfólio

---

## 🧠 Funcionalidades

- 🎲 Cálculo de atributos de personagem
- 📊 Manipulação de listas de valores
- 🧪 Testes unitários cobrindo regras de negócio
- 📦 Estrutura de projeto padrão Maven
- ✅ Código validado por testes automatizados

---

## 🛠️ Tecnologias Utilizadas

- ☕ **Java 11+**
- 📦 **Maven**
- 🧪 **JUnit 5**
- 🔧 **Git & GitHub**

---

## 🚀 Como Executar o Projeto

### 📋 Pré-requisitos

Antes de começar, certifique-se de ter instalado:

- Java 11 ou superior  
- Maven  
- Git  

---

### 📥 Clonar o repositório

git clone https://github.com/rogerwendell284/simulador-rpg-tests-unitarios.git

cd simulador-rpg-tests-unitarios

▶️ Compilar o projeto
mvn clean install

🧪 Executar os testes
mvn test

📂 Estrutura do Projeto
simulador-rpg-tests-unitarios/
├── src/
│   ├── main/
│   │   └── java/        # Código-fonte principal
│   └── test/
│       └── java/        # Testes unitários
├── pom.xml              # Configuração do Maven
├── .gitignore
└── README.md

📌 Exemplo de Regra Testada

Exemplo de teste unitário aplicado no projeto:

@Test
@DisplayName("Ability uses 3 largest numbers from scores in descending order")
public void testAbilityCalculationsUses3LargestNumbersFromScoresInDescendingOrder() {
    assertThat(dndCharacter.ability(List.of(4, 3, 2, 1))).isEqualTo(9);
}


Esse teste garante que o método utilize os três maiores valores da lista para o cálculo da habilidade.

📈 Testes Unitários

Os testes têm como objetivo:

Validar regras de negócio

Evitar regressões no código

Garantir resultados esperados

Facilitar refatorações futuras

Todos os testes são executados automaticamente via Maven.

🧩 Possíveis Melhorias Futuras

Adição de mais regras de RPG

Criação de classes de personagens

Simulação de batalhas

Aumento da cobertura de testes

Integração com CI (GitHub Actions)

👨‍💻 Autor
Desenvolvido por Roger Wendell
Projeto criado com foco em aprendizado, prática de testes unitários e construção de portfólio para oportunidades na área de desenvolvimento.

🤝 Contribuições

Contribuições são bem-vindas!
Sinta-se à vontade para abrir uma issue ou enviar um pull request.
