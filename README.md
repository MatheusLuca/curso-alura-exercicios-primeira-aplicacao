# Java Alura - Criando o Primeiro Programa

Projeto introdutório em Java desenvolvido durante os estudos na Alura.

## Sobre o projeto

Este repositório reúne exercícios e exemplos que cobrem:

- saída no console e formatação (`printf`);
- variáveis (`int`, `boolean`, `double`, `String`, `char`);
- cálculo de média e operações numéricas;
- **Text Blocks** (Java 15+);
- conversão de temperatura (Celsius → Fahrenheit);
- estruturas condicionais (`if` / `else`);
- menu interativo com `switch` e leitura do teclado (`Scanner`);
- laço `while`, números aleatórios (`Random`) e jogo de adivinhação.

## Classes em `src/`

| Arquivo | Descrição |
|--------|-----------|
| `Main.java` | Exemplo “Screen Match”: filme, ano, média de notas e sinopse com text block. |
| `Exercicio1.java` | Conversão de temperatura de Celsius para Fahrenheit. |
| `Condicional.java` | Condicionais: ano de lançamento e liberação do filme conforme plano. |
| `Desafios.java` | Menu numérico com 6 mini-exercícios (média, casting, `char`/`String`, preço × quantidade, dólar → real, desconto). |
| `JogoAdivinhacao.java` | Jogo: adivinhar um número entre 0 e 99 com até 5 tentativas. |

## Tecnologias

- Java 17+ (recomendado; text blocks exigem Java 15+)
- IntelliJ IDEA (projeto já configurado com `.idea/` e `.iml`)

## Estrutura do projeto

```text
java-alura-criando-primeiro-programa/
├─ src/
│  ├─ Main.java
│  ├─ Exercicio1.java
│  ├─ Condicional.java
│  ├─ Desafios.java
│  └─ JogoAdivinhacao.java
├─ README.md
└─ java-alura-criando-primeiro-programa.iml
```

## Como executar

### Opção 1: IntelliJ IDEA

1. Abra a pasta do projeto no IntelliJ.
2. Abra a classe que deseja rodar (`Main`, `Exercicio1`, `Condicional`, `Desafios` ou `JogoAdivinhacao`).
3. Execute o método `main` (ícone de play ao lado da classe ou do método).

### Opção 2: Terminal (Windows PowerShell)

No diretório raiz do projeto, compile todas as classes:

```powershell
javac -d out src/Main.java src/Exercicio1.java src/Condicional.java src/Desafios.java src/JogoAdivinhacao.java
```

Execute informando o **nome da classe** (sem `.java`):

```powershell
java -cp out Main
java -cp out Exercicio1
java -cp out Condicional
java -cp out Desafios
java -cp out JogoAdivinhacao
```

`Desafios` e `JogoAdivinhacao` pedem entrada pelo teclado após iniciar.

**Observação:** é necessário ter o JDK instalado e `javac`/`java` disponíveis no `PATH` do sistema.

## Saída esperada (resumo)

- **Main**: mensagens sobre o filme Top Gun: Maverick, média e sinopse em bloco de texto.
- **Exercicio1**: um número (Fahrenheit) correspondente à conversão do Celsius definido no código.
- **Condicional**: mensagens sobre filme “retro” ou lançamento e sobre liberação ou cobrança conforme regras do plano.
- **Desafios**: menu; conforme o número escolhido (1–6), um dos mini-exercícios é executado (parte deles usa valores fixos no código).
- **JogoAdivinhacao**: mensagens pedindo número e indicando se o palpite é maior ou menor, até acertar ou esgotar tentativas.

## Objetivo de aprendizado

Consolidar a base da linguagem Java (tipos, entrada/saída, condicionais, laços e bibliotecas simples) como preparação para orientação a objetos e projetos maiores.
