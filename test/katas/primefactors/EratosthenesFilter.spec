package katas.primefactors

import katas.primefactors.EratosthenesFilter

describe EratosthenesFilter {
	
	context"An empty filter"{
		EratosthenesFilter filter = new EratosthenesFilter(0)
		
		fact "Max Number in an empty filter should be 0"{
			filter.maxNumberInFilter should be 0
		}
		
		fact "Crossing out on empty filter should throw Exception"{
			filter.crossOut(2) should throw Exception
		}
		
	}
	
	context "A filter with a number of elements"{
		Integer filterLength = 10
		EratosthenesFilter filter = new EratosthenesFilter(filterLength)
		
		fact "Test if filter has correct length"{
			filter.maxNumberInFilter should be 10
		}
		
		fact "Initially, no number is crossed out"{
			var i=1
			while(i<=filterLength){
				filter.isCrossedOut(i) should be false
				i = i+1;
			}
		}
		
		fact "Cross out a specific number"{
		     val numberToCrossOut = 7
		     filter.isCrossedOut(numberToCrossOut) should be false
		     
		     filter.crossOut(numberToCrossOut)
		     
		     filter.isCrossedOut(numberToCrossOut) should be true
		}
	}

}