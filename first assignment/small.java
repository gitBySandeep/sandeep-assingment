//find smallest in three number
class Smallest{
     public static void main(String []args){
         int a,b,c;
         a=60;
         b=70;
         c=80;
         int small=(a<b)&&(a<c)?a:(b<c)?b:c;
         System.out.println("smallest number"+small);
     }
}
