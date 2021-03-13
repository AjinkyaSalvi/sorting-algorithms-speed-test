Insertion Sort

01.	Program Details:

	(i)	Date: 15th November, 2019
	(ii)	Language: Java

02.	Problem Statement:

	(i)	Sort elements using the Insertion Sort.
	(ii)	Measure total time taken to sort.

03.	Working:

	Like bubble sort, I have only used one function (function ‘main’).
	In this function, inputs are first accepted.
	However, unlike bubble sort,
	here, each number is picked up into the ‘key’ and then placed into its sorted position.
	Then, the output is displayed to the user.

04.	Code Execution:

	(i)	To compile the above programs,
		change the directory of the Terminal or Command Prompt to the folder containing these files.

	(ii)	Then, enter 'javac InsertionSort.java' to compile the code.
		You can only run it after compiling.

	(iii)	Finally, to run it correctly,
		enter 'java InsertionSort'.

05.	Note:

	Speed of such sorting algorithms can be improved in many number of ways.
	a)	Like by ignoring comparisons of elements which have already been compared in earlier iterations.
	b)	Also, a flag can be inserted in the 'for' loop.
		If no swapping is done in the for loop, then array is already sorted.
		So, by using flag, we can exit for loop, rather than trying to sort already sorted array.
