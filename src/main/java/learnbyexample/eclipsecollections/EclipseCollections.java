package learnbyexample.eclipsecollections;

import org.eclipse.collections.api.block.function.Function;
import org.eclipse.collections.api.block.predicate.primitive.IntPredicate;
import org.eclipse.collections.api.list.primitive.IntList;
import org.eclipse.collections.impl.factory.primitive.IntLists;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EclipseCollections {

    private static final IntList eclipseIntList = IntLists.immutable.ofAll(IntStream.range(1, 10000));
    private static final List<Integer> list = IntStream.range(1, 10000).boxed().collect(Collectors.toList());

    private static final IntPredicate intPredicate = p -> p == 9874;
    private static final java.util.function.IntPredicate javaIntPredicate = p -> p == 9874;
    private static final Function<Integer, Integer> function = Integer::intValue;
    private static final java.util.function.Predicate<Integer> javaPredicate = p -> p == 9874;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(intPredicate.test(9874));
        System.out.println(System.currentTimeMillis() - startTime);
        startTime = System.currentTimeMillis();
        System.out.println(javaIntPredicate.test(9874));
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
