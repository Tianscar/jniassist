package com.tianscar.jni.assist;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.METHOD})
public @interface CString {

    String value() default "";
    String length() default "wcslen";
    String cast() default "const wchar_t *";

}
