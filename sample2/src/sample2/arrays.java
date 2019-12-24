package sample2;
 class arrays {
public static void main(String args[]) {
	int[] x =new int[] {1,2,3,4,5};
	System.out.println(x[0]);
	System.out.println(".............");
	int y=0;
	do {
		System.out.println(x[y]);
		y++;
	}while(y<=4);
	
	System.out.println(".............");
	while(y<=4)
	{
		System.out.println(x[y]);
		y++;
	}
}
}
