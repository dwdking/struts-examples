package org.apache.struts.edit.validator;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

/**
 * Created by kingdan on 15/07/15.
 */
public class NumberFieldValidator extends FieldValidatorSupport {

    private boolean isValid;

    public void validate(Object object) throws ValidationException {
        java.util.logging.Logger.getGlobal().info("Here is a log line");
        final boolean temp = isValid;
        isValid = !temp;
        java.util.logging.Logger.getGlobal().info(Boolean.toString(isValid));
    }
}
