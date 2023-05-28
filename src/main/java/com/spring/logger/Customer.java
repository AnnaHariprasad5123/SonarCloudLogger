package com.spring.logger;


import com.spring.logger.validation.CourseCode;

import javax.validation.constraints.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ToString
public class Customer {

    private static final Logger logger = LoggerFactory.getLogger(Customer.class);

    private @Getter @Setter String firstName;

    @NotNull(message="is required")  // message if validation fails
    @Size(min=1, message="is required") // message if validation fails
    private @Getter @Setter String lastName;

    @NotNull(message="is required")
    @Min(value=0, message="must be greater than or equal to zero")
    @Max(value=10, message="must less than or equal to 10")
    private @Getter @Setter Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "only 5 chars/digits")
    private @Getter @Setter String postalCode;

    @CourseCode(value="APS",message="must start with APS") //custom validation
    private @Getter @Setter String courseCode;

}
