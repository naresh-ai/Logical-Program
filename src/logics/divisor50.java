package logics;

public class divisor50 {
	public static void main(String[] args) {
		int a=50;
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.println(i);
				count=count+1;
			}
		}System.out.println("no of divisor area>>"+count);
	}

}
