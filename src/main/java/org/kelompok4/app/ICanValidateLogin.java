package org.kelompok4.app;

import java.util.regex.Pattern;

/**
 * LoginRegex
 */
public interface ICanValidateLogin {

    Pattern EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]$", Pattern.CASE_INSENSITIVE);

    boolean validateEmail();



}