Quick Sort

01.	Program Details:

	(i)	Date: 15th November, 2019
	(ii)	Language: Java

02.	Problem Statement:

	(i)	Sort elements using the Quick Sort.
	(ii)	Measure total time taken to sort.

03.	Working:

	In this program I use three functions.
	First, function ‘main’ accepts the inputs from user.
	Then, it calls function ‘quicksort’,
	which is a recursive function like most other functions in sorting algorithms.
	It calls function ‘partition’ then splits the array in middle and recursively calls itself.
	In function partition, I have used ‘Median of Three’ method.
	In this method, pivot is median of lower, middle and higher elements.
	In this function, numbers smaller than pivot are moved to the left of pivot
	and elements larger than pivot are moved to the right of pivot.

04.	Code Execution:

	(i)	To compile the above programs,
		change the directory of the Terminal or Command Prompt to the folder containing these files.

	(ii)	Then, enter 'javac QuickSort.java' to compile the code.
		You can only run it after compiling.

	(iii)	Finally, to run it correctly,
		enter 'java QuickSort'.

05.	Note:

	Speed of such sorting algorithms can be improved in many number of ways.
	a)	Like by ignoring comparisons of elements which have already been compared in earlier iterations.
	b)	Also, a flag can be inserted in the 'for' loop.
		If no swapping is done in the for loop, then array is already sorted.
		So, by using flag, we can exit for loop, rather than trying to sort already sorted array.
