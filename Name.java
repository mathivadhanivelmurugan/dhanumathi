package sample;

public class Name {
	public static void main(String[] args) {
		for (int j=1;j<50;j++) {
			System.out.println(j);
		}
		for(int j=5;j>=1;j--) {
			System.out.println(j);
		}
		for(int k=10;k>=0;k--) {
			System.out.println(k);
			
		}
		String a="animal";
		for (int i=0;i<a.length();i++) {
			System.out.println(a.charAt(i));
		}
		for (int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				System.out.println(a.charAt(i));
			}
		}
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				continue;
					
				}
			else {
				System.out.println(a.charAt(i));
			}
				
			}
		for(int i=1;i<=5;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
			
		}
		
			
			
		
	String b="BUTTERfly";
	for(int i=0;i<b.length();i++) {
		if(b.charAt(i)>='a'&& b.charAt(i)<='z') {
			System.out.println(b.charAt(i));
		}
	
		
			
	}
	String c = "RAJkani";
	for(int i=0;i<b.length();i++) {
		if(c.charAt(i)>='A' && c.charAt(i)<='Z') {
			System.out.println(c.charAt(i));
			
		}
	}

	}
}
	
	


