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
public @interface WebFormStartRow
{
	/**
	 * Styles to get added onto the row div
	 * @return
	 */
	String style() default "";

	/**
	 * Classes to get added onto the row div
	 * @return
	 */
	String classes() default "";
}
