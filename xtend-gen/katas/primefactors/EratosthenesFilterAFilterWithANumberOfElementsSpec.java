package katas.primefactors;

import katas.primefactors.EratosthenesFilter;
import katas.primefactors.EratosthenesFilterSpec;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("A filter with a number of elements")
public class EratosthenesFilterAFilterWithANumberOfElementsSpec extends EratosthenesFilterSpec {
  Integer filterLength = Integer.valueOf(10);
  
  EratosthenesFilter filter = new Function0<EratosthenesFilter>() {
    public EratosthenesFilter apply() {
      EratosthenesFilter _eratosthenesFilter = new EratosthenesFilter(EratosthenesFilterAFilterWithANumberOfElementsSpec.this.filterLength);
      return _eratosthenesFilter;
    }
  }.apply();
  
  @Test
  @Named("Test if filter has correct length")
  @Order(99)
  public void testIfFilterHasCorrectLength() throws Exception {
    int _maxNumberInFilter = this.filter.getMaxNumberInFilter();
    boolean _should_be = Should.should_be(Integer.valueOf(_maxNumberInFilter), Integer.valueOf(10));
    Assert.assertTrue("\nExpected filter.maxNumberInFilter should be 10 but"
     + "\n     filter.maxNumberInFilter is " + new StringDescription().appendValue(Integer.valueOf(_maxNumberInFilter)).toString()
     + "\n     filter is " + new StringDescription().appendValue(this.filter).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("Initially, no number is crossed out")
  @Order(99)
  public void initiallyNoNumberIsCrossedOut() throws Exception {
    int i = 1;
    boolean _lessEqualsThan = (i <= (this.filterLength).intValue());
    boolean _while = _lessEqualsThan;
    while (_while) {
      {
        boolean _isCrossedOut = this.filter.isCrossedOut(Integer.valueOf(i));
        boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isCrossedOut), false);
        Assert.assertTrue("\nExpected filter.isCrossedOut(i) should be false but"
         + "\n     filter.isCrossedOut(i) is " + new StringDescription().appendValue(Boolean.valueOf(_isCrossedOut)).toString()
         + "\n     filter is " + new StringDescription().appendValue(this.filter).toString()
         + "\n     i is " + new StringDescription().appendValue(Integer.valueOf(i)).toString() + "\n", _should_be);
        
        int _plus = (i + 1);
        i = _plus;
      }
      boolean _lessEqualsThan_1 = (i <= (this.filterLength).intValue());
      _while = _lessEqualsThan_1;
    }
  }
  
  @Test
  @Named("Cross out a specific number")
  @Order(99)
  public void crossOutASpecificNumber() throws Exception {
    final int numberToCrossOut = 7;
    boolean _isCrossedOut = this.filter.isCrossedOut(Integer.valueOf(numberToCrossOut));
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isCrossedOut), false);
    Assert.assertTrue("\nExpected filter.isCrossedOut(numberToCrossOut) should be false but"
     + "\n     filter.isCrossedOut(numberToCrossOut) is " + new StringDescription().appendValue(Boolean.valueOf(_isCrossedOut)).toString()
     + "\n     filter is " + new StringDescription().appendValue(this.filter).toString()
     + "\n     numberToCrossOut is " + new StringDescription().appendValue(Integer.valueOf(numberToCrossOut)).toString() + "\n", _should_be);
    
    this.filter.crossOut(Integer.valueOf(numberToCrossOut));
    boolean _isCrossedOut_1 = this.filter.isCrossedOut(Integer.valueOf(numberToCrossOut));
    boolean _should_be_1 = Should.<Boolean>should_be(Boolean.valueOf(_isCrossedOut_1), true);
    Assert.assertTrue("\nExpected filter.isCrossedOut(numberToCrossOut) should be true but"
     + "\n     filter.isCrossedOut(numberToCrossOut) is " + new StringDescription().appendValue(Boolean.valueOf(_isCrossedOut_1)).toString()
     + "\n     filter is " + new StringDescription().appendValue(this.filter).toString()
     + "\n     numberToCrossOut is " + new StringDescription().appendValue(Integer.valueOf(numberToCrossOut)).toString() + "\n", _should_be_1);
    
  }
  
  @Test
  @Named("Cross out even multiples of a number")
  @Order(99)
  public void crossOutEvenMultiplesOfANumber() throws Exception {
    final int numberToCrossOut = 2;
    boolean _isCrossedOut = this.filter.isCrossedOut(Integer.valueOf(numberToCrossOut));
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isCrossedOut), false);
    Assert.assertTrue("\nExpected filter.isCrossedOut(numberToCrossOut) should be false but"
     + "\n     filter.isCrossedOut(numberToCrossOut) is " + new StringDescription().appendValue(Boolean.valueOf(_isCrossedOut)).toString()
     + "\n     filter is " + new StringDescription().appendValue(this.filter).toString()
     + "\n     numberToCrossOut is " + new StringDescription().appendValue(Integer.valueOf(numberToCrossOut)).toString() + "\n", _should_be);
    
    int _multiply = (numberToCrossOut * 2);
    boolean _isCrossedOut_1 = this.filter.isCrossedOut(Integer.valueOf(_multiply));
    boolean _should_be_1 = Should.<Boolean>should_be(Boolean.valueOf(_isCrossedOut_1), false);
    Assert.assertTrue("\nExpected filter.isCrossedOut(numberToCrossOut*2) should be false but"
     + "\n     filter.isCrossedOut(numberToCrossOut*2) is " + new StringDescription().appendValue(Boolean.valueOf(_isCrossedOut_1)).toString()
     + "\n     filter is " + new StringDescription().appendValue(this.filter).toString()
     + "\n     numberToCrossOut*2 is " + new StringDescription().appendValue(Integer.valueOf(_multiply)).toString()
     + "\n     numberToCrossOut is " + new StringDescription().appendValue(numberToCrossOut).toString() + "\n", _should_be_1);
    
    int _multiply_1 = (numberToCrossOut * 4);
    boolean _isCrossedOut_2 = this.filter.isCrossedOut(Integer.valueOf(_multiply_1));
    boolean _should_be_2 = Should.<Boolean>should_be(Boolean.valueOf(_isCrossedOut_2), false);
    Assert.assertTrue("\nExpected filter.isCrossedOut(numberToCrossOut*4) should be false but"
     + "\n     filter.isCrossedOut(numberToCrossOut*4) is " + new StringDescription().appendValue(Boolean.valueOf(_isCrossedOut_2)).toString()
     + "\n     filter is " + new StringDescription().appendValue(this.filter).toString()
     + "\n     numberToCrossOut*4 is " + new StringDescription().appendValue(Integer.valueOf(_multiply_1)).toString()
     + "\n     numberToCrossOut is " + new StringDescription().appendValue(numberToCrossOut).toString() + "\n", _should_be_2);
    
    this.filter.crossOutEvenMultiplesOf(Integer.valueOf(numberToCrossOut));
    boolean _isCrossedOut_3 = this.filter.isCrossedOut(Integer.valueOf(numberToCrossOut));
    boolean _should_be_3 = Should.<Boolean>should_be(Boolean.valueOf(_isCrossedOut_3), true);
    Assert.assertTrue("\nExpected filter.isCrossedOut(numberToCrossOut) should be true but"
     + "\n     filter.isCrossedOut(numberToCrossOut) is " + new StringDescription().appendValue(Boolean.valueOf(_isCrossedOut_3)).toString()
     + "\n     filter is " + new StringDescription().appendValue(this.filter).toString()
     + "\n     numberToCrossOut is " + new StringDescription().appendValue(Integer.valueOf(numberToCrossOut)).toString() + "\n", _should_be_3);
    
    int _multiply_2 = (numberToCrossOut * 2);
    boolean _isCrossedOut_4 = this.filter.isCrossedOut(Integer.valueOf(_multiply_2));
    boolean _should_be_4 = Should.<Boolean>should_be(Boolean.valueOf(_isCrossedOut_4), true);
    Assert.assertTrue("\nExpected filter.isCrossedOut(numberToCrossOut*2) should be true but"
     + "\n     filter.isCrossedOut(numberToCrossOut*2) is " + new StringDescription().appendValue(Boolean.valueOf(_isCrossedOut_4)).toString()
     + "\n     filter is " + new StringDescription().appendValue(this.filter).toString()
     + "\n     numberToCrossOut*2 is " + new StringDescription().appendValue(Integer.valueOf(_multiply_2)).toString()
     + "\n     numberToCrossOut is " + new StringDescription().appendValue(numberToCrossOut).toString() + "\n", _should_be_4);
    
    int _multiply_3 = (numberToCrossOut * 4);
    boolean _isCrossedOut_5 = this.filter.isCrossedOut(Integer.valueOf(_multiply_3));
    boolean _should_be_5 = Should.<Boolean>should_be(Boolean.valueOf(_isCrossedOut_5), true);
    Assert.assertTrue("\nExpected filter.isCrossedOut(numberToCrossOut*4) should be true but"
     + "\n     filter.isCrossedOut(numberToCrossOut*4) is " + new StringDescription().appendValue(Boolean.valueOf(_isCrossedOut_5)).toString()
     + "\n     filter is " + new StringDescription().appendValue(this.filter).toString()
     + "\n     numberToCrossOut*4 is " + new StringDescription().appendValue(Integer.valueOf(_multiply_3)).toString()
     + "\n     numberToCrossOut is " + new StringDescription().appendValue(numberToCrossOut).toString() + "\n", _should_be_5);
    
  }
}
