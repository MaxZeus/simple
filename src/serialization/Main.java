package serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        DataObject dataObject = new DataObject();

        File file = new File("store.bin");

        try (FileOutputStream fo = new FileOutputStream(file);
             ObjectOutputStream os = new ObjectOutputStream(fo)) {

            dataObject.setMyData("hahahahahhaha");

            os.writeObject(dataObject);
            os.flush();

        } catch (Exception exc) {
            exc.printStackTrace();
        }

        try (FileInputStream fi = new FileInputStream(file);
             ObjectInputStream si = new ObjectInputStream(fi)) {

            DataObject restoredDataObject = (DataObject) si.readObject();
            System.out.println(restoredDataObject.getMyData());


        } catch (Exception exc) {
            exc.printStackTrace();
        }



    }
}
