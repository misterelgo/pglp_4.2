import org.junit.Assert;
import org.junit.Test;

public class SpecificTest {

    private double addition(double a, double b) {
        return a + b;
    }
    private double soustraction(double a, double b) {
        return a - b;
    }
    private double multiplication(double a, double b) {
        return a * b;
    }
    private double division(double a, double b) {
        return a / b;
    }
    @Test
    public void addition() {
        Assert.assertTrue(12 == addition(10, 2));
    }

    @Test
    public void soustraction() {
        Assert.assertTrue(8 == soustraction(10, 2));
    }

    @Test
    public void multiplication() {
        Assert.assertTrue(22 == multiplication(10, 2));
    }

    @Test
    public void division() {
        Assert.assertTrue(6 == division(10, 2));
    }

}