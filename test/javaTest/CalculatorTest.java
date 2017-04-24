package javaTest;
/**
 * 最主要地一个Package就是org.junit.*。把它包含进来之后，绝大部分功能就有了。
 * 还有一句话也非常地重要“import static org.junit.Assert.*;”，
 * 我们在测试的时候使用的一系列assertEquals方法就来自这个包。
 * 大家注意一下，这是一个静态包含（static），是JDK5中新增添的一个功能。
 * 也就是说，assertEquals是Assert类中的一系列的静态方法，
 * 一般的使用方式是Assert. assertEquals()，但是使用了静态包含后，
 * 前面的类名就可以省略了，使用起来更加的方便。
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import com.tbgdwj.test.Calculator;


public class CalculatorTest {
	/**
	 * 你要测试哪个类，那么你首先就要创建一个该类的对象。
	 */
    private static Calculator calculator = new Calculator();

    //“标注”也是JDK5的一个新特性
    @Before
    public void setUp() throws Exception {
        calculator.clear();
    }
    
    /**
     * 你要在方法的前面使用@Test标注，以表明这是一个测试方法。
     * 对于方法的声明也有如下要求：名字可以随便取，没有任何限制，
     * 但是返回值必须为void，而且不能有任何参数。如果违反这些规定，
     * 会在运行时抛出一个异常。至于方法内该写些什么，那就要看你需要测试些什么了。
     * 
     * 判断期待结果和实际结果是否相等，第一个参数填写期待结果，第二个参数填写实际结果，
     * 也就是通过计算得到的结果。这样写好之后，JUnit会自动进行测试并把测试结果反馈给用户。
     */
    @Test
    public void testAdd() {
        calculator.add(2);
        calculator.add(3);
        assertEquals(5, calculator.getResult());
    }

    @Test
    public void testSubstract() {
        calculator.add(10);
        calculator.substract(2);
        assertEquals(8, calculator.getResult());
    }
    
    /*
     * 在这种测试函数的前面加上@Ignore标注，这个标注的含义就是“某些方法尚未完成，
     * 暂不参与此次测试”。这样的话测试结果就会提示你有几个测试被忽略，而不是失败。
     * 一旦你完成了相应函数，只需要把@Ignore标注删去，就可以进行正常的测试。
     * 
     */    
    @Ignore("Multiply() Not yet implemented")
    @Test
    public void testMultiply() {
    }

    @Test
    public void testDivide() {
        calculator.add(8);
        calculator.divide(2);
        assertEquals(4, calculator.getResult());
    }

}
