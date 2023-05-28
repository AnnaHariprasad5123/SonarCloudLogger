package com.spring.logger.validation;

import com.spring.logger.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private static final Logger logger = LoggerFactory.getLogger(CourseCodeConstraintValidator.class);
    private  String coursePrefix;

    @Override
    public void initialize(CourseCode theCourseCode){
        coursePrefix = theCourseCode.value();
        logger.trace("initialize the coursePrefix as {}",coursePrefix);
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theconstraintValidatorContext) {
        boolean result;
        if(theCode != null){
            result = theCode.startsWith(coursePrefix);
        }
        else{
            result = true;
        }
        return result;
    }
}
