Heap Sort

01.	Program Details:

	(i)	Date: 15th November, 2019
	(ii)	Language: Java

02.	Problem Statement:

	(i)	Sort elements using the Heap Sort.
	(ii)	Measure total time taken to sort.

03.	Working:

	In heap sort, I have four different functions.
	In function ‘main’, my program accepts the inputs from user.
	Then function ‘heapsort’ is called,
	which first builds heap by calling function ‘buildheap’.
	Then, it sorts the array using function ‘heapify’.
	After this, the sorted array is displayed to the user using function ‘main’.

04.	Code Execution:

	(i)	To compile the above programs,
		change the directory of the Terminal or Command Prompt to the folder containing these files.

	(ii)	Then, enter 'javac HeapSort.java' to compile the code.
		You can only run it after compiling.

	(iii)	Finally, to run it correctly,
		enter 'java HeapSort'.

05.	Note:

	Speed of such sorting algorithms can be improved in many number of ways.
	a)	Like by ignoring comparisons of elements which have already been compared in earlier iterations.
	b)	Also, a flag can be inserted in the 'for' loop.
		If no swapping is done in the for loop, then array is already sorted.
		So, by using flag, we can exit for loop, rather than trying to sort already sorted array.
