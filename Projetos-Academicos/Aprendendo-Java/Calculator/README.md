# Calculadora de Linha de Comando (CLI) em Java

Este é um projeto simples, parte da minha trilha de estudos "Aprendendo Java". O objetivo é construir uma calculadora que funciona inteiramente pelo terminal.

## O que o projeto faz?

O programa `cliCalculator.java` executa os seguintes passos:

1.  Solicita ao usuário que insira o primeiro número.
2.  Solicita ao usuário que escolha uma operação matemática (por exemplo: +, -, \*, /).
3.  Solicita ao usuário que insira o segundo número.
4.  Calcula o resultado da operação.
5.  Exibe o resultado formatado no console.

## Habilidades Praticadas

Ao construir este projeto, pude praticar e solidificar os seguintes conceitos fundamentais do Java:

* **Recebimento de Dados do Usuário:** Uso da classe `java.util.Scanner` para ler a entrada do usuário (números e o operador) diretamente do console.
* **Variáveis e Tipos Primitivos:** Declaração de variáveis (provavelmente `double` para os números, para aceitar casas decimais, e `String` ou `char` para o operador).
* **Operadores Aritméticos:** Utilização dos operadores `+`, `-`, `*` e `/` para realizar os cálculos.
* **Estruturas Condicionais:** Uso da estrutura `switch` (ou `if-else if-else`) para determinar qual operação matemática deve ser executada com base na entrada do usuário.
* **Estrutura Básica de Classes:** Organização do código dentro de uma classe e o uso do método `public static void main(String[] args)` como ponto de entrada da aplicação.
* **Saída de Dados:** Uso de `System.out.println()` para exibir os prompts de comando e o resultado final.

## Como Compilar e Executar

1.  **Compilar o arquivo:**
    ```bash
    javac cliCalculator.java
    ```

2.  **Executar o programa:**
    ```bash
    java cliCalculator
    ```
