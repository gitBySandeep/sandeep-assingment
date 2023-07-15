//23. Find the number of cubical boxes of cubical side 3 cm which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.

class Test{
    public static void main(String[]args){
	    int length,breath,height,a,a1,a2,s;
		length=15;
		breath=9;
		height=12;
		s=3;		  
		a=length*breath*height;
		a1=s*s*s;
		a2=(a/a1);
		System.out.println(+a2+" number of cubical box  ");
    }
} 
