package org.kelompok4.app.Controller;

import java.util.regex.Pattern;

public interface ICanValidateNoKTP {
        Pattern NoKTP_REGEX = Pattern.compile("^[0-9]*${16,}$", Pattern.CASE_INSENSITIVE);
        boolean validateNoKTP();
}
