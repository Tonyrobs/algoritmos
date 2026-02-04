#include <stdio.h>
#include <stdlib.h>
#include "pilha.h"

int main(){
    int elem, num;

    printf("Digite o numero de elementos: ");
    scanf("%d", &elem);

    Pilha A = pilha(elem);
    Pilha B = pilha(elem);

    printf("Digite os números:\n");

    for (int i = 0; i < elem; i++) {
        scanf("%d", &num);
    
        while (!vaziap(A) && num > A->item[A->topo]) {
            empilha(desempilha(A), B);
        }
    
        empilha(num, A);
    
        while (!vaziap(B)) {
            empilha(desempilha(B), A);
        }
    }
    printf("Numeros ordenados:\n");
    while (!vaziap(A)) {
        printf("%d ", desempilha(A));
    }
    printf("\n");

    return 0;
}
