package g.pher.a1rm.a1rm;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FormulaTest {
  @Test public void brzycki() throws Exception {

    int lbs = 100;
    int reps = 7;
    assertEquals(120.0192f, Formula.Brzycki(reps, lbs));
  }
}