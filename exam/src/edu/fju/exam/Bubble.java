package edu.fju.exam;

public class Bubble {

	public static void main(String[] args) {
		int[]numbers ={45,81,9,72,4,6};
		int a;
		int b;
		int tmp;
		for(a=0;a<numbers.length-1;a++){
			for(b=0;b<numbers.length-1;b++){
				if(numbers[b+1]>numbers[b]){
					tmp=numbers[b];
					numbers[b]=numbers[b+1];
					numbers[b+1]=tmp;
				}
			}
		}for(a=0;a<numbers.length;a++){
			System.out.print(numbers[a]+" ");
		}
		

	}
}


