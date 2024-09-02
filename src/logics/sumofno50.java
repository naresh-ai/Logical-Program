package logics;

public class sumofno50 {
	public static void main(String[] args) {
		int a=50;
		int sum=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.println(i);
				sum=sum+1;
				
			}
		}System.out.println("sum of no"+sum);
	}

}
