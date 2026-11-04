import java.util.Random;

public class Generator {

   private Random randGen;
   private BarChart12 bars;

   public Generator ( ) {
      randGen = new Random ( );
      bars = new BarChart12();
   }

   
   public int generator1( ) {
      int r = randGen.nextInt(6)+1;
      return r;
   }
    
   
   public int generator2( ) {
      int r = randGen.nextInt(6)+1 + randGen.nextInt(6)+1;
      return r;
   }
   
   
   public int generator3( ) {
      int r = randGen.nextInt(12)+1;
      return r;
   }
   
   
   public int generator4(int forbidden) {
      int r = randGen.nextInt(6)+1;
      if (r == forbidden){
         r = -1;
      }
      return r;
      }
   
   
   public void tester (int whichTest, int howMany, int forbidden) {
      int k;
      k = 0;
      bars.clear();        // clear the graph
      while (k < howMany) {
         if (whichTest == 1) {
            bars.add(generator1 ( ));
         } else if (whichTest == 2) {
            bars.add(generator2( ));
         } else if (whichTest == 3) {
            bars.add(generator3( ));
         } else if (whichTest == 4) {
            bars.add(generator4(forbidden));
         } else {
            System.out.println("I don't have such a test!");
            break;
         };
         k = k + 1;
      }
      bars.updateUI();     // tells the bar chart to update its picture
   }



   public static void main(String[] args) {
      Generator g = new Generator();
      g.tester(4, 1000000000, 6);
   }

   
}
