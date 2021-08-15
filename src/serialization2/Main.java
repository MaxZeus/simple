package serialization2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
         new Employee("Chiriac", "Maxim", 28, "Java junior", 4500.00),
        new Employee("Axel", "Pedro", 25, "Java senior", 14500.00),
        new Employee("Smith", "Jhon", 35, "Java middle", 9000.00),
        new Employee("Kameniev", "Valeriy", 33, "Java middle", 10000.5),
        new Employee("Rokov", "Daniil", 29, "Java middle", 11500.00),
        new Employee("Chirik", "Natalia", 23, "Java junior", 4500.00),
        new Employee("Rogosin", "Sergey", 30, "Java middle", 10000.00),
        new Employee("Krasova", "Alina", 26, "Java middle", 9000.00),
        new Employee("Davidova", "Nelia", 35, "Java senior", 20000),
        new Employee("Dobrova", "Alexandra", 24, "Java middle", 10500.00)));



        Employer solidSilver = new Employer("SolidSilver", "Jugoslavanska 28", 652, employeeList);

        File file = new File("store2.json");

        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(fos))
        {
            os.writeObject(solidSilver);
            os.flush();

        } catch (Exception exc) {
            exc.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream(file);
            ObjectInputStream is = new ObjectInputStream(fis)) {

            Employer serialEmployer = (Employer) is.readObject();
            System.out.println(serialEmployer.toString());

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
