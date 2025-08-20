# Calculadora Porca – Projeto de Sistemas (IFES/PS)

**Autor:** Gustavo Saraiva  
**Disciplina:** Projeto de Sistemas

---

## 1. Visão Geral

Este repositório contém duas versões de uma calculadora em Java:

1. **Versão “porca”**  
   - Toda a lógica implementada diretamente no método `main`.
   - Atende aos requisitos iniciais da disciplina, com simplicidade, sem padrões.
2. **Versão refatorada e aprimorada**  
   - Aplicação do padrão **MVC** (Model‑View‑Controller).
   - Uso de **reflections** para operações dinâmicas.
   - Abstração via **interfaces**, com foco em manutenção e extensibilidade.

---

## 2. Estrutura do Repositório

```
/
├── src/main/java/br/ifes/ps/calculadora/
│   ├── model/             – Classes do modelo (operações, entidades)
│   ├── view/              – Parte visual (entrada/saída)
│   ├── controller/        – Controladores que orquestram o fluxo
│   ├── Main               – Classe principal com aplicação do MVC
└── pom.xml                – Arquivo de build do Maven
├── Main.java              – Versão original “porca”
```

---

## 3. Requisitos

- Java 11 (ou superior)
- Maven 3.x

---

## 4. Como Compilar e Executar

```bash
# Clonar o repositório
git clone https://github.com/saraivagustavo/calculadoraPorca.git
cd calculadoraPorca

# Compilar
mvn clean compile

# Executar a versão “porca”
mvn exec:java -Dexec.mainClass="br.ifes.ps.calculadora.Main"

# (Opcional) Executar testes, se existirem
mvn test
```

---

## 5. Funcionamento

1. O programa solicita ao usuário que escolha uma operação (ex: soma, subtração, etc.).
2. Se o usuário digita `0`, o programa encerra.
3. Se digitar uma opção inválida (fora do intervalo) ou não numérica,:
   - Aparece mensagem apropriada.
   - Solicitação é repetida.
4. No modelo MVC:
   - O `Controller` identifica via *reflections* a classe da operação.
   - A `Model` realiza o cálculo.
   - A `View` exibe o resultado.

---

## 6. Objetivos de Aprendizagem

- Entender limitações de um código concentrado no `main`.
- Aprender a modularizar usando MVC.
- Ganhar familiaridade com reflections no Java.
- Criar programas mais fáceis de manter e estender.

---

**Gustavo Saraiva – 2025**
