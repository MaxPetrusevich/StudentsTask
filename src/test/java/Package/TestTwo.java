package Package;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTwo {
    @Test
    public void Test1(){
        Assert.assertTrue(StudentClient.typeSuper/Math.random() >= StudentClient.typeSuper);
    }

    @Before
    public void BeforeTest(){
        System.out.println("Test init");
    }

    @After
    public void AfterTest(){
        System.out.println("Test is over");
    }
}
