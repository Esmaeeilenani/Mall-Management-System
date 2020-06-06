package Mall_ManagementSystem;

import java.util.ArrayList;

public class Renter extends User {

    private ArrayList<Shop> ShopeList = new ArrayList<>();
    protected int renterId;
    static ArrayList<Renter> RenterList = new ArrayList<>();

    public Renter(String FName, String LName, String email, int PhoneNumber, int rentalId) {
        super(FName, LName, email, PhoneNumber);
        this.renterId = rentalId;
    }

    public void setFName(String FName) {
        this.FName = FName;
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

    public int getRenterId() {
        return renterId;
    }

    public ArrayList<Shop> getShopeList() {
        return ShopeList;
    }

    public void AddShope(Shop Shope) {
        this.ShopeList.add(Shope);
    }

    public String getFullname() {
        return this.FName + " " + LName;
    }

    public static Renter find(int id) {
        for (int i = 0; i < RenterList.size(); i++) {
            if (RenterList.get(i).getRenterId() == id) {
                return RenterList.get(i);
            }
        }

        return null;
    }

}
