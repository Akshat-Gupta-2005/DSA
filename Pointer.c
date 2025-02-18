#include <stdio.h>

int main(){
    printf("Part1\n");
    // Reference And Dereference
    int a = 0;
    int *ptr = &a;
    printf("%d\n",a);
    printf("%d\n",*ptr);
    printf("%d\n",&a);
    printf("%d\n",ptr);
    printf("%d\n",&ptr);

    // Wrong Syntax
    // printf("\n");
    // int *ptr2 = a;
    // printf("%d\n",ptr2);
    // printf("%d\n",&ptr2);

    printf("Part2\n");
    // Pointer Assignment
    printf("\n");
    int* ptr3 = ptr;
    printf("%d\n",*ptr3);
    printf("%d\n",ptr3);
    printf("%d\n",&ptr3);


    printf("Part3\n");
    // Double pointer
    printf("\n");
    int ** doubleptr = &ptr;
    printf("%d\n",**doubleptr);
    printf("%d\n",*doubleptr);
    printf("%d\n",doubleptr);
    printf("%d\n",&doubleptr);

    // Pointer arithematic

    /*
    p = &arr[0];
    q = p + n = &arr[0+n];
    */

    printf("Part4\n");
    printf("\n");
    int arr[5] ={1,2,3,4,5};
    int *p1 = arr;
    int *p2 = &arr[0];
    printf("%d\n" , *p1);
    printf("%d\n" , *p2);
    p1++;
    p2++;
    printf("%d\n" , *p1);
    printf("%d\n" , *p2);
    
    /*
    p-q = (address of p - address of q)/number of bytes of datatype 
    return number of elements between them
    2 pointers cannot be added but can be subtracted
    */
    printf("Part5\n");
    int arr2[5] ={1,2,3,4,5};
    int *p3 = arr2;
    int *p4 = &arr2[3];
    printf("%d\n" , *p3);
    printf("%d\n" , *p4);
    p4--;
    printf("%d\n" , *p3);
    printf("%d\n" , *p4);
    int dif = p4 - p3;
    printf("%d\n" , dif);   

    // Void pointer 
    /*
    Void pointer is like a generic pointer
    malloc calloc returns a void pointer
    Void pointers can be type casted
    */
    printf("Part6\n");
    printf("\nVoid Pointer: \n");
    int i = 5;
    float f = 1.2;
    char c = 'd';
    void * vp;
    vp = &i;
    printf("%d\n" , *(int*)vp);
    vp = &f;
    printf("%f\n" , *(float*)vp);
    vp = &c;
    printf("%c\n" , *(char*)vp);

    // Null pointer
    /*
    You cannot dereference a null pointer
    the program will crash

    */
    // Dangling Pointer
    // Wild Pointer

    return 0;
}