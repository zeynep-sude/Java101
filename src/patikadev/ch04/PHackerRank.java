package patikadev.ch04;
import java.util.Scanner;

public class PHackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı Giriniz:");
		N = input.nextInt();
		
		 if(N>=1 && N<=100){
	            if(N%2!=0){
	                System.out.println("Weird");
	            }else if(N>=2 && N<=5){
	                System.out.println("Not Weird");
	            }else if(N>=6 && N>=20){
	                System.out.println("Weird");
	            }else if(N>20){
	                System.out.println("Not Weird");
	            }
	        }
		

	}

}
