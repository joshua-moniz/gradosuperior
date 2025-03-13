public class PasswordValidator {

    // Verifica si una contrasenya és vàlida
    public static boolean validarContrasenya(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        return password.matches(".*[A-Z].*") && // Almenys una majúscula
                password.matches(".*\\d.*") &&   // Almenys un número
                password.matches(".*[@#$%^&+=!].*"); // Almenys un símbol especial
    }
}