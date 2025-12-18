package Lab3;

public class Address {

    String street;
    String city;
    String zipcode;

    public Address(String street, String city, String zipcode){
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getStreet(){ 
        return street;
    }   

    public String getCity(){
        return city;
    }

    public String getZipcode(){
        return zipcode;
    }
}
