package EjerciciosTarde;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MiFactory {
    InputStream inputStream;

    public Object getInstance(String propFileName, String propName) throws IOException {
        try {
            Properties prop = new Properties();

            inputStream = new FileInputStream(propFileName);

            prop.load(inputStream);

            // get the property value and print it out
            String className = prop.getProperty(propName);

            return Class.forName(className).getConstructor().newInstance();

        } catch (Exception e) {
            System.out.println("Exception: " + e);
            return null;
        } finally {
            inputStream.close();
        }
    }
}
