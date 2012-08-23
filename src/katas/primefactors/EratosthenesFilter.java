package katas.primefactors;

import java.util.ArrayList;

public class EratosthenesFilter {

	private ArrayList<EratosthenesNumber> filter;

	public EratosthenesFilter(Integer number) {
		createFilterUpToNumber(number);
	}

	private void createFilterUpToNumber(Integer number) {
		filter = new ArrayList<EratosthenesNumber>();
		for (int i = 0; i < number; i++) {
			filter.add(new EratosthenesNumber(i));
		}
	}

	public boolean isNotCrossedOut(Integer number) {
		EratosthenesNumber storedNumber = filter.get(number - 1);
		return storedNumber.isCrossedOut();
	}

	public void crossOutEvenMultiplesOf(Integer number) {
		Integer currentMultiple = 2;
		while ((number * currentMultiple) < getMaxNumberInFilter()) {
			crossOut(number * currentMultiple);
			currentMultiple += 2;
		}
	}

	public void crossOut(Integer currentMultiple) {
		filter.get(currentMultiple - 1).crossOut();
	}

	public int getMaxNumberInFilter() {
		return filter.size();
	}

}
