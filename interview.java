package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class interview {
	
	//array reverse
	
//	static void arrRev(int arr[]) {
//		int start = 0;
//		int end = arr.length-1;
//		while(start<end) {
//		swap(arr, start, end);
//		start++;
//		end--;
//		}
//	}
//	
//	static void swap(int[] arr, int index1, int index2) {
//		int temp = arr[index1];
//		arr[index1] = arr[index2];
//		arr[index2] = temp;
//	}

	
	//prime number
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
//		System.out.println("Enter the number:-");
//		int sum = 0, rem, temp;
//		temp=num;
//		//Pallandrome
//		while(num>0)
//		{
//			rem = num %10;
//			sum = (sum*10)+rem;
//			num = num/10;
//		}
		
		//Armstrong
//		while(num!=0)
//		{
//			rem = num%10;
//			sum = sum+(rem*rem*rem);
//			num = num/10;
//		}
//		if(sum==temp)
//		{
//			System.out.println("Armstrong");
//		}
//		else {
//			System.out.println("No");
//		}
		
		
		//second largest number
//		int[] arr = {56,23,10,85,78};
//		
//		int size = arr.length;
//		
//		for(int i = 0; i<size; i++) {
//			for(int j = i+1; j<size; j++)
//			{
//				if(arr[i]>arr[j]) 
//				{
//					int temp = arr[i];
//					arr[i] = arr[j];
//					temp = arr[j];
//				}
//			}
//		}
//		System.out.println(arr[size-1]);
		
		
		
		//Sorting
//		int[] arr = {45,20,56,21,10};
//		
//		int size = arr.length;
//		int temp;
//		for(int i = 0; i<size; i++ ) {
//			for(int j = i+1; j<size; j++) {
//				if(arr[i]>arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//			System.out.println("Sorting in ASC" +arr[i]);
//		}
		
		//Array reverse
		
		
//		int[] arr = {45,20,56,21,10};
//		arrRev(arr);
//		System.out.println(Arrays.toString(arr));
		
		
		//prime number between 1 to 100
		
//		for(int n = 3; n<=100; n++) {
//			int count = 0;
//			
//			for(int j =2; j<=100; j++) {
//				if(n%j==0) {
//					count=1;
//					break;
//				}
//			}
//			if(count==0) {
//				System.out.println("prime"+ n);
//			}
//			else {
//				System.out.println("Not prime"+ n);
//			}
//		}
		
		//pyramid
		System.out.println("Enter number");
		int n =sc.nextInt();
		
//		for(int i = 1; i<=n; i++) {
//			//for space
//			for(int j = (n-i); j>=1; j--) {
//				System.out.print(" ");
//			}
//			//for star
//			for(int k = 1; k<=(2*i)-1; k++) {
//			if(k==1 || k<=(2*i)-1 || i==n)
//				System.out.print("*");
//			else 
//				System.out.print(" ");
//		}
//			System.out.println();
//		}
		
		
		//inverted pyramid
		
//		for(int i =n; i>=1; i--) {
//			//for space
//			for(int k = 1; k<=n-i; k++) {
//				System.out.print(" ");
//			}
//			//for stars
//			for(int j = 1; j<=(i*2)-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//hour glass
//		
//		for(int i =n; i>=1; i--) {
//			//for space
//			for(int k = 1; k<=n-i; k++) {
//				System.out.print(" ");
//			}
//			//for stars
//			for(int j = 1; j<=(i*2)-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//			for(int i = 1; i<=n; i++) {
//				//for space
//				for(int j = (n-i); j>=1; j--) {
//					System.out.print(" ");
//				}
//				//for star
//				for(int k = 1; k<=(2*i)-1; k++) {
//				if(k==1 || k<=(2*i)-1 || i==n)
//					System.out.print("*");
//				else 
//					System.out.print(" ");
//			}
//				System.out.println();
//			}
		
		//number pattern
//		for(int i =1; i<=n; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//		for(int i =1; i<=n; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
//		for(int i = n-1; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
//		int count = 1;
//		for(int i = 1; i<=n; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print(count);
//				count++;
//			}
//			System.out.println();
//		}
		int x = 1;
		int j =1;
		for(int i = 1; i<=n; i++) {
			System.out.println(i);
			j = j*10+1;
			x = j*j;
		}
		

		
		
		}
}
