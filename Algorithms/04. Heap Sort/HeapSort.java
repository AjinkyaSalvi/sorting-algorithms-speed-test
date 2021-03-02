import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class HeapSort
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

		HeapSort ms = new HeapSort();
		ms.heapsort(a);

		Instant finish=Instant.now();
		long time = Duration.between(start,finish).toNanos();

		System.out.println("\nArray sorted.\nTime elapsed: "+time+" ns.\n\nSorted array:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

		t.close();
	}

	public void heapsort(int a[])
	{
		buildheap(a);
		int n=a.length,i,temp;
		for(i=n-1;i>=0;i--)
		{
			temp=a[i];
			a[i]=a[0];
			a[0]=temp;

			heapify(a,0,i);
		}
	}

	public void buildheap(int a[])
	{
		int n=a.length,i=0,m;
		m=(n/2)-1;

		for(i=m;i>=0;i--)
		{
			heapify(a,i,n);
		}
	}

	public void heapify(int a[], int i, int n)
	{
		int max=i, l, r,temp;
		l=(2*i)+1;
		r=(2*i)+2;

		if((l<n)&&(a[l]>a[max]))
		{
			max=l;
		}
		if((r<n)&&(a[r]>a[max]))
		{
			max=r;
		}

		if(max!=i)
		{
			temp=a[max];
			a[max]=a[i];
			a[i]=temp;

			heapify(a,max,n);
		}
	}
}