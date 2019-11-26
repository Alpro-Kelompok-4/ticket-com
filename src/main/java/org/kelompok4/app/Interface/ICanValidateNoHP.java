package org.kelompok4.app.Interface;

import java.util.regex.Pattern;

public interface ICanValidateNoHP {
    Pattern NoHP_REGEX = Pattern.compile("^[0-9]*${11,12}$", Pattern.CASE_INSENSITIVE);
    boolean validateNoHP();
}
