package Entity;

public class User {
    private int userId;
    private String userName;

    public User(){}
    public User(int userId) {
        this.userId = userId;
    }
    public User(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
