/*
. Write a program which returns addition of all even element from singly 
linear linked list. 
Function Prototype : 
int AdditionEven( PNODE Head); 
Input linked list : |11|->|20|->|32|->|41| 
Output : 52 
*/
#include <stdio.h>
#include<stdlib.h>

struct node
{
  int data;
  struct node *next;
};
typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;


void InsertData(PPNODE Head,int data)
{
  PNODE newn = NULL;
  newn = (PNODE)malloc(sizeof(NODE));
  newn ->data = data;
  newn->next = NULL;


  if(*Head == NULL)
  {
    *Head = newn;
  }else{
    newn->next = *Head;
    *Head = newn;
  }
}
 void AdditionEven(PNODE Head)
 {
  PNODE temp = Head;
  int sum = 0,iCnt = 0;
  printf("\nPERFECT NUMBERS IS: \n");

  while ((temp!=NULL))
  {
    if((temp->data %2) == 0)
    {
          sum = sum + temp->data;
    }
    temp = temp->next;
  }
  printf("%d\t",sum);
  printf("\n");
 }



void Display(PNODE Head)
{
  while ((Head != NULL))
  {
    printf("|%d|->",Head->data);
    Head = Head->next;
    /* code */
  }
  printf("NULL");
  
}

int main()
{

PNODE first = NULL;
InsertData(&first,11);
InsertData(&first,20);
InsertData(&first,32);
InsertData(&first,41);
Display(first);
AdditionEven(first);

  return 0;
}