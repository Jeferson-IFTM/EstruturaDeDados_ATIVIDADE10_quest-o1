# Algoritmo de Inserção Ordenada Decrescente em Java

Este projeto faz parte de uma atividade de Estrutura de Dados que demonstra como inserir elementos em um vetor (array) mantendo-os sempre organizados em ordem decrescente (do maior para o menor) no momento da inserção.

## 📌 Sobre o Projeto

O objetivo principal é evitar o uso de algoritmos de ordenação tradicionais (como Sort) após a inserção. Em vez disso, o código encontra a posição correta de cada número antes de inseri-lo, deslocando os elementos menores para a direita.

## 🚀 Como funciona

1.  O sistema inicia com um vetor vazio de tamanho fixo (5 posições).
2.  A cada nova inserção, o método verifica:
    -   Se há espaço no vetor.
    -   Qual a posição correta do novo elemento para manter a ordem decrescente.
3.  Elementos menores que o novo item são "empurrados" para a próxima posição.
4.  O novo item é colocado na vaga aberta.

## 📂 Estrutura do Código

O projeto é composto por duas classes principais:

* **`Inserir.java`**: Contém a lógica de busca de posição e deslocamento (Shift).
* **`Atividade1.java`**: Classe principal (Main) que executa os testes e exibe o resultado no console.

## 🛠️ Exemplo de Execução

Ao inserir os números `10, 50, 30, 40` sequencialmente, o comportamento interno é:

1.  Insere `10`: `[10]`
2.  Insere `50`: Move o 10 para o lado -> `[50, 10]`
3.  Insere `30`: Coloca entre o 50 e o 10 -> `[50, 30, 10]`
4.  Insere `40`: Move o 30 e 10 para o lado -> `[50, 40, 30, 10]`

**Saída esperada:**
```text
Vetor ordenado de forma decrescente:
50 40 30 10
