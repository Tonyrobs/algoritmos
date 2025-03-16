#incluir <stdio.h>
#incluir <stdlib.h>
#incluir "pilha.h"

int principal(){
 int elem, num;

 impressãof("Digite o número de elementos:");
 digitalização("%d", &elem);

 Pilha A = pilha(elém);
 Pilha B = pilha(elém);

 impressãof("Digite os números:\n");

    par (int i = 0; i < elem; i++) {
 digitalização("%d", &num);
    
        encantador (!vaziap(A) && num > A->item[A->topo]) {
 empilha(desempilha(A), B);
        }
    
        empilha(num, A);
    
        encantador (!vaziap(B)) {
 empilha(desempilha(B), A);
        }
    }
 impressãof("Numeros ordenados:\n");
    encantador (!vaziap(A)) {
 impressãof("%d", desempilha(A));
    }
 impressãof("\n");

 retardo 0;
}
