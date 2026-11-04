import java.util.Random;

public class Dice4 {

    private int die1;
    private int die2;
    private Random randGen;
    
    public Dice4 ( ) {
        randGen = new Random ( );
    }
    
    public void roll ( ) {
        die1 = 1 + randGen.nextInt (6);
        die2 = 1 + randGen.nextInt (6);
    }
    
    public int total ( ) {
        return die1 + die2;
    }
    
    public void runTest6In4Rolls(int howMany)
    {
        int count = 0,counter = 0;
        while(counter < howMany){
            if(takeATurnASixInFourRolls())
                count++;
            counter++;
        }
        System.out.println(count + " one 6 in 4 rolls tried " + howMany + " times : " + count * 1.0 / howMany);
    }
    

    private boolean takeATurnASixInFourRolls(){
        int counter = 0;
        while(counter < 4)
        {
                this.roll();
                if(die1 == 6)
                    return true;
                counter++;    
        }
        return false;
    }
    
    
    public void runTest12In24Rolls(int howMany){
        int coconuts  = 0;
        int coconut = 0;
        while (coconuts < howMany){
            if(takeATurnA12In24Rolls()){
                coconut ++;
            }
            coconuts ++;
        }
        System.out.println(coconut + " one 12 in 24 rolls tried" + howMany + " times gives a " + (1.0*coconut/howMany)*100 + "% success rate.");
    }
    
    
    private boolean takeATurnA12In24Rolls(){
        int counter = 0;
        while (counter < 24){
            this.roll();
            if (die1 + die2 == 12){
                return true;
            }
            counter ++;
        }
        return false;

    }
}