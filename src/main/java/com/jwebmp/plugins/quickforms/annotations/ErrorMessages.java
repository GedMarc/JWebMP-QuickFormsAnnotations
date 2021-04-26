package com.jwebmp.plugins.quickforms.annotations;

import java.lang.annotation.*;

/**
 * Renders error help texts client side
 */
@Target({ElementType.FIELD, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ErrorMessages
{
    boolean inline() default false;

    String requiredMessage() default "This field is required";

    String patternMessage() default "The entered value does not match the field";

    String minMessage() default "The value entered is too low";

    String minLengthMessage() default "The entered text is not long enough";

    String maxLengthMessage() default "The entered text is too long";

    String maxMessage() default "The value entered is too high";
}

