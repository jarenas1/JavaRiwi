package conection;
//PRIMERO QUE TODO AÑADIMOS EL DIRIVER AL PROYECTO DESDE CONFIGURACION, ESTRUCTURA, LIBRERIAS, AÑADIR JAVA
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConfigDb {

    //CREAMOS UN ATRIBUTO QUE GUARDE LA CONECCION

    static Connection connection = null;

    //METODO PARA ABIRIR LA CONECCION CON LA DB

    //Vamos a usar el trycatch por si de pronto falla la coneccion
    public static Connection open() {

        try {
            //CREAMOS LA CONECCION DE JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            //---------------------CREDENCIALES-------------------------------

            //CREAMOS LA CONECCION A LA BASE DE DATOS   String URL = "jdbc:mysql://hostname:port/nameDB"; VARIA DEPENDIENDO DE LA DB USADA
            String URL = "jdbc:mysql://bpztltapitqxrl2jvzaf-mysql.services.clever-cloud.com:3306/bpztltapitqxrl2jvzaf";

            //METEMOS EL RESTO DE LAS CREDENCIALES

            String user = "uid9oafrsmn160uu";
            String password = "7JQn26dhL3hoctXgmmk9";

            //AHORA QUE YA TENEMOS LOS DATOS, VAMOS A ESTABLECER CONECCION:, este tambien puede fallar asi que añadimos otro catch

            connection = DriverManager.getConnection(URL,user,password);
            System.out.println("Coneccion exitosa");

            //ERROR POR SI FALLA LA CONECCION
        } catch (ClassNotFoundException error) {
            throw new RuntimeException(error.getMessage());
        }catch (SQLException error){
            throw new RuntimeException(error);
        }
        return connection;
    }

    //METODO PARA CERRAR LA CONECCION

    public static void close() throws SQLException{
        if (connection != null){ 

                connection.close(); //ESTO PONE LA CONECCION COMO NULA, PERO COMO PUEDE FALLAR, PERO EN VEZ DE TRYCARCH USAMOS THROWS

            System.out.println("Coneccion cerrada");
            }
        }
    }
}

