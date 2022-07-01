// 1. Write a program which search first occurrence of particular element from 
// singly linear linked list. 
// Function should return position at which element is found. 
// Function Prototype : 
// int SearchFirstOcc( PNODE Head , int no ); 
// Input linked list : |10|->|20|->|30|->|40|->|50|->|30|->|70| 
// Input element : 3
#include <stdio.h>
#include <stdlib.h>
struct  node
{
          int data;
          struct node * next;
          /* data */
};
typedef  struct node NODE; 
typedef  struct node * PNODE; 
typedef  struct node** PPNODE; 

void insertData(PPNODE head,int iNo)
{
    PNODE newn = NULL;
    newn=(PNODE)malloc(sizeof(NODE));
    newn->next = NULL;
    newn->data = iNo;

    if(*head == NULL)
    {
      *head = newn;
    }
    else{
      newn->next = *head;
      *head = newn;
    }
}
void InsertAtLast(PPNODE Head,int ino)
{
  PNODE newn = NULL;
  PNODE temp = *Head;
  newn = (PNODE)malloc(sizeof(NODE));
  newn ->data = ino;
  newn->next = NULL;
  if(*Head == NULL)
  {
    *Head = newn;
  }
  else{
    while(temp ->next!= NULL)
    {
     temp = temp->next;
    }
    temp->next = newn;
    newn->next = NULL;
  }
}
int SearchFirstOcc( PNODE Head , int no )
{
          int icnt=1;
 while (Head != NULL)
 {
          
          if(Head->data == no)
          {
                    break;
          }
          icnt++;
          Head = Head->next;
 }
 return icnt;         
}

void Display(PNODE head)
{
          while(head != NULL)
          {
                    printf("|%d|->",head->data);                                                                                                                                                                                                                                                                                                             
                    head = head->next;
          }
          printf("NULL\n");
}
int Count(PNODE head)
{
          int iCnt = 0;
          while(head != NULL)
          {
                    iCnt++;
                    head = head->next;
          }
          return iCnt;
}

int main()
{

          int iOption = 1;
          int data = 0;
          int ret= 0;
          int iNo=0;
          PNODE first = NULL;


          while(iOption != 0)
          {
                    printf("Enter your option for linkList : \n");
                    printf("1 : Enter Data to insert  \n");
                    printf("2 : Display Data \n");
                    printf("3 : Count Data \n");
                     printf("4 :  insert at last \n");
                    printf("5 :  SearchFirstOcce\n");
                    printf("0 : Exit\n");
                    scanf("%d",&iOption);
                    switch (iOption)
                    {
                              case 1:
                              printf("Enter data to insert : ");
                              scanf("%d",&data);
                              insertData(&first,data);
                              break;

                              case 2:
                              printf("Data from linkList:");
                              Display(first);
                              break;

                              case 3:
                              ret = Count(first);
                              printf("Total Count is :%d \n",ret);

                              case 4:
                              printf("Enter data to insert : ");
                              scanf("%d",&data);
                              InsertAtLast(&first,data);
                              break;

                              case 5:
                              printf("Enter input elements : \n");
                              scanf("%d",&iNo);
                              ret = SearchFirstOcc(first,iNo);
                              printf("Position is :%d \n",ret);
                              
                              case 0:
                              printf("Thank you for using  Linked list application \n");
                              break;
                    }
          }

          return 0;
}
