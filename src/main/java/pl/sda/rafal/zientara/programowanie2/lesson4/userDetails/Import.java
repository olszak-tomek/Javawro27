package pl.sda.rafal.zientara.programowanie2.lesson4.userDetails;

import java.io.*;

public class Import {

    public Import() {
    }

    public UserDetails insertFile(String fileName) {
        UserDetails userDetails = new UserDetails();
        File file = new File(fileName);
        try {

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String name = bufferedReader.readLine().substring(6);
            String age = bufferedReader.readLine().substring(4);
            String eMail = bufferedReader.readLine().substring(6);
            String phoneNumber = bufferedReader.readLine().substring(6);
            bufferedReader.close();

            userDetails.setName(name);
            userDetails.setLastName(age);
            userDetails.seteMail(eMail);
            userDetails.setPhoneNumber(phoneNumber);

        } catch (IOException e) {
            e.printStackTrace();
        }
return userDetails;
    }
}
