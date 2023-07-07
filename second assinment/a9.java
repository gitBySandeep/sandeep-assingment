import java.util.Scanner;
class Dmart{
       public static void main(String[]args){
                    
          Scanner sc=new Scanner(System.in);
          String name;
          char gender;
          System.out.print("enter your name");
          name=sc.nextLine();
          System.out.print("enter your gender in the form of 'M'&'F'");
          gender=sc.next().charAt(0);
          int item1r,item2r,item3r,item4r,item5r,item6r,item7r,item8r,item9r,item10r;
          int Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9,Q10;
          
          item1r=10;
          item2r=20;
          item3r=30;
          item4r=40;
          item5r=50;
          item6r=60;
          item7r=70;
          item8r=80;
          item9r=90;
          item10r=100;
          
          
          System.out.print("enter 1st item's quantity");
          Q1=sc.nextInt();
          System.out.print("enter 2nd item's quantity");
          Q2=sc.nextInt();
          System.out.print("enter 3rd item's quantity");
          Q3=sc.nextInt();
          System.out.print("enter 4th item's quantity");
          Q4=sc.nextInt();
          System.out.print("enter 5th item's quantity");
          Q5=sc.nextInt();
          System.out.print("enter 6th item's quantity");
          Q6=sc.nextInt();
          System.out.print("enter 7th item's quantity");
          Q7=sc.nextInt();
          System.out.print("enter 8th item's quantity");
          Q8=sc.nextInt();
          System.out.print("enter 9th item's quantity");
          Q9=sc.nextInt();
          System.out.print("enter 10th item's quantity");
          Q10=sc.nextInt();
          
          double Basicamount;
     Basicamount=((item1r*Q1)+(item2r*Q2)+(item3r*Q3)+(item4r*Q4)+(item5r*Q5)+(item6r*Q6)+(item7r*Q7)+(item8r*Q8)+(item9r*Q9)+(item10r*Q10));
           
         double dis1=0,dis5=0,dis10=0,tp1=1,tp5=1,tp10=1;
           
              if(Q1>4&&Q1<10){
              dis1=(((item1r*Q1)*5)/100);
              dis5=(((item5r*Q5)*10)/100);
              tp1=(item1r*Q1)-dis1;
              tp5=(item5r*Q5)-dis5;
              }
              else{
              dis1=(((item1r*Q1)*5)/100);
              dis5=(((item5r*Q5)*10)/100);
              dis10=(((item10r*Q10)*15)/100);
              tp1=(item1r*Q1)-dis1;
              tp5=(item5r*Q5)-dis5;
              tp10=(item10r*Q10)-dis10;
              
              double discount;
              double Totalamount;
             Totalamount= (Basicamount-tp1-(tp5)-(tp10));
             
             if (Totalamount>10000){
                  discount=((Totalamount*15)/100);
               }
             else if (Totalamount>5000){
                  discount=((Totalamount*10/100));
                }
             else 
             {
             discount=0;     
             }
               Totalamount=Totalamount-discount;        
             
             char bag;
             System.out.println("wouid you want to carry bag y=yes&n=no");
             bag=sc.next().charAt(0);
             
             double a,b;
             if( bag=='y'){
              a=Basicamount+10;
              b=Totalamount+10;

             }
             else{
             a=Basicamount;
             b=Totalamount;
             }
             String Gift;
             if (gender=='F'){
                 Gift="cadebarry";
               }
             else{
                Gift="Ledger Wallet";
              }
            double GST1,GST2;
            GST1=((a*10)/100);
            GST2=((b*10)/100);     
            double grossamount1=GST1+a;
            double grossamount2=GST2+b;
              
             System.out.println("");

                 
         System.out.println("                     D-mart                                                            ");
         System.out.println(" ______________________________________________________________________________________ ");
         System.out.println(" Name :"+name+                            "Date:9/6/2023                                 ");
         System.out.println("_________________________________________________________________________________________ ");
         System.out.println(" item Name   |    Quantity  |        price        |      Total    |     After Discount ");
         System.out.println("                                                                                                    ");
         System.out.println(" item-1"+"             "+(Q1)+"           "+(item1r)+"           "+(item1r*Q1)+"            "+tp1 );
         System.out.println(" item-2"+"             "+(Q2)+"           "+(item2r)+"           "+(item2r*Q2)+"            "+(item2r*Q2));
         System.out.println(" item-3"+"             "+(Q3)+"           "+(item3r)+"           "+(item3r*Q3)+"            "+(item3r*Q3));
         System.out.println(" item-4"+"             "+(Q4)+"           "+(item4r)+"           "+(item4r*Q4)+"            "+(item4r*Q4)); 
         System.out.println(" item-5"+"             "+(Q5)+"           "+(item5r)+"           "+(item5r*Q5)+"            "+tp5 );
         System.out.println(" item-6"+"             "+(Q6)+"           "+(item6r)+"           "+(item6r*Q6)+"            "+(item6r*Q6));
         System.out.println(" item-7"+"             "+(Q7)+"           "+(item7r)+"           "+(item7r*Q7)+"            "+(item7r*Q7));
         System.out.println(" item-8"+"             "+(Q8)+"           "+(item8r)+"           "+(item8r*Q8)+"            "+(item8r*Q8));
         System.out.println(" item-9"+"             "+(Q9)+"           "+(item9r)+"           "+(item9r*Q9)+"            "+(item9r*Q9));
         System.out.println(" item-10"+"            "+(Q10)+"           "+(item10r)+"          "+(item10r*Q10)+"          "+tp10);
         System.out.println("");                                                                            
         System.out.println("___________________________________________________________________________________________");
         System.out.println("");
         System.out.println("\t\t\t\t\t\t"+"     A.P"+"\t\t D.P");
         System.out.println("");
         System.out.println("\t\t\t\t\t\t   " +Basicamount+"\t\t "+Totalamount);
         System.out.println(" Gift  :-"+Gift);
         System.out.println("");
         System.out.println(" carry Bag :"+bag+"\t\t\t\t\t     "+a+"\t\t"+b);
         System.out.println("");
         System.out.println(" GST (10%) "+"\t\t\t\t\t    "+GST1+"\t\t"+GST2);
         System.out.println("");
         System.out.println("____________________________________________________________________________");
         System.out.println("");
         System.out.println("\t\t\t\t\t\t    "+grossamount1+"\t\t"+grossamount2+"rs");
         System.out.println("");
         System.out.println("");
         System.out.println("\t\t\tThank you");
         System.out.println("\t\t\t To visit");
         System.out.println("\t\t\t D-Mart ");
         System.out.println("");
         System.out.println("");
         System.out.println("-----------------------------------------------------------------------------");
     }
   }       
 } 
       
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
