package Mall_ManagementSystem;


class User {

    protected String FName;
    protected String LName;
    protected String email;
    protected int PhoneNumber;

    public User() {
    }

    public User(String FName, String LName, String email, int PhoneNumber) {
        this.FName = FName;
        this.LName = LName;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
    }

}
