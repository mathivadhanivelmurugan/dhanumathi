package sample;

public class Reverse {
	public static void main(String[] args) {
		String a="mamt";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
//			System.out.println(b);
		}
//		System.out.println(b);
		if(a.equals(b)) {
			System.out.println("panlindrome");
			
		}
		else{
			System.out.println("not panlinddrome");
			
		}
		
	}

}
