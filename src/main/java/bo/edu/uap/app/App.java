package bo.edu.uap.app;
import static spark.Spark.*;

import java.io.IOException;
import java.util.Properties;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Properties prop = new Properties();
        prop.load(App.class.getClassLoader().getResourceAsStream("vars.properties"));

        port(3456);
        get("entornos", (req, res) -> "En el ambiente ..." + prop.getProperty("VARIABLE1"));       
        get("prueba", (req, res) -> "esta es una prueba");       
    }
}
