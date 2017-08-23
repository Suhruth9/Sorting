

import java.util.*;
public class QuickSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int a = sc.nextInt();
		int b[] = new int[a];
		for(int i=0;i<a;i++)
		{
			b[i] = sc.nextInt();
		}
		boolean sort = false;
		while(!sort)
		{
			sort = true;
			for(int i=0;i<a-1;i++)
			{
				if(b[i+1]<b[i])
				{
					int c = b[i+1];
					b[i+1] = b[i];
					b[i] = c;
					sort = false;
				}
			}
		}
		for(int i=0;i<a;i++)
		{
			System.out.println(b[i]);
		}

	}

}
