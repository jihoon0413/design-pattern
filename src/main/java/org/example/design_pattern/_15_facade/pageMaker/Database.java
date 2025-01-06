package org.example.design_pattern._15_facade.pageMaker;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

class Database {
    private Database() {
    }

    public static Properties getProperties(String dbname) throws IOException {
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        prop.load(new FileReader("C:\\Users\\20594\\Desktop\\java\\study\\design-pattern\\src\\main\\java\\org\\example\\design_pattern\\_15_facade\\"+filename));
        return prop;
    }

}
