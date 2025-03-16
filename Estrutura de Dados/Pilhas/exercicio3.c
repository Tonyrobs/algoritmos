#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "pilha.h"

int main() {
    char frase[100]; // Buffer para armazenar a frase
    int i;

    printf("Digite a frase: ");
    fgets(frase, sizeof(frase), stdin); // Lê a frase inteira, incluindo espaços

    int len = strlen(frase); // Obtém o comprimento da frase
    Pilha A = pilha(len); // Cria uma pilha com capacidade suficiente para a frase

    for (i = 0; i < len; i++) {
        if (frase[i] != ' ' && frase[i] != '\n') {
            // Empilha cada caractere da palavra
            empilha(frase[i], A);
        } else {
            // Quando encontrar um espaço ou nova linha, desempilha e imprime os caracteres
            while (!vaziap(A)) {
                printf("%c", desempilha(A));
            }
            // Imprime o espaço ou nova linha
            printf("%c", frase[i]);
        }
    }
    // Desempilha e imprime qualquer caractere restante na pilha
    while (!vaziap(A)) {
        printf("%c", desempilha(A));
    }
    printf("\n");

    return 0;
}