# 🖖 JoKenPo: The Big Bang Theory Edition

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

Este projeto é um jogo de **Pedra, Papel, Tesoura, Lagarto e Spock**, a versão expandida do clássico JoKenPo apresentada na série *The Big Bang Theory*. O jogo foi desenvolvido como um projeto prático para consolidar conceitos fundamentais de desenvolvimento Android nativo.

## 📱 Sobre o Aplicativo

O objetivo é vencer o adversário (Barry Kripke) utilizando uma das cinco armas disponíveis. O utilizador pode selecionar um dos personagens principais da série (Sheldon, Leonard, Penny ou Amy) e visualizar as regras detalhadas antes de começar a partida.

### 🚀 Funcionalidades
- **Menu de Navegação:** Acesso rápido ao jogo e às regras.
- **Visualizador de Regras:** Diagrama explicativo sobre as 10 combinações possíveis de vitória.
- **Seleção de Personagem:** Escolha de avatar antes de jogar.
- **Lógica de Jogo Real:** Implementação de sorteio aleatório para a máquina e verificação de condições de vitória, derrota ou empate.

## 🛠️ Tecnologias Utilizadas

O desenvolvimento foi focado no uso de ferramentas nativas:
- **Java:** Implementação da lógica de jogo, manipulação de eventos de clique e geração de números aleatórios.
- **XML:** Estruturação de interfaces e design.
- **ConstraintLayout:** Organização responsiva dos componentes na tela.
- **Intents:** Navegação fluida entre as diferentes Activities (Ecrãs) do sistema.

## 🧩 Lógica de Jogo

A lógica implementada segue as regras originais do Sheldon Cooper:
1. **Tesoura** corta **Papel**
2. **Papel** cobre **Pedra**
3. **Pedra** esmaga **Lagarto**
4. **Lagarto** envenena **Spock**
5. **Spock** esmaga **Tesoura**
6. **Tesoura** decapita **Lagarto**
7. **Lagarto** come **Papel**
8. **Papel** refuta **Spock**
9. **Spock** vaporiza **Pedra**
10. **Pedra** amassa **Tesoura**

## 💻 Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone [https://github.com/teu-usuario/nome-do-repositorio.git](https://github.com/teu-usuario/nome-do-repositorio.git)
