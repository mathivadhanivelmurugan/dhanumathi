package sample;

public class AddMultiple {
	public static void main(String[] args) {
		int total=0;
		int count=1;
		for(int i=1;i<=5;i++) {
			total=total+i;
			count=count*total;
//			System.out.println(total);
//			System.out.println(count);
			
		}
		System.out.println(count);
	}

}
