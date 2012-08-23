package katas.primefactors;

import katas.primefactors.PrimeFactorizationTestPrimeFactorizationSpec;
import katas.primefactors.PrimeFactorizationTestSupportingFunctionsSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ PrimeFactorizationTestPrimeFactorizationSpec.class, PrimeFactorizationTestSupportingFunctionsSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("PrimeFactorization")
public class PrimeFactorizationSpec {
}
