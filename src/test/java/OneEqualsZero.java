import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OneEqualsZero {
    @BeforeMethod
    public static void start(){
        System.out.println("Executing Before Method Annotation for test_1");
    }

    @Test
    public static void testOneEqualsZero(){
        System.out.println("Executing Test Annotation for test_1");
        assert 1 == 0;
    }

    @AfterMethod
    public static void end(){
        System.out.println("Executing After Mathod Annotation for test_1");
    }
}
