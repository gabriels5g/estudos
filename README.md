# 📘 Operadores Lógicos e Decisões em Java — Bibi ❤️

## Introdução
Material para o meu amor que faltou na aula 💕  
Vou explicar passo a passo sobre:
- Operadores lógicos
- Como usar if/else em Java
- Exemplos práticos (triângulos, média/notas)

Explicação simples, com exemplos e fluxogramas.

---

## 🎯 Objetivos do documento
- Entender o que são operadores lógicos e relacionais.  
- Ela não se matar no dia da prova  
- Eu receber beijinhos  

---

## 🔹 Operadores relacionais (comparações básicas)
Estes operadores comparam valores e devolvem verdadeiro (`true`) ou falso (`false`):

- `=`  : Atribuição (usado para definir o valor de uma variável). Ex: `x = 5;`  
- `==` : Igualdade (compara dois valores). Ex: `(x == y)`  
- `!=` :  Diferente. Ex: `(a != b)`  
- `>`  : Maior que. Ex: `(a > b)`  
- `<`  : Menor que. Ex: `(a < b)`  
- `>=` : Maior ou igual. Ex: `(a >= 10)`  
- `<=` : Menor ou igual. Ex: `(b <= 3)`

⚠️ Importante: usar `==` ao comparar valores; usar `=` apenas quando quiser **atribuir**.

### Exemplo rápido:
```java
int x = 5;
int y = 5;

if (x == y) {
    System.out.println("x e y são iguais");
} else {
    System.out.println("são diferentes");
}
```

---

## 🔹 Operadores lógicos (juntando condições)
Operadores lógicos permitem combinar várias condições (por exemplo dentro de um `if`):

- `&&` : **E lógico** — todas as condições precisam ser verdadeiras.  
- `||` : **OU lógico** — basta uma condição ser verdadeira.  
- `!`  : **NÃO lógico** — inverte o valor lógico.  

### Exemplo:
```java
int idade = 20;
boolean carteira = true;

if (idade >= 18 && carteira) {
    System.out.println("Pode dirigir");
}

if (idade >= 18 || carteira) {
    System.out.println("Pelo menos uma condição verdadeira");
}

if (!(idade < 18)) {
    System.out.println("Idade não é menor que 18");
}
```

---

## 🔹 Identificando Triângulos
Para identificar o tipo de triângulo usamos comparações entre os lados `A`, `B` e `C`.  
Antes de classificar, sempre verifique se é válido: **nenhum lado pode ser ≥ à soma dos outros dois**.

### Código exemplo:
```java
import java.util.Scanner;

public class Classe1 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    double a, b, c;
    System.out.print("Digite o lado A:"); a = leitor.nextDouble();
    System.out.print("Digite o lado B:"); b = leitor.nextDouble();
    System.out.print("Digite o lado C:"); c = leitor.nextDouble();

    if (a >= b + c || b >= a + c || c >= a + b) {
      System.out.println("Não é um triângulo");
    } else if (a == b && b == c) {
      System.out.println("Triângulo Equilátero");
    } else if (a == b || a == c || b == c) {
      System.out.println("Triângulo Isósceles");
    } else {
      System.out.println("Triângulo Escaleno");
    }
    leitor.close();
  }
}
```

---

## 🔹 PI — Regras de aprovação (média e faltas)
No PDF foi pedido para calcular a **média geométrica**, mas normalmente usamos a **aritmética**.  

- Média aritmética: `(n1 + n2) / 2`  
- Média geométrica: `Math.sqrt(n1 * n2)`  

### Código corrigido:
```java
import java.util.Scanner;

public class PI_Corrigido {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    String nome;
    double n1, n2;
    int faltas;

    System.out.print("Nome do aluno: ");
    nome = leitor.nextLine();
    System.out.print("Valor da n1: ");
    n1 = leitor.nextDouble();
    System.out.print("Valor da n2: ");
    n2 = leitor.nextDouble();
    System.out.print("Quantidade de faltas: ");
    faltas = leitor.nextInt();

    if (n1 < 0 || n2 < 0 || faltas < 0) {
      System.out.println("Entrada inválida: valores não podem ser negativos.");
      leitor.close();
      return;
    }

    double mediaArit = (n1 + n2) / 2.0;
    // double mediaGeo = Math.sqrt(n1 * n2);

    String situacao;
    if (faltas > 20) {
      situacao = "Reprovado por faltas";
    } else if (mediaArit < 3.0) {
      situacao = "Reprovado por notas";
    } else if (mediaArit >= 3.0 && mediaArit < 5.0) {
      situacao = "Aluno de recuperação";
    } else if (mediaArit >= 5.0 && mediaArit < 6.0) {
      situacao = "Aluno de exame";
    } else {
      situacao = "Aprovado";
    }

    System.out.printf("Aluno: %s\nMédia final: %.2f\nSituação: %s\n",
                      nome, mediaArit, situacao);
    leitor.close();
  }
}
```

### Por que corrigimos assim?
- ✔️ Validação de entradas (evita notas negativas).  
- ✔️ Ordem das condições (faltas primeiro).  
- ✔️ Uso correto de intervalos (`>=` e `<`).  

---

## 📚 Atividades (com dicas)
1. Polígonos:  
   - 3 lados → Triângulo (usar Teorema de Heron).  
   - 4 lados → Quadrado (área = lado²).  
   - 5 lados → Pentágono (usar apótema ou dividir em triângulos).  
   - < 3 lados → Não é polígono.  
   - > 5 lados → Polígono não identificado.  

2. Maior entre 3 números (usar if/else encadeado).  
3. Triângulo: verificar e classificar.  

---

## ⚠️ Erros comuns
- Usar `=` em vez de `==`.  
- Não validar entradas.  
- Errar limites (3.0, 5.0, 6.0).  
- Não fechar `Scanner`.  
- Não testar casos de borda.  

---

## ✅ Conclusão
Esse material foi feito com carinho pra você ❤️  
Com ele, você tem passo a passo, exemplos de código e dicas para se dar bem.  

Agora só falta uma coisa: **beijinhos de recompensa** 😘
