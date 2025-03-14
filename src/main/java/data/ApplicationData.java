package data;

public class ApplicationData {

    private final String firstname;
    private final String lastname;
    private final String age;
    private final String address1;
    private final String address2;
    private final String address3;
    private final String address4;
    private final String postcode;
    private final String email;
    private final String amount;

    public ApplicationData(String firstname, String lastname, String age, String address1, String address2, String address3, String address4, String postcode, String email, String amount) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
        this.postcode = postcode;
        this.email = email;
        this.amount = amount;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAge() {
        return age;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getAddress3() {
        return address3;
    }

    public String getAddress4() {
        return address4;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getEmail() {
        return email;
    }

    public String getAmount() {
        return amount;
    }
}
