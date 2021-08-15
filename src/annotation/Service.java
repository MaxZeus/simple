package annotation;


import java.io.Serializable;
import java.lang.annotation.*;


@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Service {
    String name();
    boolean lazyload() default true;

}
