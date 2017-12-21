package Test;
import org.junit.Test;
import junit.framework.Assert;
import qwe.calculator;
public class Testclc {
@Test
public void testing(){
calculator k = new calculator();
float A=k.Result(12000,10,12);
if(A!=1100)Assert.fail();
}
}