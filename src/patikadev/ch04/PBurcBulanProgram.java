package patikadev.ch04;
import java.util.Scanner;

public class PBurcBulanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day,month;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Doğduğunuz Ayı Giriniz:");
		month = input.nextInt();
		System.out.println("Doğduğunuz Günü Giriniz:");
		day = input.nextInt();
		
		if(month>0 && month<13) {
			if(month==1) {
				if(day<22) {
					System.out.println("Oğlak Burcu");
				}else {
					System.out.println("Kova Burcu");
				}
			}else if(month==2) {
				if(day<20) {
					System.out.println("Kova Burcu");
				}else {
					System.out.println("Balık Burcu");
				}
			}else if(month==3) {
				if(day<21) {
					System.out.println("Balık Burcu");
				}else {
					System.out.println("Koç Burcu");
				}
			}else if(month==4) {
				if(day<21) {
					System.out.println("koç Burcu");
				}else {
					System.out.println("Boğa Burcu");
				}
			}else if(month==5) {
				if(day<22) {
					System.out.println("Boğa Burcu");
				}else {
					System.out.println("İkizler Burcu");
				}
			}else if(month==6) {
				if(day<23) {
					System.out.println("İkizler Burcu");
			    }else {
			    	System.out.println("Yengeç Burcu");
			    }
			}else if(month == 7) {
				if(day<23) {
					System.out.println("Yengeç Burcu");
				}else {
					System.out.println("Aslan Burcu");
				}
			}else if(month==8) {
				if(day<23) {
					System.out.println("Aslan Burcu");
				}else {
					System.out.println("Başak Burcu");
				}
			}else if(month==9) {
				if(day<23) {
					System.out.println("Başak Burcu");
				}else {
					System.out.println("Terazi Burcu");
				}
				
			}else if(month==10) {
				if(day<23) {
					System.out.println("Terazi Burcu");
				}else {
					System.out.println("Akrep Burcu");
				}
			}else if(month==11) {
				if(day<22) {
					System.out.println("Akrep Burcu");
				}else {
					System.out.println("Yay Burcu");
				}
			}else if(month==12) {
				if(day<22) {
					System.out.println("Yay Burcu");
				}else {
					System.out.println("Oğlak Burcu");
				}
			}
			
			
		}else {
			System.out.println("Böyle Bir Ay Bulunmamaktadır");
		}
		
		
		

	
	}
}
