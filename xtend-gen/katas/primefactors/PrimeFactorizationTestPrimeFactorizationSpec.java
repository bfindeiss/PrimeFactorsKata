package katas.primefactors;

import com.google.common.base.Objects;
import java.util.Set;
import katas.primefactors.PrimeFactorization;
import katas.primefactors.PrimeFactorizationSpec;
import org.hamcrest.StringDescription;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Test Prime Factorization")
public class PrimeFactorizationTestPrimeFactorizationSpec extends PrimeFactorizationSpec {
  @Subject
  public PrimeFactorization subject;
  
  @Test
  @Named("Prime Factorization of 1 is 1")
  @Order(99)
  public void primeFactorizationOf1Is1() throws Exception {
    Set<Integer> _factorize = this.subject.factorize(Integer.valueOf(1));
    boolean _isPrime = this.isPrime(_factorize);
    Assert.assertTrue("\nExpected subject.factorize(1).isPrime but"
     + "\n     subject.factorize(1) is " + new StringDescription().appendValue(_factorize).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _isPrime);
    
  }
  
  @Test
  @Named("Prime Factorization of 2 is 2")
  @Order(99)
  public void primeFactorizationOf2Is2() throws Exception {
    Set<Integer> _factorize = this.subject.factorize(Integer.valueOf(2));
    boolean _isPrime = this.isPrime(_factorize);
    Assert.assertTrue("\nExpected subject.factorize(2).isPrime but"
     + "\n     subject.factorize(2) is " + new StringDescription().appendValue(_factorize).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _isPrime);
    
  }
  
  @Test
  @Named("Prime Factorization of 3 is 3")
  @Order(99)
  public void primeFactorizationOf3Is3() throws Exception {
    Set<Integer> _factorize = this.subject.factorize(Integer.valueOf(3));
    boolean _isPrime = this.isPrime(_factorize);
    Assert.assertTrue("\nExpected subject.factorize(3).isPrime but"
     + "\n     subject.factorize(3) is " + new StringDescription().appendValue(_factorize).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _isPrime);
    
  }
  
  @Test
  @Named("Prime Factorization of 6")
  @Order(99)
  public void primeFactorizationOf6() throws Exception {
    Set<Integer> _factorize = this.subject.factorize(Integer.valueOf(6));
    boolean _equals = Objects.equal(_factorize, Integer.valueOf(2));
    Assert.assertTrue("\nExpected subject.factorize(6) == 2 but"
     + "\n     subject.factorize(6) is " + new StringDescription().appendValue(_factorize).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _equals);
    
  }
  
  public boolean isPrime(final Set list) {
    int _size = list.size();
    boolean _equals = (_size == 0);
    return _equals;
  }
}
