package katas.primefactors;

import katas.primefactors.PrimeFactorization;
import katas.primefactors.PrimeFactorizationSpec;
import katas.primefactors.PrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Test Supporting Functions")
public class PrimeFactorizationTestSupportingFunctionsSpec extends PrimeFactorizationSpec {
  @Subject
  public PrimeFactorization subject;
  
  @Before
  public void _initPrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots() {
    someSquareRoots = ExampleTable.create("someSquareRoots", 
      java.util.Arrays.asList("Number", "SquareRootOfNumber"), 
      new PrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots(  java.util.Arrays.asList("4", "2"), 4, 2),
      new PrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots(  java.util.Arrays.asList("9", "3"), 9, 3),
      new PrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots(  java.util.Arrays.asList("16", "4"), 16, 4),
      new PrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots(  java.util.Arrays.asList("25", "5"), 25, 5),
      new PrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots(  java.util.Arrays.asList("36", "6"), 36, 6)
    );
  }
  
  protected ExampleTable<PrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots> someSquareRoots;
  
  @Test
  @Named("Test Square Root Calculation")
  @Order(99)
  public void testSquareRootCalculation() throws Exception {
    final Procedure1<PrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots> _function = new Procedure1<PrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots>() {
        public void apply(final PrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots it) {
          Integer _squareRootOf = PrimeFactorizationTestSupportingFunctionsSpec.this.subject.getSquareRootOf(Integer.valueOf(it.Number));
          boolean _should_be = Should.should_be(_squareRootOf, Integer.valueOf(it.SquareRootOfNumber));
          Assert.assertTrue("\nExpected subject.getSquareRootOf(Number) should be SquareRootOfNumber but"
           + "\n     subject.getSquareRootOf(Number) is " + new StringDescription().appendValue(_squareRootOf).toString()
           + "\n     subject is " + new StringDescription().appendValue(PrimeFactorizationTestSupportingFunctionsSpec.this.subject).toString()
           + "\n     Number is " + new StringDescription().appendValue(Integer.valueOf(it.Number)).toString()
           + "\n     SquareRootOfNumber is " + new StringDescription().appendValue(Integer.valueOf(it.SquareRootOfNumber)).toString() + "\n", _should_be);
          
        }
      };
    ExampleTableIterators.<PrimeFactorizationTestSupportingFunctionsSpecSomeSquareRoots>forEach(this.someSquareRoots, _function);
  }
}
