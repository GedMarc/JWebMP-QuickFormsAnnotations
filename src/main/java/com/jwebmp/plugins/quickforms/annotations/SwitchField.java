package com.jwebmp.plugins.quickforms.annotations;

import java.lang.annotation.*;

/**
 * @author GedMarc
 * @since 25 Mar 2017
 */
@Target({ElementType.FIELD, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface SwitchField
{

	String style() default "";

	String classes() default "";

	boolean required() default false;

	boolean showControlFeedback() default true;

	String onText() default "";

	String offText() default "";

	String regex() default "";

	String regexBind() default "";
}
