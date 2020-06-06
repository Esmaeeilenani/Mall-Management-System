package Mall_ManagementSystem;

import java.util.*;

class Shop {

    static ArrayList<Shop> ShopsList = new ArrayList<>();
    private Renter Renter;
    private String Name;
    private int ID;
    private Mall Mall;
    static int MId = 101;

    public Shop(Mall Mall) {

        this.ID = MId++;
        this.Mall = Mall;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Mall getMall() {
        return Mall;
    }

    public void setMall(Mall Mall) {
        this.Mall = Mall;
    }

    public Renter getRental() {
        return Renter;
    }

    public void setRenter(Renter Renter) {
        this.Renter = Renter;
    }

    public static Shop find(int id) {
        for (int i = 0; i < ShopsList.size(); i++) {
            if (ShopsList.get(i).getID() == id) {
                return ShopsList.get(i);
            }
        }
        return null;
    }

    public boolean isRented() {

        return this.Renter != null;
    }

    public String toString() {
        String INFO = "Shope Name: " + this.Name + " Shope ID: " + this.ID;
        if (Renter == null) {
            INFO += "\nNo Rental for this Shop";
        } else {
            INFO += "\n\nRented By: "
                    + "\nRental Name :" + this.Renter.FName + " " + this.Renter.LName
                    + "\nRental Id : " + this.Renter.renterId
                    + "\nEmail :" + this.Renter.email
                    + "\nPhone Number :" + this.Renter.PhoneNumber;
        }
        return INFO;
    }
}
