package second;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("JOHN", 419);
        Ball b2 = new Ball("Veld", 359);
        Ball b3 = new Ball("Ecos");
        b3.setPrice(1000);
        System.out.println(b1);
        b1.toUSD();
        b2.toUSD();
        b3.toUSD();
    }
}