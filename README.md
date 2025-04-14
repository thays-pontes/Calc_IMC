# Calculadora de IMC – Projeto Android

## 📱 Descrição Geral

Este é um aplicativo Android desenvolvido como exercício avaliativo para o curso de Análise e Desenvolvimento de Sistemas (ADS) da FECAP.  
O objetivo principal do app é permitir que o usuário calcule seu IMC (Índice de Massa Corporal), veja a classificação correspondente e receba uma mensagem de incentivo personalizada, com base no resultado.

O app foi desenvolvido utilizando Java e Android Studio, com foco em boas práticas de usabilidade e organização de código.

---

## 👩‍💻 Informações Pessoais

- **Nome:** Thays Helyda da Silva Pontes  
- **Curso:** Análise e Desenvolvimento de Sistemas (ADS)  
- **Semestre:** 3º semestre  
- **Instituição:** FECAP

---

## 🚧 Desenvolvimento e Desafios

Durante o desenvolvimento do projeto, enfrentei alguns desafios importantes:

- **Organização das Activities:** Foi necessário criar uma Activity para cada categoria de IMC, garantindo a navegação correta e o envio dos dados (peso, altura, IMC, classificação) por meio de `Intent` e `Bundle`.
- **Tratamento de dados:** Trabalhei com `EditText`, validação de dados inseridos, formatação de número decimal com `DecimalFormat` e lógica condicional para classificar corretamente o IMC.
- **Interface e Experiência do Usuário (UI/UX):** Usei o `ConstraintLayout` para garantir responsividade e visual limpo. As mensagens são positivas, personalizadas e cada tela de feedback contém uma imagem informativa.
- **Problemas com recursos:** Corrigi erros relacionados a nomes de arquivos no `drawable`, conflitos de layout e exceções que faziam a tela ficar preta (identificados via Logcat).
- **Paleta de Cores e Strings:** Utilizei `colors.xml` e `strings.xml` para seguir o padrão e facilitar futuras manutenções.

---

## 🛠️ Funcionalidades

- Cálculo automático do IMC com base em peso e altura.
- Exibição de classificação de IMC:
  - Abaixo do peso
  - Peso normal
  - Sobrepeso
  - Obesidade grau 1, 2 ou 3
- Mensagem motivacional personalizada.
- Navegação entre telas.
- Botão para resetar os campos.
- Design com cores agradáveis e intuitivas.
- Imagem da tabela IMC exibida nas telas de resultado.

---

## 📦 Como Rodar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/calculadora-imc.git
