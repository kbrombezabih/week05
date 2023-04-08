package week05;

public class AsteriskLogger implements Logger {

  @Override
  public void log(String log) {
    
    System.out.println("***" + log + "***");
    
    
    
  }

  @Override
  public void error(String error) {
   checkAsterisk(error);
    System.out.println("***Error: "+ error + "***" );
   checkAsterisk(error);
    
  }
 public static void checkAsterisk(String error) {
  int num = 13 + error.length();
  for(int i=0; i< num; i++ ) {
    System.out.print("*");
  }
  System.out.println();
  }

}
