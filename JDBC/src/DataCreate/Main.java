package DataCreate;

import Connection.db.model.util.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    static void main() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try (
                Connection conn = DB.getConnection();
                PreparedStatement pst = conn.prepareStatement(
                        "INSERT INTO seller"
                                + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                                + "VALUES "
                                + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS)
        ) {
            pst.setString(1, "Manoel Costa");
            pst.setString(2, "manoel@gmail.com");
            pst.setDate(3, new java.sql.Date(sdf.parse("10/10/2002").getTime()));
            pst.setDouble(4, 3000.0);
            pst.setInt(5, 4);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = pst.getGeneratedKeys();
                while (rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done ID = " + id);
                }
            } else {
                System.out.println("No rows affected!");
            }

        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        }
    }
}
