/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 22 06:35:32 GMT 2020
 */

package sg.edu.nus.comp.cs4218.impl.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileSystemUtils_ESTest extends FileSystemUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "%$^*`ej2Yk";
      FileSystemUtils.convertToAbsolutePath("%$^*`ej2Yk");
      FileSystemUtils.getAbsolutePathName("%$^*`ej2Yk");
      FileSystemUtils.isSubDir("", "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk");
      FileSystemUtils.getAbsolutePathName("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk");
      FileSystemUtils.getAbsolutePathName("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk";
      stringArray0[1] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk";
      stringArray0[2] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk";
      stringArray0[3] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk";
      FileSystemUtils.joinPath(stringArray0);
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).delete();
      doReturn(true).when(file0).exists();
      doReturn(false).when(file0).isDirectory();
      FileSystemUtils.deleteFileRecursive(file0);
      FileSystemUtils.isSubDir("", "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk");
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk");
      File file1 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file1).exists();
      FileSystemUtils.deleteFileRecursive(file1);
      FileSystemUtils.createFile("\"2):\"7dj");
      FileSystemUtils.createFile("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk");
      FileSystemUtils.convertToAbsolutePath("^");
      FileSystemUtils.convertToAbsolutePath("");
      try { 
        FileSystemUtils.createFile("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk//Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk//Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk//Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // create file failed
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemUtils.convertToAbsolutePath("t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.isSubDir("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es", "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.getAbsolutePathName("t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es");
      MockFile mockFile0 = new MockFile("t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.deleteFileRecursive(mockFile0);
      FileSystemUtils.getAbsolutePathName("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.createFile("t+}zNa9ny;h+oj`^*es");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "s+";
      stringArray0[1] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es";
      stringArray0[2] = "s+";
      stringArray0[3] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es";
      stringArray0[3] = "t+}zNa9ny;h+oj`^*es";
      stringArray0[5] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es";
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.isSubDir("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es", "s+");
      FileSystemUtils.convertToAbsolutePath("s+");
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(file0).delete();
      doReturn(true, false).when(file0).exists();
      doReturn(false, false).when(file0).isDirectory();
      FileSystemUtils.deleteFileRecursive(file0);
      FileSystemUtils.getAbsolutePathName("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es");
      File[] fileArray0 = new File[1];
      fileArray0[0] = file0;
      File file1 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file1).delete();
      doReturn(true).when(file1).exists();
      doReturn(true).when(file1).isDirectory();
      doReturn(fileArray0).when(file1).listFiles();
      FileSystemUtils.deleteFileRecursive(file1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "ebW$\"1Z'_mR,/";
      FileSystemUtils.joinPath(stringArray0);
      FileSystemUtils.getAbsolutePathName("");
      FileSystemUtils.convertPathToSystemPath("ebW$\"1Z'_mR,/");
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6");
      FileSystemUtils.joinPath(stringArray0);
      FileSystemUtils.isSubDir("", "/ebW$\"1Z'_mR,/");
      FileSystemUtils.convertPathToSystemPath("");
      FileSystemUtils.convertPathToSystemPath("");
      FileSystemUtils.joinPath(stringArray0);
      FileSystemUtils.convertToAbsolutePath("os.name");
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(file0).exists();
      doReturn(true).when(file0).isDirectory();
      doReturn((File[]) null).when(file0).listFiles();
      // Undeclared exception!
      try { 
        FileSystemUtils.deleteFileRecursive(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Yy\"F&j,i;8yg";
      stringArray0[1] = "";
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[2] = "Ph'?a2O^lC@p5[$";
      stringArray0[3] = "'.Kk0JaLZdf";
      String string0 = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "Wj-";
      FileSystemUtils.joinPath(stringArray0);
      FileSystemUtils.convertPathToSystemPath("");
      FileSystemUtils.joinPath(stringArray0);
      FileSystemUtils.convertPathToSystemPath("");
      try { 
        FileSystemUtils.createFile("'.Kk0JaLZdf");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "ebW$\"1Z'_mR,/";
      FileSystemUtils.joinPath(stringArray0);
      FileSystemUtils.getAbsolutePathName("");
      FileSystemUtils.convertPathToSystemPath("ebW$\"1Z'_mR,/");
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6");
      FileSystemUtils.joinPath(stringArray0);
      FileSystemUtils.isSubDir("", "/ebW$\"1Z'_mR,/");
      FileSystemUtils.convertPathToSystemPath("");
      FileSystemUtils.convertPathToSystemPath("");
      FileSystemUtils.joinPath(stringArray0);
      FileSystemUtils.convertToAbsolutePath("os.name");
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).delete();
      doReturn(true).when(file0).exists();
      doReturn(false).when(file0).isDirectory();
      FileSystemUtils.deleteFileRecursive(file0);
      try { 
        FileSystemUtils.createFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ";$c@iP^5\"'U";
      FileSystemUtils.convertToAbsolutePath(";$c@iP^5\"'U");
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).exists();
      FileSystemUtils.deleteFileRecursive(file0);
      FileSystemUtils.convertToAbsolutePath(")Q^1-T1`\"3P'~");
      File file1 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file1).exists();
      FileSystemUtils.deleteFileRecursive(file1);
      FileSystemUtils.convertPathToSystemPath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/;$c@iP^5\"'U");
      File file2 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file2).exists();
      FileSystemUtils.deleteFileRecursive(file2);
      FileSystemUtils.createFile("wuT!2OYP\"yk7");
      try { 
        FileSystemUtils.createFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      FileSystemUtils.joinPath(stringArray0);
      FileSystemUtils.joinPath(stringArray0);
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).exists();
      FileSystemUtils.deleteFileRecursive(file0);
      FileSystemUtils.convertToAbsolutePath("");
      File file1 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file1).exists();
      FileSystemUtils.deleteFileRecursive(file1);
      // Undeclared exception!
      try { 
        FileSystemUtils.joinPath((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemUtils.convertToAbsolutePath("#xk[W_(x/=%C6(fUs#");
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/#xk[W_(x/=%C6(fUs#");
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).exists();
      FileSystemUtils.deleteFileRecursive(file0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).exists();
      FileSystemUtils.deleteFileRecursive(file0);
      String string0 = "%8,}1Q9+nog7`!^AO";
      FileSystemUtils.isSubDir("%8,}1Q9+nog7`!^AO", "%8,}1Q9+nog7`!^AO");
      FileSystemUtils.convertPathToSystemPath("%8,}1Q9+nog7`!^AO");
      FileSystemUtils.createFile("%8,}1Q9+nog7`!^AO");
      FileSystemUtils.isSubDir("%8,}1Q9+nog7`!^AO", "%8,}1Q9+nog7`!^AO");
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        FileSystemUtils.joinPath(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = null;
      try { 
        FileSystemUtils.createFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemUtils.isSubDir("(\\)+", "(\\)+");
      FileSystemUtils.convertToAbsolutePath("(\\)+");
      String[] stringArray0 = null;
      // Undeclared exception!
      try { 
        FileSystemUtils.joinPath((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemUtils.getAbsolutePathName("o:");
      FileSystemUtils.createFile("o:");
      FileSystemUtils.createFile("Qbwoo_ce~[5!1Do");
      FileSystemUtils.getAbsolutePathName("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/o:");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemUtils.isSubDir("/+", "/+");
      FileSystemUtils.createFile("/+");
      FileSystemUtils.isSubDir("/+", "");
      FileSystemUtils.isSubDir("", "6");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemUtils.convertToAbsolutePath("H{ k*kCG3YJ?j4E2");
      // Undeclared exception!
      try { 
        FileSystemUtils.convertToAbsolutePath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).exists();
      FileSystemUtils.deleteFileRecursive(file0);
      String string0 = "";
      FileSystemUtils.getAbsolutePathName("");
      FileSystemUtils.convertToAbsolutePath("");
      File file1 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file1).exists();
      FileSystemUtils.deleteFileRecursive(file1);
      String string1 = null;
      // Undeclared exception!
      try { 
        FileSystemUtils.getAbsolutePathName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileSystemUtils.convertPathToSystemPath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemUtils.isSubDir("", "");
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).exists();
      FileSystemUtils.deleteFileRecursive(file0);
      try { 
        FileSystemUtils.createFile("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // This test file already exist!
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemUtils.getAbsolutePathName("win");
      FileSystemUtils.isSubDir("49~+U", "49~+U");
      FileSystemUtils.convertPathToSystemPath("}i66M.");
      FileSystemUtils.createFile("}i66M.");
      FileSystemUtils.convertToAbsolutePath("win");
      FileSystemUtils.createFile("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/win");
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).exists();
      FileSystemUtils.deleteFileRecursive(file0);
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/win");
      File file1 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file1).exists();
      FileSystemUtils.deleteFileRecursive(file1);
      FileSystemUtils.convertToAbsolutePath("");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/win";
      stringArray0[1] = "49~+U";
      stringArray0[2] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/win";
      stringArray0[3] = "}i66M.";
      stringArray0[4] = "";
      stringArray0[5] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/win";
      stringArray0[6] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/";
      stringArray0[7] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/";
      stringArray0[8] = "";
      FileSystemUtils.joinPath(stringArray0);
      FileSystemUtils.getAbsolutePathName("");
      FileSystemUtils.convertToAbsolutePath("n5");
      FileSystemUtils.createFile("Q2-oZh=Mq^DEB");
      // Undeclared exception!
      try { 
        FileSystemUtils.deleteFileRecursive((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemUtils.convertPathToSystemPath("");
      FileSystemUtils.convertToAbsolutePath("");
      FileSystemUtils.convertPathToSystemPath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/");
      try { 
        FileSystemUtils.createFile("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // This test file already exist!
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemUtils.getAbsolutePathName("^O!})F[O");
      FileSystemUtils.getAbsolutePathName("win");
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/^O!})F[O");
      // Undeclared exception!
      try { 
        FileSystemUtils.deleteFileRecursive((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileSystemUtils.convertToAbsolutePath("");
      FileSystemUtils.getAbsolutePathName("user.dir");
      String[] stringArray0 = new String[3];
      stringArray0[1] = "user.dir";
      stringArray0[2] = "";
      FileSystemUtils.joinPath(stringArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemUtils.convertToAbsolutePath("");
      FileSystemUtils.isSubDir("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/", "sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils");
      FileSystemUtils.isSubDir("user.home", "user.home");
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        FileSystemUtils.joinPath(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileSystemUtils.deleteFileRecursive((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "";
      try { 
        FileSystemUtils.createFile("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // This test file already exist!
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileSystemUtils.convertPathToSystemPath("OC):FvX");
      try { 
        FileSystemUtils.createFile("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // This test file already exist!
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemUtils.createFile("Pk3==rp");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileSystemUtils.isSubDir("Z!U[E&H", "Z!U[E&H");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/0V:~dkni");
      FileSystemUtils.getAbsolutePathName("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/0V:~dkni");
      String string0 = "#<#Q^";
      FileSystemUtils.isSubDir("J1!,m", "#<#Q^");
      FileSystemUtils.convertPathToSystemPath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/0V:~dkni");
      // Undeclared exception!
      try { 
        FileSystemUtils.joinPath((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = "%$^*`ej2Yk";
      FileSystemUtils.convertToAbsolutePath("%$^*`ej2Yk");
      FileSystemUtils.getAbsolutePathName("%$^*`ej2Yk");
      String string1 = "";
      FileSystemUtils.isSubDir("", "");
      FileSystemUtils.getAbsolutePathName("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk");
      FileSystemUtils.getAbsolutePathName("");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6";
      stringArray0[1] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6";
      stringArray0[2] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk";
      stringArray0[3] = "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk";
      FileSystemUtils.joinPath(stringArray0);
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file0).delete();
      doReturn(true).when(file0).exists();
      doReturn(false).when(file0).isDirectory();
      FileSystemUtils.deleteFileRecursive(file0);
      FileSystemUtils.isSubDir("", "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk");
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk");
      File file1 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file1).delete();
      doReturn(true).when(file1).exists();
      doReturn(false).when(file1).isDirectory();
      FileSystemUtils.deleteFileRecursive(file1);
      FileSystemUtils.createFile("\"2):\"7dj");
      FileSystemUtils.createFile("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk");
      FileSystemUtils.convertToAbsolutePath("^");
      FileSystemUtils.convertToAbsolutePath("");
      FileSystemUtils.createFile("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6//Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6//Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk//Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/%$^*`ej2Yk");
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/");
      try { 
        FileSystemUtils.createFile("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // This test file already exist!/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = "t+}zNa9ny;h+oj`^*es";
      FileSystemUtils.convertToAbsolutePath("t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.isSubDir("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es", "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.getAbsolutePathName("t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es");
      boolean boolean0 = false;
      MockFile mockFile0 = new MockFile("t+}zNa9ny;h+oj`^*es");
      // Undeclared exception!
      try { 
        FileSystemUtils.deleteFileRecursive((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileSystemUtils.convertToAbsolutePath("t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.isSubDir("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es", "/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.getAbsolutePathName("t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/t+}zNa9ny;h+oj`^*es");
      MockFile mockFile0 = new MockFile("t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.deleteFileRecursive(mockFile0);
      FileSystemUtils.convertPathToSystemPath("t+}zNa9ny;h+oj`^*es");
      FileSystemUtils.createFile("t+}zNa9ny;h+oj`^*es");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "s+";
      stringArray0[1] = "t+}zNa9ny;h+oj`^*es";
      stringArray0[2] = "s+";
      stringArray0[3] = "t+}zNa9ny;h+oj`^*es";
      stringArray0[3] = "t+}zNa9ny;h+oj`^*es";
      stringArray0[5] = "t+}zNa9ny;h+oj`^*es";
      FileSystemUtils.joinPath(stringArray0);
      FileSystemUtils.isSubDir("t+}zNa9ny;h+oj`^*es", "s+");
      FileSystemUtils.convertToAbsolutePath("s+");
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(file0).delete();
      doReturn(true, false, false).when(file0).exists();
      doReturn(false, false, false).when(file0).isDirectory();
      FileSystemUtils.deleteFileRecursive(file0);
      FileSystemUtils.getAbsolutePathName("s+/t+}zNa9ny;h+oj`^*es/s+/t+}zNa9ny;h+oj`^*es/null/t+}zNa9ny;h+oj`^*es");
      File[] fileArray0 = new File[3];
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = file0;
      fileArray0[2] = file0;
      File file1 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file1).delete();
      doReturn(true).when(file1).exists();
      doReturn(true).when(file1).isDirectory();
      doReturn(fileArray0).when(file1).listFiles();
      FileSystemUtils.deleteFileRecursive(file1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(file0).delete();
      doReturn(true).when(file0).exists();
      doReturn(false).when(file0).isDirectory();
      FileSystemUtils.deleteFileRecursive(file0);
      FileSystemUtils.convertPathToSystemPath("");
      File file1 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(file1).exists();
      FileSystemUtils.deleteFileRecursive(file1);
      FileSystemUtils.convertToAbsolutePath("6{o\" g^w%2A\"8");
      String[] stringArray0 = new String[7];
      stringArray0[2] = "";
      stringArray0[6] = "6{o\" g^w%2A\"8";
      FileSystemUtils.joinPath(stringArray0);
      FileSystemUtils.isSubDir("/", "(\\)+");
      FileSystemUtils.getAbsolutePathName("mEyzG3n;EBK;r");
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      String string0 = "";
      // Undeclared exception!
      try { 
        FileSystemUtils.convertToAbsolutePath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.util.FileSystemUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileSystemUtils.convertPathToSystemPath("n[@X6aEr5-ntl-f7XAg");
      FileSystemUtils.createFile("n[@X6aEr5-ntl-f7XAg");
      FileSystemUtils.convertPathToSystemPath("n[@X6aEr5-ntl-f7XAg");
      FileSystemUtils.getAbsolutePathName("n[@X6aEr5-ntl-f7XAg");
      FileSystemUtils.convertPathToSystemPath("n[@X6aEr5-ntl-f7XAg");
      FileSystemUtils.convertPathToSystemPath("n[@X6aEr5-ntl-f7XAg");
      boolean boolean0 = FileSystemUtils.isSubDir("n[@X6aEr5-ntl-f7XAg", "n[@X6aEr5-ntl-f7XAg");
      String string0 = FileSystemUtils.convertToAbsolutePath("<xLA");
      FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/<xLA");
      String string1 = FileSystemUtils.getAbsolutePathName("<xLA");
      assertTrue(string1.equals((Object)string0));
      
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6");
      FileSystemHandling.createFolder(evoSuiteFile0);
      boolean boolean1 = FileSystemUtils.isSubDir("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/<xLA", "s+");
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
      
      FileSystemUtils.convertToAbsolutePath("F");
      FileSystemUtils.createFile("_2*sOi\rhWux");
      String string2 = FileSystemUtils.convertToAbsolutePath("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/F");
      assertEquals("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/F", string2);
      
      String string3 = FileSystemUtils.getAbsolutePathName("n[@X6aEr5-ntl-f7XAg");
      assertEquals("/Users/dr.fat/IdeaProjects/cs4218-project-ay1920-s2-2020-team6/n[@X6aEr5-ntl-f7XAg", string3);
  }
}
