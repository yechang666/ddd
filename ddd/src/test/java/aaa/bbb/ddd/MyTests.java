package aaa.bbb.ddd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyTests {
    @Before
    public void before(){
        System.out.println("Test before");
    }
    @After
    public void after(){
        System.out.println("Test after");
    }

    @Test
    public void aaa(){
        System.out.println("Test a");
    }
    @Test
    public void bbb(){
        System.out.println("Test b");
    }
    @Test
    public void ccc(){
        System.out.println("Test c");
    }
}
