/*
*         *
*      *
  *  *
    *
*  *
*      *
*         *
*/


import java.util.Scanner;
class Add {
     public static void main(String[] args) {
          int i, j, k, c = 1;
          for (i = 1; i <= 7; i++) {
               for (j = 1; j <= 7; j++) {
                    if ((i == j || i + j ==8))
                         System.out.print("*");
                    else
                         System.out.print(" ");

               }
               System.out.println("");
          }
     }
}