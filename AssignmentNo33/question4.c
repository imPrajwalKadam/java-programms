/*
4. Write a program which return largest element from singly linear linked 
list. 
Function Prototype : 
int Maximum( PNODE Head); 
Input linked list : |110|->|230|->|320|->|240| 
*/
#include<stdio.h>
#include<stdlib.h>

struct node{
          int data;
          struct node *next;
};
typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;


void InsertFirst(PPNODE Head,int ino)
{
          PNODE newn= NULL;
          newn=(PNODE)malloc(sizeof(NODE));
          newn->next = NULL;
          newn->data= ino;


          if(*Head == NULL)
          {
                    *Head = newn;
          }else{
                    newn->next = *Head;
                    *Head=newn;
          }
}
void Maximum( PNODE Head)
{
          PNODE temp = Head;
          int imax = 0;
          while(temp != NULL)
          {
                    if(temp->data > imax)
                    {
                              imax = temp->data;
                    }
                    temp = temp->next;
          }
          printf("\n Maximum number of data is : %d",imax);
}
void Display(PNODE Head)
{
          while(Head != NULL)
          {
                    printf("|%d| ",Head->data);
                    Head = Head->next;
          }
          printf("null");
}
int main()
{
PNODE First= NULL;
InsertFirst(&First,10);
InsertFirst(&First,20);
InsertFirst(&First,30);
InsertFirst(&First,130);
InsertFirst(&First,40);
Display(First);
Maximum(First);

          return 0;
}