package primeFactorization;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prime {

	public static void main(String[] args) {
//		for ( int i = 1; i <= 100000; i++ ) {
//			if ( Prime.isPrime(i) ) {
//				System.out.println(i);
//			}
//		}
//		System.out.println(Prime.nthPrime(580));
//		for ( int a:Prime.PrimeFactorization(83)) {
//			System.out.printf("%d*",a);
//		}
		System.out.println(eularPhi(133848));
	}

	// 當輸入之數字為質數時回傳true
	public static boolean isPrime(int input) {
		// 質數為因數只有1跟自己的正整數(不含1)
		// 除了2之外其餘質數均為奇數
		if (input == 2) {
			return true;
		} else if (input % 2 == 0 || input == 1) {
			return false;
		} else { // 若比根號input還小的質數都不能整除input，則input為一質數
			int testDivider = 3;
			double testLessThan = Math.pow(input, 0.5);
			while (testLessThan >= testDivider) {
				if (input % testDivider == 0) {
					return false;
				}
				testDivider += 2;
			}
			return true;
		}
	}

	public static int nthPrime(int input) {
		int count = 0;
		int testNum = 0;
		// 若還沒找到指定位置的質數，持續測試
		while (count != input) {
			testNum++;
			// 若是prime，則prime位置計數器加1
			if (Prime.isPrime(testNum)) {
				count++;
			}
		}
		return testNum;
	}

	// 質因數分解
	public static List<Integer> PrimeFactorization(int input) {
		// 生成一個小於根號input值的質數List
		double testLessThan = Math.sqrt(input);
		ArrayList<Integer> ListForTest = new ArrayList<Integer>();
		ArrayList<Integer> ResultList = new ArrayList<Integer>();
		// 生成測試用質數列表
		for ( int i = 1; i <= testLessThan; i++ ) {
			if ( Prime.isPrime(i) ) {
				ListForTest.add(i);
			}
		}
		while( input != 1 ) { // 當還有可能有質因數
			for ( int i = 0; ( i < ListForTest.size() ) && ( input >= ListForTest.get(i) ); i++ ) {
				if ( input % ListForTest.get(i) == 0 ) { // 當找到質因數(可以整除)
					ResultList.add(ListForTest.get(i)); // 附加此質因數到ResultList
					input /= ListForTest.get(i); // 除掉該質因數
					break; // 跳回while迴圈，重新評估是否可能還有質因數
				}
				if ( i == ListForTest.size() - 1 ) { // 當剩下的數為質數時(質數列表中沒有數字可將其整除)
					ResultList.add(input);
					input /= input;
					break;
				}
			}
		}
		return ResultList;
	}
	
	public static int eularPhi( int n ) {
		Set<Integer> p_k = new HashSet<>();
		List<Integer> PrimeFactorizationOfN = PrimeFactorization(n);
		int phiOfN = -1;
		int fracMother = 1;
		int fracSon = 1;
		// store PrimeFactorizationOfN into set and not repeat the value
		for ( Integer value:PrimeFactorizationOfN ) {
			p_k.add(value);
		}
		// use foreach to count the value of phi ( except of multiply n )
		for ( int p_value:p_k ) {
			fracMother *= p_value;
			fracSon *= ( p_value - 1 );
		}
		phiOfN = ( n * fracSon ) / fracMother;
		return phiOfN;
	}

}
