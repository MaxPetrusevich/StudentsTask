package Package;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.Random;

public class TestOne {
    @Test
    public void Test(){
        Assert.assertTrue(Math.random() > 0.1 && Math.random() < 0.9);
    }

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
