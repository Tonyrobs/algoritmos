#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "pilha.h"

int main() {
    char frase[100];
    int i;

    printf("Digite a frase: ");
    fgets(frase, sizeof(frase), stdin); 

    int len = strlen(frase); 
    Pilha A = pilha(len); 

    for (i = 0; i < len; i++) {
        if (frase[i] != ' ' && frase[i] != '\n') {
            // Empilha cada caractere da palavra
            empilha(frase[i], A);
        } else {
            
            while (!vaziap(A)) {
                printf("%c", desempilha(A));
            }
            
            printf("%c", frase[i]);
        }
    }
    
    while (!vaziap(A)) {
        printf("%c", desempilha(A));
    }
    printf("\n");

    return 0;
}
