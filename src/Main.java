public class Main {
    public static void main(String[] args) throws Exception{
        String login = "аb_cfghfgh1";
        String password = "password";
        String confPassword = "password";
        Data.checkData(login, password, confPassword);
        try {
            Data.checkData(login, password, confPassword);
        } catch (WrongLoginException e,WrongPasswordException e){
            System.out.println("Перехват не корректный логин");
        }
    }
}