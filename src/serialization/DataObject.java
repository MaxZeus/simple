package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DataObject extends NonSerializable implements Serializable {

    public int i = 5;
    public String s = "Max";
    public transient String[] def = new String[25];
    CustomObject customObject = new CustomObject();

    @Override
    public String getMyData() {
        return super.getMyData();
    }

    @Override
    public void setMyData(String newData) {
        super.setMyData(newData);
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(super.getMyData());

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        super.setMyData((String)in.readObject());
    }
}
