package java_rand;
import java.util.*;

public class java_rand {

	public static void main(String[] args) {
		//Random rand = new Random();
		int [] array = new int[6];
		for(int i=0; i<10000; i++) {
			++array[(int)(Math.random()*6)];
		}
		System.out.println("===========");
		System.out.println("¸é\tºóµµ");
		System.out.println("===========");
		for(int i=0; i<array.length; i++) {
			System.out.println((i+1)+"\t"+array[i]);
		}
	}

}
