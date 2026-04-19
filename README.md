# Java Alura - Criando o Primeiro Programa

Projeto introdutório em Java desenvolvido durante os estudos na Alura.

## Sobre o projeto

Este projeto apresenta os primeiros conceitos da linguagem Java, incluindo:

- impressão de mensagens no console;
- declaração e uso de variáveis (`int`, `boolean`, `double`, `String`);
- cálculo de média;
- concatenação de textos;
- uso de **Text Blocks** (recurso do Java 15+).

Atualmente, o código principal está em `src/Main.java`.

## Tecnologias

- Java 17+ (recomendado)
- IntelliJ IDEA (opcional, mas usado no projeto)

## Estrutura do projeto

```text
java-alura-criando-primeiro-programa/
├─ src/
│  └─ Main.java
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
javac -d out src/Main.java
java -cp out Main
```

## Saída esperada (resumo)

O programa exibe no console informações de um filme (Top Gun: Maverick), incluindo ano de lançamento, média de notas e uma sinopse formatada.

## Objetivo de aprendizado

Praticar a base da linguagem Java para evoluir para projetos mais completos com orientação a objetos e organização de código.
