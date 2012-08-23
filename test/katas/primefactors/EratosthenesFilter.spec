package katas.primefactors

import katas.primefactors.EratosthenesFilter

describe EratosthenesFilter {
	
	context "A filter with a number of elements"{
		Integer filterLength = 10
		EratosthenesFilter filter = new EratosthenesFilter(filterLength)
		
		fact "Test if filter has correct length"{
			filter.maxNumberInFilter should be 10
		}
	}

}