Merge Sort

01.	Program Details:

	(i)	Date: 15th November, 2019
	(ii)	Language: Java

02.	Problem Statement:

	(i)	Sort elements using the Merge Sort.
	(ii)	Measure total time taken to sort.

03.	Working:

	I have used three functions to complete merge sort.
	First, function ‘main’ accepts the inputs from user.
	Then, it calls the function ‘mergesort’,
	which splits the arrays and sends them to function ‘merge’.
	Function ‘merge’ combines the array in an order which makes array sorted.
	Finally, function ‘main’ displays the result.

04.	Code Execution:

	(i)	To compile the above programs,
		change the directory of the Terminal or Command Prompt to the folder containing these files.

	(ii)	Then, enter 'javac MergeSort.java' to compile the code.
		You can only run it after compiling.

	(iii)	Finally, to run it correctly,
		enter 'java MergeSort'.

05.	Note:

	Speed of such sorting algorithms can be improved in many number of ways.
	a)	Like by ignoring comparisons of elements which have already been compared in earlier iterations.
	b)	Also, a flag can be inserted in the 'for' loop.
		If no swapping is done in the for loop, then array is already sorted.
		So, by using flag, we can exit for loop, rather than trying to sort already sorted array.
