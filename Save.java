import java.io.*;
import java.util.ArrayList;

public class Save {

    public void saveCustomers(ArrayList<Customer> customerList) {
        try {
            FileOutputStream f = new FileOutputStream("customer.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);
                for(Customer customer : customerList){
                    o.writeObject(customer);
                }
            }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }


}