package learnbyexample.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FuncTest {

    private static final class MyClass {
        public String strA;
        public String strB;
    }

    private static final class MyFunc implements Function<MyClass, Void> {

        @Override
        public Void apply(MyClass t) {
            t.strA = "Declan";
            return null;
        }

    }

    private static final class MyOp implements UnaryOperator<MyClass> {

        @Override
        public MyClass apply(MyClass t) {
            t.strA = "Op";
            return t;
        }

    }

    private static final class MyCon implements Consumer<MyClass> {

        @Override
        public void accept(MyClass t) {
            t.strA = "Consumed";
        }

    }

    public static void main(String[] args) {
        MyClass cl = new MyClass();
        cl.strA = "Mo";
        // Func
        MyFunc func = new MyFunc();
        func.apply(cl);
        System.out.println("1:"+cl.strA);
        cl.strA = "Changed";
        System.out.println("2:"+cl.strA);
        func.apply(cl);
        System.out.println("3:"+cl.strA);
        // Op
        MyOp op = new MyOp();
        //cl = op.apply(cl);
        System.out.println("4:"+cl.strA);
        // Consumer
        MyCon con = new MyCon();
        con.accept(cl);
        System.out.println("5:"+cl.strA);

        String param7Value = "100";
        if (true) {
            param7Value = "000";
        }
        System.out.println("param7Value" + param7Value);
    }

}
