package java_TheaterReserve;
import java.util.*;

public class java_TheaterReserve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =10;
		int [] array = new int[n];
		
		while(true) {
			System.out.println("=================================");
			for(int i=0; i<n; i++) {
				System.out.print(" "+(i+1)+" ");
			}
			System.out.println("\n=================================");
			for(int i=0; i<n; i++) {
				System.out.print(" "+array[i]+" ");
			}
			System.out.println("\n원하시는 좌석번호를 입력하세요(종료는 -1): ");
			int reserve = scan.nextInt();
			if(reserve ==-1) {
				break;
			}
			else if(array[reserve-1]==0) {
				System.out.println("예약되었습니다. ");
				++array[reserve-1];
			}
			else if(array[reserve-1]==1) {
				System.out.println("이미 예약된 자리입니다. ");
			}
		}
		System.out.println("예약시스템이 종료되었습니다. ");
	}

}
