/*
3. Write a program which display product of all digits of all element from 
singly linear linked list. (Don’t consider 0) 
Function Prototype : 
void DisplayProduct( PNODE Head); 
Input linked list : |11|->|20|->|32|->|41| 
Output : 1 2 6 4
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
 void  DisplayProduct(PNODE Head)
 {
  PNODE temp = Head;
  int Prod = 1;
  int iDigit = 0;
  int iElement = 0;

  printf("\nPERFECT NUMBERS IS: \n");
  while ((temp!=NULL))
  {
      int Prod = 1;
    while (temp->data != 0)
    {
    iDigit = (temp->data) %10;
     if(iDigit == 0)
            {
                iDigit = 1;
            }
    Prod = Prod * iDigit;
    temp->data = temp->data/10;
    }
    
        printf("%d\t",Prod);
        printf("\n");
        temp = temp->next;

  }
  
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
 DisplayProduct(first);

  return 0;
}