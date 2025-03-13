import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Scanner;

public class PasswordValidatorTest {

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"cffefe","cffssssssssefe12",""})
    public void validarContraseña(String contraseña){
        Assertions.assertFalse(PasswordValidator.validarContrasenya(contraseña));
    }
    @ParameterizedTest
    @ValueSource(strings = {"cffefe","cffssssssssefe12","cfefe24"})
    public void az(String contraseña){
        Assertions.assertFalse(contraseña.matches(".*[A-Z].*"));
    }
    @ParameterizedTest
    @ValueSource(strings = {"cffefe","cffssssssssefe12","cfefe24"})
    public void d (String contraseña){
        Assertions.assertFalse(contraseña.matches(".*\\d.*"));
    }
    @ParameterizedTest
    @ValueSource(strings = {"cffefe","cffssssssssefe12","cfefe24"})
    public void teclasespeciales (String contraseña){
        Assertions.assertFalse(contraseña.matches(".*[@#$%^&+=!].*"));
    }
}
