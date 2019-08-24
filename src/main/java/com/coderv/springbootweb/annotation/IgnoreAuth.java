package com.coderv.springbootweb.annotation;

import java.lang.annotation.*;


/*
表明这个注解应该被 javadoc工具记录
@Documented

作用于方法级别
@Target(ElementType.METHOD)

这种类型的Annotations将被JVM保留,所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用.
@Retention(RetentionPolicy.RUNTIME)
* */


@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreAuth {
}



