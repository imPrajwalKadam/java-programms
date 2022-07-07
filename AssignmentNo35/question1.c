/*
1. Write a program which reverse each element of singly linked list. 
Function Prototype : 
void Reverse( PNODE Head); 
Input linked list : |11|->|28|->|17|->|41|->|6|->|89| 
Output : |11|->|82|->|71|->|14|->|6|->|98| 
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
 void Reverse(PNODE Head)
 {
  PNODE temp = Head;
  int sum = 0,iCnt = 0;


  printf("\n REVERSE NUMBERS IS: \n");

int iDigit = 0;
int reverseData=0;
  while ((temp!=NULL))
  {
    int reverseData=0;

    while ((temp->data) !=   0)
    {
      iDigit=(temp->data)%10;
      // printf("%d\t",iDigit);
      reverseData = ((reverseData *10)+(iDigit));
  
      temp->data = temp->data/10;
    }
    temp->data = reverseData;
    printf(" |%d|->",temp->data);
    temp = temp->next;
  }
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
InsertData(&first,28);
InsertData(&first,17);
InsertData(&first,41);
InsertData(&first,6);
InsertData(&first,89);

Display(first);
Reverse(first);

  return 0;
}