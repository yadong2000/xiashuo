package com.convenient.excel.export.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标注在
 */
@Target(value = {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelISheetFiled {
    String name() default "sheet1";



    String namespace() default "";


}
