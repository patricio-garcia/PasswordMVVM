package cl.desafiolatam.passwordmvvm.model;

public class Verifier {

    private static final int weak = 0;
    private static final int medium = 1;
    private static final int strong = 2;
    private static final int very_strong = 3;
    private static final int min_length = 4;

    public int checkPassword(String password) {
        boolean rule1 = checkLength(password);
        boolean rule2 = checkUpperLower(password);
        boolean rule3 = checkDigit(password);

        if (rule1 == false) {
            return weak;
        }

        if (rule1 == true && rule2 == false) {
            return medium;
        }

        if (rule1 == true && rule2 == true && rule3 == false) {
            return strong;
        }

        if (rule1 == true && rule2 == true && rule3 == true) {
            return very_strong;
        }
        return weak;
    }

    private boolean checkLength(final String password)
    {
        return password.length() > min_length;
    }

    private boolean checkUpperLower(final String password)
    {
        return !password.toUpperCase().equals(password);
    }

    private boolean checkDigit(final String password)
    {
        return password.matches(".*\\d.*");
    }

}
