package cn.iyanyu.base.comm.factories;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface SpiInterface {
    String defaultId() default "";
}
