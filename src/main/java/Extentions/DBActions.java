package Extentions;

import ProjectUtilities.CommonOps;
import io.qameta.allure.Step;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBActions extends CommonOps
{
    @Step("Get Credentials from DB")
    public static List <String> getCredentials(String quarry)
    {
        List <String> credentials = new ArrayList<String>();
             for (int i = 0; i < 10; i++)
                  try {
                      rs = Stmt.executeQuery(quarry);
                      rs.next();
                      credentials.add(rs.getString(i));
               }
             catch (SQLException e)
             {
            System.out.println("Cannot execute quarry, for details see:" + e);
        }
        return credentials;
    }

    @Step("Get Donation values from DB")
    public static List <String> getDonation(String quarry)
    {
        List <String> credentials = new ArrayList<String>();
           for (int i = 0; i<10; i++)
              try {
                    rs = Stmt.executeQuery(quarry);
                    rs.next();
                    credentials.add(rs.getString(i));
            }
           catch (SQLException e) {
            System.out.println("Cannot execute quarry, for details see:" + e);
        }
        return credentials;
    }

    @Step("Get Donation values from DB")
    public static List <String> getCCInfo(String quarry) {
        List<String> credentials = new ArrayList<String>();
           for (int i = 0; i<10; i++)
               try {
                    rs = Stmt.executeQuery(quarry);
                    rs.next();
                      credentials.add(rs.getString(i));
                    }
           catch (SQLException e)
           {
                System.out.println("Cannot execute quarry, for details see:" + e);
        }
        return credentials;
    }

}
