
#include <stdio.h>
#include <stdlib.h>

struct node
{
  int value;
  struct node *next;
} typedef nod;

void
display (nod * head)
{
  nod *k = head;
  while (k != NULL)
    {
      printf ("%d\n", k->value);
      k = k->next;
    }

}

nod*  insertbeg (nod * head,int x)
{
    
    nod *ptr = (nod*) malloc(sizeof(nod));
    //ptr = head;
    ptr->next=head;
    ptr->value=x;
    return ptr;
}

void insertlast (nod* head,int valu){
    nod *ptr = (nod*) malloc(sizeof(nod));
    nod *p= head;
    while(p->next != NULL){
        p = p->next;
    }
    p->next = ptr ;
    ptr->value=valu;
    ptr->next=NULL;
    
}
void insertany (nod* head,int valu,int index){
    nod *ptr = (nod*) malloc(sizeof(nod));
    nod *x =  head;
    for(int h=0;h<index-1;h++){
        x = x->next;
    }
    head->next = ptr;
    ptr->value=valu;
    ptr->next=head->next;
    
}


void
main ()
{
  //printf("Hello World");
  nod *head = (nod *) malloc (sizeof (nod));
  nod *first = (nod *) malloc (sizeof (nod));
  nod *sec = (nod *) malloc (sizeof (nod));
  nod *th = (nod *) malloc (sizeof (nod));
  //nod *head1 = (nod *) malloc (sizeof (nod));



  head->value = 38;
  head->next = first;


  first->value = 53;
  first->next = sec;


  sec->value = 33;
  sec->next = th;


  th->value = 345;
  th->next = NULL;

  // head -> value= 3;
  // head-> next=first;
  display (head);
  printf("\n\n");
  
  head = insertbeg (head,90);
  
  display (head);
  printf("\n\n");
  insertlast(head,78);
  display (head);
  printf("\n\n");
  insertany(head,45,3);
  display (head);
  printf("\n\n");
}
