import learnbyexample.ExceptionFunction;
import org.junit.Test;

import java.util.function.Function;

public class TestFunctionsConcurrency {

    private static final Function<String, Integer> FUNCTION = f1 -> {

        ExceptionFunction<Integer> exceptionFunction = () -> {
            try {
                Object object = null;
                int value = ((Long) object).intValue();
                return value;
            } catch (Exception ex) {
                throw ex;
            }
        };

        return exceptionFunction.returnElseDefault(0);
    };

    @Test
    public void main() {
        Integer value = FUNCTION.apply(null);
        System.out.println(value);
    }

}
