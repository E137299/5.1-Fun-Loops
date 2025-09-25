public class Main{
  public static void main(String[] args){

    
  }

    // Method to measure how long a Runnable takes to execute
  public static void measureTime(Runnable codeBlock) {
      long start = System.nanoTime();   // record start time
      codeBlock.run();                  // run the code
      long end = System.nanoTime();     // record end time

      long duration = end - start; // time in nanoseconds
      double millis = duration / 1_000_000.0;

      System.out.println("Execution time: " + millis + " ms");
  }
}
