package com.Labeee.lab6Larnjava;
public class Lab6Learnjava {
	public static void main(String[] arges) {
	    opes();
		System.out.println("\nThis is sum:"+sum());
		divide();
		ForEach();
	}
	public static  void opes() {
		int i=0;
		while(i<=10) {
			System.out.print("i="+i);
			i++;
		}
	}
	public static int sum() {
		int i=0;
		int sum =0;
		while(i<=10) {
			sum +=i;
			i++;
		}
		return sum;
	}
	public static void divide() {
		int i=0;
		
		while(i<=100) {
			if(i%12 == 0) {
				System.out.print(i+",\n");
			}
			i++;
		}
	}
	public static void ForEach() {
		int myarray[] = {1,2,3,4,5};
		System.out.print("myarray=");
		for(int show :myarray) {
			System.out.print(show+",");
		}
	}
}
