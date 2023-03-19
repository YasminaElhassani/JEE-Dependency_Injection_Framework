package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {

    //On va tester la classe Calcul
    private Calcul calcul;
    @Test
    public void testSomme(){

        Calcul calcul=new Calcul();
        double a=16; double b=14;
        double expected=30;
        double result=calcul.somme(a,b);
        Assert.assertTrue(expected==result);
    }
}
