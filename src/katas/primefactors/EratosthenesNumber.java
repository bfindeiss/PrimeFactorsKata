package katas.primefactors;

public class EratosthenesNumber {

	private Integer number;
	private Boolean isCrossedOut;

	public EratosthenesNumber(Integer initialNumber) {
		number = initialNumber;
		isCrossedOut = false;
	}

	public Integer getNumber() {
		return number;
	}

	public Boolean isCrossedOut() {
		return isCrossedOut;
	}

	public void crossOut() {
		isCrossedOut = true;
	}
}
