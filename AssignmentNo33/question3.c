/*
3. Write a program which returns addition of all element from singly linear 
linked list. 
Function Prototype : 
int Addition( PNODE Head); 
Input linked list : |10|->|20|->|30|->|40| 
Output : 100
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

void InsertLast(PPNODE Head,int data)
{
          PNODE newn = NULL;
          newn = (PNODE)malloc(sizeof(NODE));
          newn->next = NULL;
          newn->data = data;

          PNODE temp = *Head;

          if(*Head == NULL)
          {
                    *Head = newn;
          }else{
                    while(temp->next != NULL)
                    {
                              temp = temp->next;
                    }
                    temp->next = newn;
                    newn->next = NULL;
          }
}
int Addition( PNODE Head) 
{
          int iAdd = 0;
          while(Head != NULL)
          {
                    iAdd = iAdd + (Head->data);
                    Head= Head->next;
          }
return iAdd;
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
int ret;
PNODE First=NULL;
          InsertLast(&First, 11); 
          InsertLast(&First, 21);
          InsertLast(&First, 51);
          InsertLast(&First, 101);
          // InsertFirst(&First,11);
          // InsertFirst(&First,21);
          // InsertFirst(&First,51);
          // InsertFirst(&First,101);
          // InsertFirst(&First,51);
          // SearchLastOcc(First,51);
          Display(First);
          ret = Addition(First);
          printf("Addition of Data is : \n%d",ret);

        
          return 0;
}