package com.jwebmp.plugins.quickforms.annotations.states;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface WebReadOnlyPlainText
{
    String bind() default  "";
    /**
     * Any additional styles to add
     *
     * @return
     */
    String style() default "";

    /**
     * Any additional classes to add
     *
     * @return
     */
    String classes() default "";
}
