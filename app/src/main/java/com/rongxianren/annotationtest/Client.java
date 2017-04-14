package com.rongxianren.annotationtest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by wty on 2017/4/14.
 */

public class Client {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.rongxianren.annotationtest.People");
            Method method = clazz.getMethod("peopleInfo",String.class, int.class);
            MAnnotation mAnnotation = method.getAnnotation(MAnnotation.class);

            System.out.println("------------------"+mAnnotation.methodName());
            System.out.println("------------------"+mAnnotation.parameterCount());
            System.out.println("------------------"+mAnnotation.status());

            Annotation[][] pAnnotation = method.getParameterAnnotations();
            System.out.println("--------pAnnotation[0][0].name()----------"+((PAnnotation)pAnnotation[0][0]).name());
            System.out.println("--------pAnnotation[0][0].name()----------"+((PAnnotation)pAnnotation[1][0]).age());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
