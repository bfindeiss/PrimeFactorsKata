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
@Named("An empty filter")
public class EratosthenesFilterAnEmptyFilterSpec extends EratosthenesFilterSpec {
  EratosthenesFilter filter = new Function0<EratosthenesFilter>() {
    public EratosthenesFilter apply() {
      EratosthenesFilter _eratosthenesFilter = new EratosthenesFilter(Integer.valueOf(0));
      return _eratosthenesFilter;
    }
  }.apply();
  
  @Test
  @Named("Max Number in an empty filter should be 0")
  @Order(99)
  public void maxNumberInAnEmptyFilterShouldBe0() throws Exception {
    int _maxNumberInFilter = this.filter.getMaxNumberInFilter();
    boolean _should_be = Should.should_be(Integer.valueOf(_maxNumberInFilter), Integer.valueOf(0));
    Assert.assertTrue("\nExpected filter.maxNumberInFilter should be 0 but"
     + "\n     filter.maxNumberInFilter is " + new StringDescription().appendValue(Integer.valueOf(_maxNumberInFilter)).toString()
     + "\n     filter is " + new StringDescription().appendValue(this.filter).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("Crossing out on empty filter should throw Exception")
  @Order(99)
  public void crossingOutOnEmptyFilterShouldThrowException() throws Exception {
    try{
      this.filter.crossOut(Integer.valueOf(2));
      Assert.fail("Expected " + Exception.class.getName() + " in \n     filter.crossOut(2)\n with:"
       + "\n     filter is " + new StringDescription().appendValue(this.filter).toString());
    }catch(Exception e){
      // expected
    }
  }
}
