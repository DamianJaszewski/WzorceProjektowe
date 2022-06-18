public class User {
    private static User user;

    private String Login;
    private String Name;
    private String Surname;
    private String Token;
    
    protected User() {}

    public String getLogin() {
       return Login;
    }
    public void setLogin(String login) {
       this.Login = login;
    }
  
    public String getName() {
       return Name;
    }
    public void setName(String name) {
       this.Name = name;
    }  
    
    public String getSurname() {
       return Surname;
    }
    public void setSurname(String surname) {
       this.Surname = surname;
    }

    public String getToken() {
       return Token;
    }
    public void setToken(String token) {
       this.Token = token;
    }
  
    public static User getUser() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public void login(String login, String name, String surname, String token){
      Login = login;
      Name = name;
      Surname = surname;
      Token = token;
    } 
}