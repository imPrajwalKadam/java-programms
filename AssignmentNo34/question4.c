/*
. Write a program which return second maximum element from singly linear 
linked list. 
Function Prototype : 
int SecMaximum( PNODE Head); 
Input linked list : |110|->|230|->|320|->|240| 
Output : 240 
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
          int iMax=0;
          int SecMax=0;
          while(Temp != NULL)
          {
                    if(Temp->data > iMax)
                    {
                                 printf("maximum: %d\n",iMax);
                                 printf("Second Max : %d\t",SecMax);
                              SecMax = iMax;
                              iMax = Temp->data;
                    }
                    if((Temp->data < iMax)&&(Temp->data > SecMax))
                    {
                              
         
                              SecMax = Temp->data;
                    }
                    Temp = Temp->next;
          }
          printf("Second Maximum number is: %d",SecMax);
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