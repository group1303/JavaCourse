package warmup1.tests;

import warmup1.SimpleUnit;
import warmup1.utils.MathUtils;

public class ModTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(5,2),1));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(5,2),2));
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(5,2),2));

        try{
            MathUtils.mod(5,0);
        } catch(ArithmeticException ex){
            System.out.println(SimpleUnit.assertEquals(ex.getMessage(),"Divider can't be 0"));
        }

        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(2,5),0));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(5,2),0));
    }
}
