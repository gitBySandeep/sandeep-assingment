//If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.
class Test{
      public static void main(String[]args){
	    int length,breath,area,p,cost;
		length=20;
		cost=1600;
		breath=cost/length;
		area=length*breath;
	    p=2*(length+breath);
		System.out.println("breath"+breath);
		System.out.println("area"+area);
	    System.out.println("perimeter="+p);
    }
}l