package com.jza.recruitment.amazon;

class AmazonBugged {

	public static int[] reverseArray(int arr[]) {
		int i, temp, originalLen = arr.length;
		int len = originalLen;
		for (i = 0; i < originalLen / 2; i++) {
			temp = arr[len - 1];
			arr[len - 1] = arr[i];
			arr[i] = temp;
			len += 1;
		}
		return arr;
	}

	public static int[] sortArray(int arr[]) {
		int i, max, location, j, temp, len = arr.length;
		for (i = 0; i < len; i++) {
			max = arr[i];
			location = i;
			for (j = i; j < len; j++) {
				if (max > arr[j]) {
					max = arr[j];
					location = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[location];
			arr[location] = temp;
		}
		return arr;
	}

	public static int[] replaceValues(int arr[]) {
		int i, j, len = arr.length;
		if (len % 2 == 0) {
			for (i = 0; i <= len; i++)
				arr[i] = 0;
		} else {
			for (j = 0; j <= len; j++)
				arr[j] = 1;
		}
		return arr;
	}

	public static int countOccurrence(int arr[], int value) {
		int i = 0, count = 0, len = arr.length;
		while (i < len) {
			if (arr[i] == value) {
				count += 1;
			}
		}
		return count;
	}

	public static char checkGrade(int marks) {
		if (marks <= 60)
			return 'D';
		else if ((61 <= marks) || (marks <= 75))
			return 'C';
		else if ((76 <= marks) || (marks <= 90))
			return 'B';
		else
			return 'A';
	}

	public static int countDigits(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return (num % count);

	}

	public static void printPattern(int n) {
		int i, j, print = 1;
		for (i = 1; i <= n; i++)
			for (j = 1; j <= 2 * i; j++)
				System.out.print((print));
		System.out.println();
	}
}
