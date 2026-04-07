package DataInsert;

import Connection.db.model.exception.DbException;
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
                                + "(?, ?, ?, ?, ?)")
        ) {
            pst.setString(1, "Manoel Costa");
            pst.setString(2, "manoel@gmail.com");
            pst.setDate(3, new java.sql.Date(sdf.parse("10/10/2002").getTime()));
            pst.setDouble(4, 3000.0);
            pst.setInt(5, 4);

            int rowsAffected = pst.executeUpdate();
            System.out.printf("Done, Rows Affected: %d", rowsAffected);

        } catch (SQLException | ParseException e) {
            e.printStackTrace();
        }
    }
}
