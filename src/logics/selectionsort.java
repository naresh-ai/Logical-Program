package logics;

public class selectionsort {
	public static void main(String[] args) {
		int[]a= {65,98,64,23,89,66,3,};
		int main=0;
		int temp=0;
		
				
	for(int i=0;i<a.length;i++) {
			main=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[main]) {
					main=j;
					
				}
				temp=a[j];
				a[j]=a[main];
				a[main]=temp;
				
				
			}
			for(int i1=0;i1<a.length;i1++) {
				System.out.println(a[i1]+" ");
			}
		
	}
		}
	}


