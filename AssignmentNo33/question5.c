/*
5. Write a program which return smallest element from singly linear linked 
list. 
Function Prototype : 
int Minimum( PNODE Head); 
Input linked list : |110|->|230|->|20|->|240|->|640| 
Output : 20
*/

#include<stdio.h>
#include<stdlib.h>


struct node
{
          int data;
          struct node *next;
          /* data */
};
typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;


void InsertFirst(PPNODE Head,int ino)
{
          PNODE newn = NULL;
          newn=(PNODE)malloc(sizeof(NODE));
          newn->next = NULL;
          newn->data = ino;

          if(*Head == NULL)
          {
             *Head = newn ;
          } else{
                    newn -> next = *Head;
                    *Head = newn;
          }
}
void Minimum( PNODE Head)
{
          PNODE temp = Head;
          int Min;
          while(temp != NULL)
          {
                    if(temp->data < Min)
                    {
                              Min= temp->data;
                    }
                    temp=temp->next;
          }
                              printf("\nminumum data from node is : %d",Min);

}

void Display(PNODE Head)
{
          while(Head != NULL)
          {
                    printf("|%d|",Head->data);
                    Head = Head->next;
          }
          printf("NULL");
}
int main()
{
PNODE First = NULL;
InsertFirst(&First,11);
InsertFirst(&First,21);
InsertFirst(&First,1);

InsertFirst(&First,51);
Display(First);
Minimum(First);

          return 0;
}