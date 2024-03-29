package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String readProperty(String key){
        //File class assign given fileto the java object
        File file = new File("configuration.properties");
        Properties properties = new Properties();
        //Properties object will read the properties file
        try {
            properties.load((new FileInputStream(file)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }
}

