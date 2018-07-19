import org.testng.annotations.*;

public class Test3 {

    @BeforeClass
    public void beforeclass()
    {
        System.out.println("- test3 before class");
    }

    @BeforeMethod
    public void beforemethod()
    {
        System.out.println("- test3 before method");
    }

    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("- test3 before suite");
    }

    @BeforeTest
    public void beforetest()
    {
        System.out.println("- test3 before test");
    }

    @Test
    public void test()
    {
        System.out.println("--- test3 test");
    }
}