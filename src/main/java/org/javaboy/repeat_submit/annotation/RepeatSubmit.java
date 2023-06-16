package org.javaboy.repeat_submit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xyma
 * @version 1.0
 * @data 2023/6/16 13:54
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RepeatSubmit {
    int interval() default 5000;
    String message() default "不允许重复提交，请稍后再试";
}
