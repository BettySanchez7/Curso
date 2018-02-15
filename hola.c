/*  Invocacion de librerias*/
#include <stdio.h>
#include <stdbool.h>
#define PI 3.14; //es una directiva del preprocesador (incluir cosas en el código antes de ejecutarlo)

/*El entero lo regresa al sistema operativo*/
/*Definicionde la funcion main*/

/*declaracion de variables globales*/
int global=5;


int main()
{
    //variables locales
    int local=3, otra=6; //enunciados de c
    int a=5;
    int o=0765;
    int b=0b1010;
    int h=0xABC123;


    float c=3.7;
    _Bool booleano=false;
    printf("%d\n",booleano);
    booleano=true;
    const int constante=100; //no se pueden hacer modificaciones



    printf("%d\n",booleano);
    printf("Tamanio en bytes\n"); //en bits multiplicar por 8
    printf("%d\n", sizeof(a));
    

    //Asignaciones multiples
    local=otra=25;
    printf("%d\n",local);
    printf("%d\n",otra);
    
  
   

    
}