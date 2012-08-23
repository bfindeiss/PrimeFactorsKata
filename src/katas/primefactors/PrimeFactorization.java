package katas.primefactors;

import java.util.HashSet;
import java.util.Set;

public class PrimeFactorization {

	public Set<Integer> factorize(Integer number) {
		Integer maxPossiblePrimeFactor = getSquareRootOf(number);
		EratosthenesFilter filter = new EratosthenesFilter(
				maxPossiblePrimeFactor);

		for (int i = 2; i < maxPossiblePrimeFactor; i++) {
			if (number % i == 0 && !filter.isCrossedOut(number)) {
				filter.crossOutEvenMultiplesOf(number);
			}
		}

		Set<Integer> result = new HashSet<Integer>();
		
		return getResultSetForFilter(filter);
	}

	private Set<Integer> getResultSetForFilter(EratosthenesFilter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getSquareRootOf(Integer number) {
		return (int) Math.sqrt(number);
	}

}
