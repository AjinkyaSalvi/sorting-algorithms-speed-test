import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort
{
	public static void main(String args[])
	{
		Scanner t=new Scanner(System.in);
		Random rand=new Random();
		int n,i=0,a[],j=0,key;

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

		for(i=0;i<n;i++)
		{
			key=a[i];
			j=i-1;

			while ((j>=0)&&(a[j]>key))
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}

		Instant finish=Instant.now();
		long time = Duration.between(start,finish).toNanos();

		System.out.println("\nArray sorted.\nTime elapsed: "+time+" ns.\n\nSorted array:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

		t.close();
	}
}
