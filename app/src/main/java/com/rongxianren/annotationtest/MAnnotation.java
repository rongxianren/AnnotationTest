package com.rongxianren.annotationtest;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wty on 2017/4/13.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MAnnotation {
    enum Status{ START, NOT_START};
    String methodName() default "haven't set name";
    int parameterCount() default 0;
    Status status() default Status.NOT_START;
}
