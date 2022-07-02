package com.anilduyguc.validator;

import com.anilduyguc.annotation.CourseCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
    private String coursePrefix;
    @Override
    public void initialize(CourseCode courseCode) {
        coursePrefix = courseCode.value(); // Assign the value passed in from CourseCode annotation


    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext context) {
        if (theCode != null)  return theCode.startsWith(coursePrefix);
        return false;
    }
}
