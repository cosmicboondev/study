package javauniv;

import java.util.Scanner;

public class ReviewDemo01 {

	public static void main(String[] args) {
		// 소수: 1과 자기 자신외에는 나누어 떨어지지 않는 수
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
//		int cnt = 0;
		boolean isPrime = true;
		
//		for(int k =2; k<=number; k++){
//			if(number % k ==0){
////				cnt ++;
//				isPrime = false;
//				break;
//			}
//			System.out.println(k);
//		}
		
		int k = 2;
		while(k<number){
			if(number % k ==0){
				isPrime = false;
				break;
			}
//			System.out.println(k);
			k++;
		}
		
		System.out.println(number + (isPrime ? "은(는) 소수!" : "은(는) 소수아닙니다.!"));
//		if(isPrime == true)
//			System.out.println(number +"은(는) 소수!");
//
//		else
//			System.out.println(number +"은(는) 소수아닙니다.!");

	}

}
