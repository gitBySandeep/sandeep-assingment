
//32) A	b	C	d	E	f	G	h	…… n terms 
class Add {
	public static void main(String[] args) {
		char ch;

		for (ch = 65; ch <= 90; ch++) {
			if (ch % 2 == 1) {
				System.out.print(" " + ch + "   ");
			} else
				System.out.print((char) (+(ch + 32)));
		}
	}
}