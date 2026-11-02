import java.util.Random;

public class Dice2 {

   private Random randGen;
   private BarChart12 bars;

   public Dice2 ( ) {
      randGen = new Random ( );
      bars = new BarChart12();
   }

   public int nextRoll( ) {
      // You supply this code.
      return randGen.nextInt(6)+1 + randGen.nextInt(6)+1;

 
   }
	
   public void tester (int howMany) {
	  int k;
	  k = 0;
	  while (k < howMany) {
	     bars.add(nextRoll ( ));
	     k = k + 1;
	     bars.updateUI();    // tells the bar chart to update its picture
	     sleep(1);

	  }

   }

   // This will make the program hesitate for a certain number of milliseconds.
   private void sleep(long milliseconds) {
      try {
         java.lang.Thread.sleep (milliseconds);
     } catch (Exception e) {
     }
   }
  
}
