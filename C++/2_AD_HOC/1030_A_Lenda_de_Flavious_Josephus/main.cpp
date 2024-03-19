#include <bits/stdc++.h>
using namespace std;

typedef struct Pessoa {
  int numero;
  struct Pessoa *prox;
  struct Pessoa *ante;
} Pessoa;

// Lista circular de pessoas
typedef struct {
  Pessoa *inicio, *fim;
  int tam;
} Lista;

Lista *inicializarLista() {
  Lista *nova_Lista = (Lista *)malloc(sizeof(Lista));

  if (nova_Lista) {
    (*nova_Lista).inicio = NULL;
    (*nova_Lista).fim = NULL;
    (*nova_Lista).tam = 0;
  }
  return nova_Lista;
}

Pessoa *inicializarPessoa(int numero) {
  Pessoa *nova_pessoa = (Pessoa *)malloc(sizeof(Pessoa));

  if (nova_pessoa) {
    (*nova_pessoa).prox = NULL;
    (*nova_pessoa).ante = NULL;
    (*nova_pessoa).numero = numero;
  }
  return nova_pessoa;
}

void inserirNoFim(Lista *qual_lista, int qual_Valor) {
  // Criar pessoa temporaria
  Pessoa *nova_pessoa = inicializarPessoa(qual_Valor);

  // Validar a Criação
  if (nova_pessoa) {

    // Verficar se a Lista esta vazia
    if ((*qual_lista).inicio == NULL) {
      (*nova_pessoa).prox = nova_pessoa;
      (*nova_pessoa).ante = nova_pessoa;

      (*qual_lista).inicio = nova_pessoa;
      (*qual_lista).fim = nova_pessoa;

      // Caso a Lista não esteja vazia
    } else {
      // Como é uma lista circular, o novo item inserido no fim aponta pro
      // inicio
      (*nova_pessoa).prox = (*qual_lista).inicio;
      (*qual_lista).inicio->ante = nova_pessoa;

      // O fim atual da lista é o anterior do novo item a ser inserido
      (*nova_pessoa).ante = (*qual_lista).fim;
      // O fim atual da lista aponta pro novo item como seu próximo
      (*qual_lista).fim->prox = nova_pessoa;
      // E a nova pessoa vira o final
      (*qual_lista).fim = nova_pessoa;
    }
    // Em todo caso, o tamanho da lista aumenta em 1
    (*qual_lista).tam++;
  }
}

int main() {
  int NC = 0, n = 0, k = 0;
  // Haverá NC (1 ≤ NC ≤ 30 ) casos de teste.
  cin >> NC;
  for (int i = 0; i < NC; i++) {

    // n:quantidade de pessoas no circulo numeradeas de 1 ate n
    // k:tamanho do salto de um homem até o próximo homem que será morto
    cin >> n >> k;

    // Uma litsa por caso de teste
    Lista *lista_pessoa = inicializarLista();

    // Criação da List circular das pessoas;
    for (int j = 0; j < n; j++) {
      inserirNoFim(lista_pessoa, j + 1);
    }

    Pessoa *aux_pessoa = lista_pessoa->inicio;
    int cont = 1;
    while (aux_pessoa != NULL) {
      if (lista_pessoa->tam == 1)
        break;
      if (cont == k) {
        (*aux_pessoa).prox->ante = (*aux_pessoa).ante;
        (*aux_pessoa).ante->prox = (*aux_pessoa).prox;
        Pessoa *aux_pessoa_2 = aux_pessoa->prox;
        free(aux_pessoa);
        aux_pessoa = aux_pessoa_2;
        lista_pessoa->tam--;
        cont = 2;
      } else
      cont++;
      aux_pessoa = aux_pessoa->prox;
    }
    cout << "Case "<< i+1 << ": " << aux_pessoa->numero << endl;
  }

  return 0;
}