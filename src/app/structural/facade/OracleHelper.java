package app.structural.facade;

import java.sql.Connection;

/*
 * created by Mahbod Kh with ❤️.
 */

public class OracleHelper {

    public static Connection getOracleDBConnection() {
        System.out.println("get Oracle DB connection using connection parameters");
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        System.out.println("get data from table and generate pdf report");
    }

    public void generateOracleHTMLReport(String tableName, Connection con) {
        System.out.println("get data from table and generate pdf report");
    }

}
