#  Operadores Lógicos e Decisões em Java — Bibi ❤️

## Introdução
Material para o meu amor que faltou na aula 💕  
Vou explicar passo a passo sobre:
- Operadores lógicos
- Como usar if/else em Java
- Exemplos práticos (triângulos, média/notas)


---

##  Objetivos do documento
- Entender o que são operadores lógicos e relacionais.  
- Ela não se matar no dia da prova  
- Eu receber beijinhos  

---

##  Operadores relacionais (comparações básicas)
Estes operadores comparam valores e devolvem verdadeiro (`true`) ou falso (`false`):

- `=`  : Atribuição (usado para definir o valor de uma variável). Ex: `x = 5;`  
- `==` : Igualdade (compara dois valores). Ex: `(x == y)`  
- `!=` :  Diferente. Ex: `(a != b)`  
- `>`  : Maior que. Ex: `(a > b)`  
- `<`  : Menor que. Ex: `(a < b)`  
- `>=` : Maior ou igual. Ex: `(a >= 10)`  
- `<=` : Menor ou igual. Ex: `(b <= 3)`

Importante: usar `==` ao comparar valores; usar `=` apenas quando quiser **atribuir**.

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

##  Operadores lógicos (juntando condições)
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

##  Identificando Triângulos
Para identificar o tipo de triângulo usamos comparações entre os lados `A`, `B` e `C`.  
Antes de classificar, sempre verifique se é válido: **nenhum lado pode ser maior ou igual à soma dos outros dois**.

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

##  PI — Regras de aprovação (média e faltas)
Foi pedido para calcular a **média geométrica**, mas normalmente usamos a **aritmética**.  

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

### Explição ai:
- ✔️ Validação de entradas (evita notas negativas).  
- ✔️ Ordem das condições (faltas primeiro).  
- ✔️ Uso correto de intervalos (`>=` e `<`).  

---

## Atividades
1. Polígonos:  
   - 3 lados → Triângulo (usar Teorema de Heron).  
   - 4 lados → Quadrado (área = lado²).  
   - 5 lados → Pentágono (usar apótema ou dividir em triângulos).  
   - < 3 lados → Não é polígono.  
   - > 5 lados → Polígono não identificado.  

2. Maior entre 3 números (usar if/else encadeado).  
3. Triângulo: verificar e classificar.  

---

# Projeto Integrador em Java

Cada atividade tem seu **enunciado**, **explicação** e **código em Java** pronto para ser executado.  

---

## Atividade 1 — Polígono Regular
**Enunciado:**  
Ler o número de lados (**NumLados**) e a medida do lado (**MedLado**).  
- 3 lados → TRIÂNGULO → calcular área (Teorema de Heron)  
- 4 lados → QUADRADO → área = lado²  
- 5 lados → PENTÁGONO → calcular área (usar fórmula)  
- < 3 → NÃO É POLÍGONO  
- > 5 → POLÍGONO NÃO IDENTIFICADO  

### Código em Java
```java
import java.util.Scanner;
import java.lang.Math;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de lados: ");
        int n = sc.nextInt();
        System.out.print("Digite a medida do lado: ");
        double lado = sc.nextDouble();

        if (n < 3) {
            System.out.println("Não é um polígono");
        } else if (n == 3) {
            
            double a = lado, b = lado, c = lado;
            double s = (a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("TRIÂNGULO - Área: " + area);
        } else if (n == 4) {
            System.out.println("QUADRADO - Área: " + (lado*lado));
        } else if (n == 5) {
            
            double area = (5 * lado * lado) / (4 * Math.tan(Math.PI/5));
            System.out.println("PENTÁGONO - Área: " + area);
        } else {
            System.out.println("Polígono não identificado");
        }
        sc.close();
    }
}
```

---

## Atividade 2 — Maior entre 3 números
**Enunciado:**  
Ler 3 inteiros positivos e imprimir o maior.  

### Código em Java
```java
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Maior: " + a);
        } else if (b > a && b > c) {
            System.out.println("Maior: " + b);
        } else {
            System.out.println("Maior: " + c);
        }
        sc.close();
    }
}
```

---

## Atividade 3 — Classificação de Triângulo
**Enunciado:**  
Ler os lados A, B e C, verificar se é triângulo e classificar:  
- Equilátero  
- Isósceles  
- Escaleno  

### Código em Java
```java
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Digite o lado A: ");
        a = sc.nextDouble();
        System.out.print("Digite o lado B: ");
        b = sc.nextDouble();
        System.out.print("Digite o lado C: ");
        c = sc.nextDouble();

        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("Não é um triângulo");
        } else if (a == b && b == c) {
            System.out.println("Equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
        sc.close();
    }
}
```

---

## Atividade 4 — GitHub
**Enunciado:**  
Criar uma conta no **GitHub** e hospedar os códigos das atividades em um repositório.  

### Dica:
1. Criar conta em [https://github.com](https://github.com)  
2. Criar um repositório chamado `ProjetoIntegradorJava`  
3. Subir os arquivos `.java` das atividades  

---

## Atividade 5 — Projeto Integrador
**Enunciado:**  
Apresentar o **Título** e a **Descrição** do Projeto Integrador.  

### Exemplo:  
- **Título:** Sistema de Gerenciamento de Alunos  
- **Descrição:** Projeto em Java para cálculo de notas, verificação de faltas e classificação de alunos (aprovado, recuperação, exame, reprovado).  

---

##  Observações importantes
- Usar `==` para comparar valores e `=` para atribuir.  
- Validar entradas (não aceitar números negativos quando não fizer sentido).  
- Testar valores de fronteira (ex: média = 3.0, 5.0, 6.0).  
- Sempre fechar o `Scanner` no final com `sc.close();`.  

---

## Conclusão
Com estas atividades, você pratica:  
- Estruturas condicionais (`if`, `else if`, `else`)  
- Operadores relacionais e lógicos  
- Cálculo de áreas e comparação de números  
- Boas práticas em Java  

Agora é só rodar os códigos, testar e depois subir tudo no GitHub!  



## ✅ Conclusão
Esse material foi feito com carinho pra você    

Agora só falta uma coisa: **beijinhos de recompensa** 😘
