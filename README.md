# Simulador de Batalha RPG

Este é um simples simulador de batalha RPG de linha de comando escrito em Java.

## Funcionalidades

*   Escolha entre 4 classes de personagens: Guerreiro, Mago, Ladino e Arqueiro.
*   Participe de uma batalha simulada entre dois personagens.
*   Acompanhe o desenrolar da batalha através das mensagens no console.

## Como Executar

### Pré-requisitos

*   Java 11 ou superior
*   Maven

### Passos

1.  Clone o repositório:
    ```sh
    git clone <URL_DO_REPOSITORIO>
    ```
2.  Navegue até o diretório do projeto:
    ```sh
    cd simulador-rpg-tests-unitarios
    ```
3.  Compile o projeto e execute os testes usando o Maven:
    ```sh
    mvn -f br/com/rogerWendell/demo/pom.xml clean install
    ```
4.  Execute a aplicação:
    ```sh
    java -cp br/com/rogerWendell/demo/target/classes App
    ```

## Estrutura do Projeto

*   `src/main/java/App.java`: O ponto de entrada da aplicação, contém a lógica principal do simulador.
*   `src/main/java/simuladorRpg/Character.java`: Define a classe `Character` com seus atributos e métodos.
*   `src/test/java/tests/CharacterTest.java`: Contém os testes unitários para a classe `Character`.
*   `pom.xml`: O arquivo de configuração do Maven para o projeto.
