package com.anilduyguc.annotation;

import com.anilduyguc.validator.CourseCodeConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class) // helper class where the validation occurs
@Target( { ElementType.METHOD, ElementType.FIELD}) // where can annotation be applied
@Retention(RetentionPolicy.RUNTIME) // how long the retention policy lasts --> use it by the run time
public @interface CourseCode {
    public String value() default "LUV";
    public String message() default "must start with LUV" ;

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};

}
