/* How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per 
thousand what will it cost to build the wall?*/

class Test{
    public static void main(String[]args){
	    int length,breath,length1,breath1;
		length=25;
		breath=10;
		float height=7.5f;
		length1=20;
		breath1=2;
		float height1=0.75f; 
		float a=length*breath*height;
		float a1=length1*breath1*height1;
		float a2=(a/a1);
		float s=a2*100;
		float t=(s*900)/1000;
		System.out.println(+s+" number of brick  ");
	    System.out.println(+t+" is total cost  ");   
    }
} 