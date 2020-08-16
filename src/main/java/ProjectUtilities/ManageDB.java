package ProjectUtilities;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ManageDB extends CommonOps
{
    public static void initConnection(String DBurl, String user, String pass)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection(DBurl, user, pass);
            Stmt = Con.createStatement();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Error while connecting to DB. see details:" + e);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void CloseConnection()
    {
        try {
            Con.close();
        } catch (SQLException e) {
            System.out.println("Error while closing to DB. see details:" + e);
        }
    }

}
