package katas.primefactors;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class PrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots extends ExampleTableRow {
  public PrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots(final List<String> cellNames, final int Number, final int SquareRootOfNumber) {
    super(cellNames);
    this.Number = Number;
    this.SquareRootOfNumber = SquareRootOfNumber;
  }
  
  public int Number;
  
  public int getNumber() {
    return Number;
  }
  
  public int SquareRootOfNumber;
  
  public int getSquareRootOfNumber() {
    return SquareRootOfNumber;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(Number) , String.valueOf(SquareRootOfNumber));
  }
}
