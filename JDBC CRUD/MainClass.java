import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MainClass {
    public static void main(String[] args) {
        //I -> insert Data
//        JDBC_Insert();
        // U -- Update Data
//        JDBC_UPDATE();
         // D -- Delete
        JDBC_Delete();
        //R -- Retrieve data --> Data Show //Data Read
        JDBC_getSomeDataFromRoomInfo();
    }

    private static void JDBC_Delete() {
        Connection connection = JDBC_Connection.getConnections();
        try {
            if (!connection.isClosed()) {
//                String stName = "ursalin";
                String stID = "203";
//                String CGPA = "3.54";
                String sql = "DELETE FROM STUDENT where ID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
//                preparedStatement.setString(1, stName);
                preparedStatement.setString(1, stID);
//                preparedStatement.setString(2, CGPA);
                preparedStatement.execute();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBC_Connection.closeConnections();
        }
    }

    private static void JDBC_UPDATE() {
        Connection connection = JDBC_Connection.getConnections();
        try {
            if (!connection.isClosed()) {
                String stName = "ursalin";
                String stID = "204";
                String CGPA = "3.54";
                String sql = "UPDATE STUDENT SET NAME = ?, CGPA = ? where ID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, stName);
                preparedStatement.setString(3, stID);
                preparedStatement.setString(2, CGPA);
                preparedStatement.execute();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBC_Connection.closeConnections();
        }
    }

    private static void JDBC_Insert() {
        Connection connection = JDBC_Connection.getConnections();
        try {
            if (!connection.isClosed()) {
                String stName = "Mursalin";
                String stID = "204";
                String CGPA = "3.5";
                String sql = "INSERT INTO student (name, id, cgpa) values(?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, stName);
                preparedStatement.setString(2, stID);
                preparedStatement.setString(3, CGPA);
                preparedStatement.execute();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBC_Connection.closeConnections();
        }
    }

    private static void JDBC_getSomeDataFromRoomInfo() {
        Connection connection = JDBC_Connection.getConnections();
        try {
            if (!connection.isClosed()) {
                String sql = "SELECT * FROM STUDENT";
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSetRoomInfo = statement.executeQuery();

                while (resultSetRoomInfo.next()){
//                    String ROOMNO = resultSetRoomInfo.getString("ROOM_NO"); //SQL COL NAMES NID
//                    String TYPE = resultSetRoomInfo.getString("TYPE");
//                    String CAPACITY = resultSetRoomInfo.getString("CAPACITY");
//                    String PRICEDAY = resultSetRoomInfo.getString("PRICE_DAY");
//                    String STATUS = resultSetRoomInfo.getString("STATUS");
//                    System.out.println("  "+ROOMNO+"  "+TYPE+" "+CAPACITY+"  "+PRICEDAY+"  "+STATUS);
                    //LABEL.setText(TYPE);
                    String stName = resultSetRoomInfo.getString("name");
                    String stID = resultSetRoomInfo.getString("id");
                    String stCGPA = resultSetRoomInfo.getString("CGPA");
                    System.out.println(stName+" "+" "+stID+" "+" "+stCGPA);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBC_Connection.closeConnections();
        }
    }
}
