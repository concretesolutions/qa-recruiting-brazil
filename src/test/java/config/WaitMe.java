package config;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WaitMe {
    int seconds() default 60;
    boolean onlyImplicity() default true;
}
