package pl.sda.rafal.zientara.programowanie2.lesson4.userDetails;

public class UserDetails {


    private String name;
    private String age;
    private String eMail;
    private String phoneNumber;

    public UserDetails(String name, String age, String eMail, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public UserDetails() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String age) {
        this.age = age;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Dane nowego u¿ytkownika: " + name+ ", "+ age+ ", "+ eMail+", "+phoneNumber;
    }
}
