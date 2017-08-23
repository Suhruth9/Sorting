import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] t = new int[l];
		for(int i = 0;i<l;i++){
			t[i] = sc.nextInt();
		}
		sort(t,0,l);
		for(int i = 0;i<l;i++){
			System.out.println(t[i]);
		}

	}
	public static void sort(int[] a,int s,int e){
		if(s<e){
			int p = dividing(a,s,e);
			sort(a,s,p-1);
			sort(a,p+1,e);
		}
		
	}
	public static int dividing(int[] a,int s,int e){
		int i = s +1;
		int p = a[s];
		for(int j = s+1;j<e;j++){
			if(a[j]<p){
				int c = a[i];
				a[i] = a[j];
				a[j] = c;
			}
		}
		int f = a[s];
		a[s] = a[i-1];
		a[i-1] = f;
		return(i-1);
	}

}
