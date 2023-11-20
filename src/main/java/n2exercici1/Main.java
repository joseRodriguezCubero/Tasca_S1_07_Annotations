package n2exercici1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        CarSerializable coche1 = new CarSerializable("Opel", "Astra", "9533RNS");

        OutputStream fileOutputStream = new FileOutputStream("serialized.json");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(coche1);
        objectOutputStream.close();
        fileOutputStream.close();

    }
}
