package sample;

public class Factorial {
	public static void main(String[] args) {
		String a="Onesoft@99&030";
		for (int i=0;i<a.length();i++) {
			if(a.charAt(i)>='a'&& a.charAt(i)<='z'){
				System.out.println(a.charAt(i));
				
			}
		}
		
		for(int i=0;i<=20;i++) {
			if(i%3==0) {
				System.out.println(i);
				break;
			
			}
		}
		String a1="java";
		String b1=" ";
		for(int i=a1.length()-1;i>=0;i--) {
			b1=b1+a1.charAt(i);
//			System.out.println(b1);
		}
		System.out.println(b1);
				
		
	
				
		
		
		
	}

}
