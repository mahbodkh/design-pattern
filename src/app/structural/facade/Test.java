package app.structural.facade;

import java.sql.Connection;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Test {
    public static void main(String[] args) {

        String tableName = "Employee";

        //generating MySql HTML report and Oracle PDF report without using Facade
        Connection mysqlConn = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, mysqlConn);

        Connection oracleConn = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, oracleConn);

        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}
