/*
2. Write a program which display all palindrome elements of singly linked 
list. 
Function Prototype : 
void DisplayPallindrome( PNODE Head); 
Input linked list : |11|->|28|->|17|->|414|->|6|->|89| 
Output : 11 6 414 
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
 void DisplayPallindrome(PNODE Head)
 {
  int sum = 0,iCnt = 0;
  int Temp = 0;


  printf("\n REVERSE NUMBERS IS: \n");

  int iDigit = 0;
  int reverseData=0;

  while ((Head!=NULL))
  {
    int reverseData=0;
    Temp = Head->data;

    while ((Head->data) !=   0)
    {
      iDigit=(Head->data)%10;
      reverseData = ((reverseData *10)+(iDigit));
  
      Head->data = Head->data/10;
    }
    if(reverseData == Temp)
    {
    printf(" |%d|->",reverseData);
    }
    Head = Head->next;
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
InsertData(&first,141);
InsertData(&first,6);
InsertData(&first,89);

Display(first);
DisplayPallindrome(first);

  return 0;
}