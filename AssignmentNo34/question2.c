/*
2. Write a program which displays all elements which are prime from singly 
linear linked list. 
Function Prototype : 
int DisplayPrime( PNODE Head); 
Input linked list : |11|->|20|->|17|->|41|->|22|->|89| 
Output : 11 17 41 89 
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
 void DisplayPrime(PNODE Head)
 {
  PNODE temp = Head;
  int sum = 0,iCnt = 0;
  printf("\nPERFECT NUMBERS IS: \n");

  while ((temp!=NULL))
  {
    for(iCnt = 2; iCnt<=(temp->data)/2;iCnt++)
    {
      if((temp->data %iCnt)==0)
      {
          break;
      }
    }
    
     if(iCnt == (temp->data)/2+1)
     {
          printf("%d\t",temp->data);
     }
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
InsertData(&first,20);
InsertData(&first,17);
InsertData(&first,41);
InsertData(&first,22);
InsertData(&first,89);

Display(first);
DisplayPrime(first);

  return 0;
}