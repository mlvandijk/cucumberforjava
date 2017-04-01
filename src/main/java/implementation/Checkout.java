package implementation;

/** Can you write an implementation that makes the scenario pass? (p. 25)
 * Created by maritvandijk on 4/1/17.
 */
public class Checkout {
    public int total = 0;

    public void add(int itemCount, int itemPrice){
        total += itemCount * itemPrice;
    }


}

