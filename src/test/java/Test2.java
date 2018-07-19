import org.testng.annotations.*;

public class Test2 {

    @BeforeClass
    public void beforeclass()
    {
        System.out.println("- test2 before class");
    }

    @BeforeMethod
    public void beforemethod()
    {
        System.out.println("- test2 before method");
    }

    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("- test2 before suite");
    }

    @BeforeTest
    public void beforetest()
    {
        System.out.println("- test2 before test");
    }

    @Test
    public void test()
    {
        System.out.println("--- test2 test");
    }
}
