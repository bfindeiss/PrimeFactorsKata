package katas.primefactors;

import katas.primefactors.EratosthenesFilterAFilterWithANumberOfElementsSpec;
import katas.primefactors.EratosthenesFilterAnEmptyFilterSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ EratosthenesFilterAnEmptyFilterSpec.class, EratosthenesFilterAFilterWithANumberOfElementsSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("EratosthenesFilter")
public class EratosthenesFilterSpec {
}
