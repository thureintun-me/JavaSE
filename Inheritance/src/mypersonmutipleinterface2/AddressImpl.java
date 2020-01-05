package mypersonmutipleinterface2;

public class AddressImpl implements AddressInterface {

    private int streetNumber;
    private String streetName;
    private String country;


    @Override
    public int getStreetNumber() {
        return streetNumber;
    }

    @Override
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public String getStreetName() {
        return streetName;
    }

    @Override
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }


}
