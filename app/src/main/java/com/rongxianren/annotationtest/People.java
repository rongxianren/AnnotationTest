package com.rongxianren.annotationtest;

import java.lang.reflect.Method;

/**
 * Created by wty on 2017/4/13.
 */

public class People {

    @MAnnotation(methodName = "peopleInfo", parameterCount = 2, status = MAnnotation.Status.NOT_START)
    public void peopleInfo(@PAnnotation(name = "LinHuaHua") String name, @PAnnotation(age = 28) int age){  //
        System.out.println("-----name---- = "+name+"----age----- = "+age);
    }

}
