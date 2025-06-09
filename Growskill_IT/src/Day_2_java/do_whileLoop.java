package Day_2_java;

public class do_whileLoop {

	public static void main(String[] args) {
		int Row, col;
		Row=1;
		do {
			col=1;
			do {
				int x = Row*col;
				System.out.print(" "+x);
				col++;
			}
			while(col<=5);
			
			System.out.println();
			Row++;
		}
		while(Row<=5);

	}

}
