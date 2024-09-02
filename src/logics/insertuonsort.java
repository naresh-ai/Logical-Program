package logics;

public class insertuonsort {
public static void main(String[] args) {
	int []a={23,56,45,77,88,2,1};
	int temp,j;
	for(int i=1;i<a.length;i++) {
		temp=a[i];
		j=i;
		
		while(j>0&&a[j-1]>temp) {
			
			a[j]=a[j-1];
			j=j-1;
			a[j]=temp;
			
		}
	}
	
}
}
