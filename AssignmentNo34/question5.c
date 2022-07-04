/*
. Write a program which display addition of digits of element from singly 
linear linked list. 
Function Prototype :int SumDigit( PNODE Head); 
Input linked list : |110|->|230|->|20|->|240|->|640| 
Output : 2 5 2 6 10 

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
 void SecMaximum(PNODE Head)
{
          PNODE Temp = Head;
          int iMin;
          int SecMin;
          while(Temp != NULL)
          {
                    if(Temp->data < iMin)
                    {
                                 printf("maximum: %d\n",iMin);
                                 printf("Second Max : %d\t",SecMin);
                              SecMin = iMin;
                              iMin = Temp->data;
                    }
                    if((Temp->data < iMin)&&(Temp->data > SecMin))
                    {
                              
         
                              SecMin = Temp->data;
                    }
                    Temp = Temp->next;
          }
          printf("Second Maximum number is: %d",SecMin);
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
InsertData(&first,110);
InsertData(&first,223);
InsertData(&first,320);
InsertData(&first,240);
Display(first);
SecMaximum(first);

  return 0;
}