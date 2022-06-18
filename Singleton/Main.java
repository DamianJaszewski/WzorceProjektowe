class Main {
  public static void main(String[] args) {
    
    Singleton singleton = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    if(singleton == singleton2){
       System.out.println("Identyczne!");
    }

    User user = User.getUser();
    User user1 = User.getUser();

    user.login("DamiJas", "Damian", "Jaszewski", "DJ01");
    
    System.out.println(user.getLogin());
    System.out.println(user1.getLogin());
  }
}

