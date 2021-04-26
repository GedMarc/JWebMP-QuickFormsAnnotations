package com.jwebmp.plugins.quickforms.annotations.formtypes;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface WebSelectComponent
{
    /**
     * Represents the toString() to show as the label
     * @return
     */
    String labelField();

    /**
     * Represents the toString() to have as the value
     * @return
     */
    String valueField();

    /**
     * toString() field that renders the url for an image
     * @return
     */
    String imageUrlField() default "";

    /**
     * toString() field that renders the icon (css) class for an image
     * @return
     */
    String imageCSSField() default "";
}
