package serialization;

import java.io.*;

public class CustomObject implements Externalizable {
    private boolean b = true;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeBoolean(b);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        in.readBoolean();
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
}
