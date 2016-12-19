package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * Created by arpan on 05/12/2016.
 */
public class ConfigDataProvider {

    Properties prop;

    public ConfigDataProvider() {
        String source = ".\\Configuration\\config.properties";


        try {
            File file = new File(source);
            FileInputStream fis = new FileInputStream(file);
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception is: " + e.getMessage());
        }

    }


    public String getApplicationURL() {
        return prop.getProperty("URL");
    }

    public String firefoxPath() {

        return prop.getProperty("firefoxPath");
    }

    public String chromePath() {

        return prop.getProperty("chromePath");
    }

    public String iePath() {

        return prop.getProperty("IEPath");
    }

    public String edgePath() {

        return prop.getProperty("edgePath");
    }


}
