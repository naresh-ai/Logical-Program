package logics;

public class A3 {
	public static void main(String[] args) {
		for(int i=100;i>0;i--) {
			if(i%5==0) {
				if(i%3==0) {
					if(i%2!=0) {
						System.out.println(i);
					}
				}
			}
		}
	}

}
