public abstract class User {
    private final String userID;
    private String pass;

    public User(String userID, String pass) {
        this.userID = userID;
        this.pass = pass;
    }

    protected boolean verifyLogin() throws UserNotFoundException{
        //throw new UserNotFoundException();
        return true;
    }

}
