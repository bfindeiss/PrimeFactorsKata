package katas.primefactors

import katas.primefactors.PrimeFactorization
import java.util.Set

describe PrimeFactorization {
		
	context"Test Prime Factorization"{
		
		def isPrime(Set list){
 			list.size == 0
		}
	
		fact "Prime Factorization of 1 is 1"{
			assert subject.factorize(1).isPrime
		}
		
		fact "Prime Factorization of 2 is 2"{
			assert subject.factorize(2).isPrime
		}
		
		fact "Prime Factorization of 3 is 3"{
			assert subject.factorize(3).isPrime
		}
		
		fact "Prime Factorization of 6"{
			assert subject.factorize(6) == 2
		}
	}

	context "Test Supporting Functions"{
		
		def someSquareRoots{
		|Number|SquareRootOfNumber|
		|4|2|
		|9|3|
		|16|4|
		|25|5|
		|36|6|
	}
	
	fact "Test Square Root Calculation"{
		someSquareRoots.forEach[
			subject.getSquareRootOf(Number) should be SquareRootOfNumber
		]
	}
}

}