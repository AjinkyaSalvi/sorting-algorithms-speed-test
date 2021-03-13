import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class MergeSort
{
	public static void main(String args[])
	{
		Scanner t=new Scanner(System.in);
		Random rand=new Random();
		int n,i=0,a[];

		System.out.println("\nEnter number of elements to sort:");
		n=t.nextInt();
		a=new int[n];

		System.out.println("\nRandomly entered elements:");
		for(i=0;i<n;i++)
		{
			a[i]=rand.nextInt(10000);
			System.out.print(a[i]+" ");
		}

		Instant start=Instant.now();

		MergeSort ms = new MergeSort();
		ms.mergesort(a);

		Instant finish=Instant.now();
		long time = Duration.between(start,finish).toNanos();

		System.out.println("\nArray sorted.\nTime elapsed: "+time+" ns.\n\nSorted array:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

		t.close();
	}

	public void mergesort(int a[])
	{
		int n=a.length,temp;

		if(n==1)
			return;
		if(n==2)
		{
			if(a[0]<a[1])
			{
				return;
			}
			else
			{
				temp=a[0];
				a[0]=a[1];
				a[1]=temp;
				return;
			}
		}

		int b[],c[], x=n/2, i=0;
		int y=n-x;

		b=new int[x];
		c=new int[y];

		for(i=0;i<x;i++)
			b[i]=a[i];
		for(i=x;i<n;i++)
			c[i-x]=a[i];
		
		mergesort(b);
		mergesort(c);

		merge(a,b,c);
	}

	public void merge(int a[],int b[], int c[])
	{
		int l=b.length, m=c.length, i=0,j=0,k=0;

		while((i<l)&&(j<m))
		{
			if(b[i]<=c[j])
			{
				a[k]=b[i];
				i++;
			}

			else
			{
				a[k]=c[j];
				j++;
			}
			k++;
		}

		while(i<l)
		{
			a[k]=b[i];
			i++;
			k++;
		}

		while(j<m)
		{
			a[k]=c[j];
			j++;
			k++;
		}
	}
}