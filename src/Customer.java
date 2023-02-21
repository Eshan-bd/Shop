public class Customer extends User {
    private String name;
    private String email;

    public Customer(String userID, String pass, String name, String email) {
        super(userID, pass);
        this.name = name;
        this.email = email;
    }

    public void register(){

    }

    public void login(){
        try{
            this.verifyLogin();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Logged in.");
    }

    public void updateProfile(String name, String email){
        this.name = name;
        this.email = email;
     }
}