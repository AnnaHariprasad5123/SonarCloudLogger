package com.spring.logger;

import lombok.Cleanup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/")
    public String showForm(Model theModel){

        logger.trace("create a new student object");
        Customer thecustomer = new Customer();
        logger.debug("{}",thecustomer);
        logger.trace("add customer object to the model");
        theModel.addAttribute("customer",thecustomer);

        return "customer-form";
    }
    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {

        logger.info("Lastname: {}", theCustomer.getLastName());
        logger.info("Binding result : {}",theBindingResult);

        logger.trace("Checking errors");
        if(theBindingResult.hasErrors()){
            logger.error("Validations are failed");
            return "customer-form";
        }
        else {
            logger.trace("Validations are passed");
            return "customer-confirmation";
        }
    }

}
