/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwebmp.plugins.quickforms.annotations;

import java.lang.annotation.*;

/**
 * @author GedMarc
 * @since 25 Mar 2017
 */
@Target({ElementType.FIELD, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface DecimalField
{
	String placeholder() default "";

	String style() default "";

	String classes() default "";

	boolean required() default false;

	int precision() default 0;

	int scale() default -1;

	double minimumValue() default Double.MIN_VALUE;
	
	double maximumValue() default Double.MIN_VALUE;

	double step() default 0d;

	boolean showControlFeedback() default true;

	String regex() default "";

	String regexBind() default "";
}
