/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 15 20:34:50 GMT 2025
 */

package ds;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Identifier_ESTest extends Identifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("b]7#C`%pm\"HWt?~L$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_s('');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("w");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("Zs2PGwyGGne");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("+c[q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier((String) null);
      assertFalse(boolean0);
  }
}
