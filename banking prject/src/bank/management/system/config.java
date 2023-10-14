package bank.management.system;
import java.sql.* ;
public class config {
    Connection connection;
    Statement statement;
    public config()
    {
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","md007");
            statement = connection.createStatement();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}