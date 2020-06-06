package Mall_ManagementSystem;

public class Owner extends User {

    static Owner owner = new Owner();

    public Owner(String FName, String FLast, String email, int PhoneNumber) {
        super(FName, FLast, email, PhoneNumber);
    }

    Owner() {

    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public String toString() {
        String INFO = "Owner Name :" + super.FName + " " + super.LName
                + "\nEmail :" + super.email
                + "\nPhone Number :" + super.PhoneNumber;
        return INFO;
    }

}
