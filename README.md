# Sistema de Gerência de Finanças

Projeto básico em Java desenvolvido para praticar **encapsulamento, organização em pacotes, e operações sobre dados de contas bancárias**. O sistema simula o gerenciamento simples de uma conta, permitindo cadastrar dados, consultar informações, e realizar operações de saque e depósito.

Todo o código foi implementado com **tratamento de erros**, garantindo que entradas inválidas do usuário não interrompam a execução do programa. Mesmo que o usuário digite letras onde deveria digitar números ou escolha opções inexistentes, o sistema continua funcionando corretamente.

---

## 💻 Funcionalidades

✅ **Cadastro de Conta (SignIn)**
- O usuário fornece:
  - ID da conta
  - Nome do titular
  - Saldo inicial
- Proteção contra entradas inválidas (ex.: texto onde deveria ser número).

✅ **Menu de Operações (OperationService)**
- Exibe opções ao usuário:
  - Visualizar todos os dados da conta
  - Visualizar apenas ID, nome ou saldo
  - Alterar dados da conta
  - Realizar saque ou depósito
  - Encerrar o sistema
- Saque protegido contra saldo insuficiente.
- Entradas validadas para evitar travamentos do programa.

---

## 📁 Organização do Projeto

A estrutura do projeto está organizada em **packages**, separando responsabilidades:

### 🗂 **entities**

- **Account.java**
  - Classe que representa uma conta bancária.
  - Possui atributos privados:
    - `accountNumber`
    - `owner`
    - `balance`
  - Métodos getters e setters para manipulação segura dos dados.

---

### 🗂 **services**

- **OperationService.java**
  - Responsável por:
    - Exibir o menu principal ao usuário.
    - Executar as operações escolhidas no menu:
      - Exibir dados da conta.
      - Alterar dados da conta.
      - Realizar saque ou depósito.
  - Implementa lógica de validação de entradas para evitar exceções e manter a aplicação estável.

---

### 🗂 **ui**

- **SignIn.java**
  - Responsável pela interação inicial com o usuário para cadastrar a conta.
  - Valida as entradas do usuário para garantir dados corretos.
  - Evita exceções durante o cadastro.

---

### 🗂 **Main**

- **Main.java**
  - Classe principal do programa.
  - Responsável por:
    - Criar o objeto `Account`.
    - Chamar a tela de cadastro (SignIn).
    - Iniciar o menu principal (OperationService).

---