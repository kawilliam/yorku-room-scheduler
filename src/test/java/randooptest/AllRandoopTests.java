package randooptest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

    // ==== FACTORY RANDOOP TESTS ====
    FactoryRegressionTest.class,
    FactoryRegressionTest0.class,
    FactoryRegressionTest1.class,
    FactoryRegressionTest2.class,

    // ==== SINGLETON RANDOOP TESTS ====
    SingletonRegressionTest.class,
    SingletonRegressionTest0.class,


})
public class AllRandoopTests {
}
