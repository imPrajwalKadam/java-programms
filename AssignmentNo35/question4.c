/*
4. Write a program which display smallest digits of all element from singly
linear linked list.
Function Prototype :
void DisplaySmall( PNODE Head);
Input linked list : |11|->|250|->|532|->|415|
Output : 1 0 2 1
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

void InsertData(PPNODE Head, int data)
{
  PNODE newn = NULL;
  newn = (PNODE)malloc(sizeof(NODE));
  newn->data = data;
  newn->next = NULL;
  PNODE temp = *Head;

  if (*Head == NULL)
  {
    *Head = newn;
  }
  else
  {
    while ((temp->next != NULL))
    {
      temp = temp->next;
    }
    temp->next = newn;
  }
}
void DisplaySmall(PNODE Head)
{
  int iDigit = 0;
  int iMin = 0;
  while (Head != NULL)
  {
    iDigit = Head->data % 10;
    iMin = iDigit;
    while (Head->data != 0)
    {
      iDigit = Head->data % 10;
      if (iDigit < iMin)
      {
        iMin = iDigit;
      }
      Head->data = Head->data / 10;
    }
    printf("%d\t", iMin);
    Head = Head->next;
  }
  printf("\n");
}

void Display(PNODE Head)
{
  while ((Head != NULL))
  {
    printf("|%d|->", Head->data);
    Head = Head->next;
  }
  printf("NULL\n");
}

int main()
{
  PNODE first = NULL;
  int data = 0;
  int iNo = 0;
  int i = 0;
  printf("Haw Many Elements Do You want : \n");
  scanf("%d", &iNo);
  for (i = 1; i <= iNo; i++)
  {
    printf("Enter %d elements", i);
    scanf("%d", &data);
    InsertData(&first, data);
  }
  Display(first);
  DisplaySmall(first);
  return 0;
}