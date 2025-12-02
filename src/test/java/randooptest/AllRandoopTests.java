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

    // ==== FACADE RANDOOP TESTS ====
    FacadeRegressionTest.class,
    FacadeRegressionTest0.class,
    FacadeRegressionTest1.class,
    FacadeRegressionTest2.class,

    // ==== STATE RANDOOP TESTS ====
    StateRegressionTest.class,
    StateRegressionTest0.class,
    StateRegressionTest1.class,
    
    // ==== STRATEGY RANDOOP TESTS ====
    StrategyRegressionTest.class,
    StrategyRegressionTest0.class,
    StrategyRegressionTest1.class,
    
    // ==== OBSERVER RANDOOP TESTS ====
    ObserverRegressionTest.class,
    ObserverRegressionTest0.class,
    ObserverRegressionTest1.class,
})
public class AllRandoopTests {
}
