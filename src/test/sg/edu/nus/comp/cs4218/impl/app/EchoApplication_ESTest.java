/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 22 06:39:48 GMT 2020
 */

package sg.edu.nus.comp.cs4218.impl.app;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import sg.edu.nus.comp.cs4218.impl.app.EchoApplication;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EchoApplication_ESTest extends EchoApplication_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EchoApplication echoApplication0 = new EchoApplication();
      String[] stringArray0 = new String[2];
      String string0 = echoApplication0.constructResult(stringArray0);
      assertEquals("null null", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EchoApplication echoApplication0 = new EchoApplication();
      String[] stringArray0 = new String[20];
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      try { 
        echoApplication0.run(stringArray0, inputStream0, (OutputStream) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // echo: OutputStream not provided
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.EchoApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EchoApplication echoApplication0 = new EchoApplication();
      String[] stringArray0 = new String[0];
      String string0 = echoApplication0.constructResult(stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EchoApplication echoApplication0 = new EchoApplication();
      try { 
        echoApplication0.constructResult((String[]) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // echo: Null arguments
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.EchoApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EchoApplication echoApplication0 = new EchoApplication();
      String[] stringArray0 = new String[1];
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      echoApplication0.run(stringArray0, inputStream0, outputStream0);
      assertEquals(1, stringArray0.length);
  }
}
