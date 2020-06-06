package Mall_ManagementSystem;

import java.util.ArrayList;

class Mall {

    private Owner Owner;
    private ArrayList<Shop> shops = new ArrayList();
    protected String name;
    protected String address;
    private String openingHour;
    private String closingHour;
    static Mall mall = new Mall();

    Mall() {
    }

    public Mall(String name, Owner owner, String address, String openingHour, String closingHour) {
        this.name = name;
        this.Owner = owner;
        this.address = address;
        this.closingHour = closingHour;
        this.openingHour = openingHour;

    }

    public void addShops(Shop shop) {
        this.shops.add(shop);

    }

    public void setname(String name) {
        this.name = name;
    }

    public void setOwner(Owner owner) {
        this.Owner = owner;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOpeningHour(String openingHour) {
        this.openingHour = openingHour;
    }

    public void setClosingHour(String closingHour) {
        this.closingHour = closingHour;
    }

    public String getname() {
        return name;
    }

    public Owner getOwner() {
        return Owner;
    }

    public String getAddress() {
        return address;
    }

    public String getOpeningHour() {
        return openingHour;
    }

    public String getClosingHour() {
        return closingHour;
    }

    public ArrayList<Shop> getShops() {

        return shops;
    }

    public String toString() {
        String INFO = this.Owner.toString()
                + "\nMall Name: " + this.name
                + "\nMall Address: " + this.address
                + "\nOpen Hour: " + this.openingHour
                + "\nClose Hour: " + this.closingHour;
        return INFO;
    }
}
