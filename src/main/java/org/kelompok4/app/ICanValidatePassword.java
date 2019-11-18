package org.kelompok4.app;

import java.util.regex.Pattern;

public interface ICanValidatePassword {
    //Minimum 8 Char denfan 1 char dan 1 number
    Pattern PASSWORD_REGEX = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", Pattern.CASE_INSENSITIVE);
    boolean validatePassword();
}
