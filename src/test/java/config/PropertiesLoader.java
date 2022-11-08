package config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

    private Logger logger = LogManager.getLogger(PropertiesLoader.class);

    //reading properties from properties file
    public Properties getPropertiesFromFile(String propertiesFileName) {

        //Creating object InputStream, which is using to read properties file
        InputStream inputStream = null;

        //Object Properties will be keeping properties
        Properties properties = new Properties();
        try {
            logger.info("Trying to load properties with file name: " + propertiesFileName);

            //Reading file properties and initializing object inputStream
            inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFileName);

            //If properties file wouldn't exist, object inputStream will be null.
            // FileNotFoundException exception will be initialized
            if (inputStream != null) {
                //Loading properties in InputStream form into right Properties object type
                properties.load(inputStream);
                logger.info("Successfully loaded properties for file: " + propertiesFileName);
            } else {
                throw new FileNotFoundException("Property file '" + propertiesFileName + "' not found in the classpath");
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Cannot load properties due to IOException!");
        } finally {
            // In the end InputStream call private closeResource method
            closeResource(inputStream);
        }

        //Return initialized properties object
        return properties;
    }

    private void closeResource(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
