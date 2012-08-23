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
}
