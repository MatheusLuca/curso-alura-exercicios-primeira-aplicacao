# Java Alura - Criando o Primeiro Programa

Projeto introdutório em Java desenvolvido durante os estudos na Alura.

## Sobre o projeto

Este projeto apresenta os primeiros conceitos da linguagem Java, incluindo:

- impressão de mensagens no console;
- declaração e uso de variáveis (`int`, `boolean`, `double`, `String`);
- cálculo de média;
- concatenação de textos;
- uso de **Text Blocks** (recurso do Java 15+).
- conversão de temperatura (Celsius para Fahrenheit).

Atualmente, o projeto possui duas classes de estudo:

- `src/Main.java`: prática de saída no console, variáveis, média e text block;
- `src/Exercicio1.java`: exercício de conversão de temperatura.

## Tecnologias

- Java 17+ (recomendado)
- IntelliJ IDEA (opcional, mas usado no projeto)

## Estrutura do projeto

```text
java-alura-criando-primeiro-programa/
├─ src/
│  ├─ Main.java
│  └─ Exercicio1.java
└─ README.md
```

## Como executar

### Opção 1: IntelliJ IDEA

1. Abra a pasta do projeto no IntelliJ.
2. Localize a classe `Main`.
3. Execute o método `main`.

### Opção 2: Terminal (Windows PowerShell)

No diretório raiz do projeto, execute:

```powershell
javac -d out src/Main.java src/Exercicio1.java
```

Para rodar o exemplo principal:

```powershell
java -cp out Main
```

Para rodar o exercício de conversão:

```powershell
java -cp out Exercicio1
```

## Saída esperada (resumo)

- `Main`: exibe informações de um filme (Top Gun: Maverick), ano de lançamento, média e sinopse formatada.
- `Exercicio1`: calcula e imprime a temperatura em Fahrenheit a partir de um valor em Celsius.

## Objetivo de aprendizado

Praticar a base da linguagem Java para evoluir para projetos mais completos com orientação a objetos e organização de código.
