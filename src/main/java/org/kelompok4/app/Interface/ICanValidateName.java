package org.kelompok4.app.Interface;

import java.util.regex.Pattern;

public interface ICanValidateName {
    Pattern NAME_REGEX = Pattern.compile("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", Pattern.CASE_INSENSITIVE);
    boolean validateName();
}
