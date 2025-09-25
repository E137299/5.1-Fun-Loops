public class Main{
  public static void main(String[] args){
      long start = System.nanoTime();   

    //Run your method here

    
      long end = System.nanoTime();     

      long duration = end - start; // time in nanoseconds
      double millis = duration / 1_000_000.0;

      System.out.println("Execution time: " + millis + " ms");
    
  }
}
