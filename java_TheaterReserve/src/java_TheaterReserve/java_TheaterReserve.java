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
			System.out.println("\n���Ͻô� �¼���ȣ�� �Է��ϼ���(����� -1): ");
			int reserve = scan.nextInt();
			if(reserve ==-1) {
				break;
			}
			else if(array[reserve-1]==0) {
				System.out.println("����Ǿ����ϴ�. ");
				++array[reserve-1];
			}
			else if(array[reserve-1]==1) {
				System.out.println("�̹� ����� �ڸ��Դϴ�. ");
			}
		}
		System.out.println("����ý����� ����Ǿ����ϴ�. ");
	}

}
