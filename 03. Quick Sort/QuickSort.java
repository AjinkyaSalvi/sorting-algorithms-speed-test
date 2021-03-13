import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class QuickSort
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

		QuickSort qs = new QuickSort();
		qs.quicksort(a,0,n-1);

		Instant finish=Instant.now();
		long time = Duration.between(start,finish).toNanos();

		System.out.println("\nArray sorted.\nTime elapsed: "+time+" ns.\n\nSorted array:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

		t.close();
	}

	public void quicksort(int a[], int lo, int hi)
	{
		int p;
		if(lo<hi)
		{
			p=partition(a, lo, hi);
			quicksort(a, lo, p-1);
			quicksort(a, p+1, hi);
		}
	}

	int partition(int a[], int lo, int hi)
	{
		int pivot,mid,i,temp,j;
		mid=(lo+hi)/2;
		i=lo-1;

		if(a[lo]>a[mid])
		{
			if(a[lo]>a[hi])
			{
				if(a[mid]>a[hi])
				{
					pivot=a[mid];
					a[mid]=a[lo];
					a[lo]=a[hi];
					a[hi]=pivot;
				}
				else
				{
					pivot=a[hi];
					temp=a[mid];
					a[mid]=a[lo];
					a[lo]=temp;
				}
			}
			else
			{
				pivot=a[lo];
				temp=a[mid];
				a[mid]=a[hi];
				a[lo]=a[mid];
				a[hi]=pivot;
			}
		}
		else
		{
			if(a[mid]>a[hi])
			{
				if(a[lo]>a[hi])
				{
					pivot=a[lo];
					a[lo]=a[hi];
					a[hi]=pivot;
				}
				else
				{
					pivot=a[hi];
				}
			}
			else
			{
				pivot=a[mid];
				a[mid]=a[hi];
				a[hi]=pivot;
			}
		}

		i=(lo-1);
		for(j=lo;j<hi;j++) 
        {
			if (a[j]<pivot)
			{
				i++;

				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		temp = a[i+1];
		a[i+1] = a[hi];
		a[hi] = temp;
		return i+1; 
    }
}