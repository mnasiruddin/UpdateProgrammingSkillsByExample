package learnbyexample.annotations;

import java.lang.reflect.Field;

public class AnnotationPratice {

    static {
        Class aClass = AnnotationPratice.class;
        Field[] fields = aClass.getFields();
        Field field = fields[1];
        field.getAnnotatedType();
    }
}
