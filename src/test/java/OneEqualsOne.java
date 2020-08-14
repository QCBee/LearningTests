import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OneEqualsOne {
    @BeforeMethod
    public static void start(){
        System.out.println("Executing Before Method Annotation for test_2");
    }

    @Test
    public static void testOneEqualsOne(){
        assert 1 == 1;
        System.out.println("Executing Test Annotation for test_2");
    }

    @AfterMethod
    public static void end(){
        System.out.println("Executing After Method Annotation for test_2");
    }
}
