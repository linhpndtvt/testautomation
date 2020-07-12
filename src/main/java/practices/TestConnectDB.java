package practices;


import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestConnectDB {

    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    public static void main(String args[]) {

        TestConnectDB testConnectDB = new TestConnectDB();

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://10.50.73.20:3306/nova","root","contrail123");
            Statement statement = connection.createStatement();
            ResultSet testResults = statement.executeQuery("select * from instances where uuid = " + "'1491abae-0278-444b-8aa6-cabc0d37b5fd';");

            while(testResults.next()) {
                System.out.println(testResults.getString(1) + "  " + testResults.getString(2) + "  " + testResults.getString(6));
            }
            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }


}

}
