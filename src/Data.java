import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data {

    public static void checkData(String login, String password, String confirmPassword) throws Exception  {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]*$");
        Matcher loginMatcher = pattern.matcher(login);
        Matcher passwordMatcher = pattern.matcher(password);
        if (
            login.length() > 20
            || login.length() < 1
            || login.isEmpty()
            || login.isBlank()
            || !loginMatcher.matches()) {
            throw new WrongLoginException("Не корректный логин");
        }
        if (
            password.length() > 20
            || password.length() < 1
            || password.isEmpty()
            || password.isBlank()
            || !passwordMatcher.matches()
            || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}
