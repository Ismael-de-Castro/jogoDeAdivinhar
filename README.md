# Jogo de Adivinhação — revisao1exe1

Este programa é um jogo simples de adivinhação em Java.  
O computador sorteia um número secreto entre **1 e 100**, e o jogador tem **até 10 tentativas** para descobrir qual é.

---

## 🎮 Como funciona

1. O computador gera um número secreto aleatório.
2. O jogador tenta adivinhar o número digitando palpites.
3. Após cada palpite, o programa informa se o número secreto é:
   - **MAIOR**
   - **MENOR**
4. O jogo termina quando:
   - O jogador acerta o número, ou
   - Ele utiliza as 10 tentativas disponíveis.
5. No final, o programa exibe:
   - O resultado (vitória/derrota)
   - O número secreto (caso tenha perdido)
   - A lista de todos os palpites feitos

---

## ▶️ Como executar

1. Compile o programa:

```bash
javac jogoAdvinha.java
