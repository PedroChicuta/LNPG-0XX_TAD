#include <stdio.h>
#include <string.h>

typedef struct{
    char autor[30];
    char titulo[30];
    int AnoDePublicacao;
    int CopiasDisponiveis;
}  Book;

void emprestarCopia(Book *pont) {
    if(pont->CopiasDisponiveis > 0){
        pont->CopiasDisponiveis -= 1;
    }
    else{
        printf("Copia não disponivel\n");
    }
}

void devolverCopia(Book *pont) {
    pont->CopiasDisponiveis += 1;
}

int copiasDisponiveis(Book *pont){
    return (pont->CopiasDisponiveis > 0) ? 1 : 0;
}

const char* info(Book *pont) {
    static char info[120];  // static para garantir que a string persista após a função
    sprintf(info, "Autor: %s\nTitulo: %s\nAno de publicacao: %d\nCopias disponiveis: %d",
            pont->autor, pont->titulo, pont->AnoDePublicacao, pont->CopiasDisponiveis);
    return info;
}

