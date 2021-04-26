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
public @interface SearchField
{
	String group();

	String style() default "";

	String classes() default "";

	boolean showControlFeedback() default true;

	boolean required() default false;

	int minLength() default Integer.MIN_VALUE;

	int maxLength() default Integer.MIN_VALUE;


	String regex() default "";

	String regexBind() default "";

}
