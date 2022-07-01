/*
2. Write a program which search last occurrence of particular element from 
singly linear linked list. 
Function should return position at which element is found. 
Function Prototype : 
int SearchLastOcc( PNODE Head, int no ); 
Input linked list : |10|->|20|->|30|->|40|->|50|->|30|->|70| 
Input element : 30 
Output : 6 
*/

#include <stdio.h>
#include <stdlib.h>

struct node
{
          int data;
          struct node *next;
};
typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;
void InsertLast(PPNODE head,int data)
{
          PNODE temp = *head;
          PNODE newn = NULL;
          newn = (PNODE)malloc(sizeof(NODE));
          newn->next=NULL;
          newn->data = data;

          if(*head == NULL)
          {
                    *head = newn;
          }else{
                    while(temp->next != NULL)
                    {
                              temp = temp->next;
                    }
                    temp->next = newn;
                    newn->next=NULL;
          }
}
void InsertFirst(PPNODE Head,int data)
{
          PNODE newn = NULL;
          newn = (PNODE)malloc(sizeof(NODE));
          newn->data = data;
          newn->next = NULL;


          if(*Head == NULL)
          {
                    *Head = newn;
          }else{
                    newn->next = *Head;
                    *Head = newn;
          }
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
void SearchLastOcc( PNODE Head, int no )
{
          int iCnt = 1;
          int iPos = 0;
          while (Head != NULL)
          {
                    printf("%d\t",Head->data);
                    if((Head->data)==no)
                    {
                              iPos = iCnt;
                    }
                    iCnt++;
                    Head = Head->next;
                    /* code */
          }
          printf("%d\n",iPos);
          
} 
int main()
{
int ret;
PNODE First=NULL;
          // InsertLast(&First, 11); 
          // InsertLast(&First, 21);
          // InsertLast(&First, 51);
          // InsertLast(&First, 101);
          InsertFirst(&First,11);
          InsertFirst(&First,21);
          InsertFirst(&First,51);
          InsertFirst(&First,101);
          InsertFirst(&First,51);

          SearchLastOcc(First,51);
          Display(First);
          return 0;
}