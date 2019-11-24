package org.kelompok4.app.Controller;

import java.util.regex.Pattern;

/**
 * LoginRegex
 */
public interface ICanValidateEmail {

    Pattern EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    boolean validateEmail();
}