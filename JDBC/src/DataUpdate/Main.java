package DataUpdate;


import Connection.db.model.util.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    static void main() {

        try (
             Connection conn = DB.getConnection();
             PreparedStatement st = conn.prepareStatement(
                     "UPDATE seller "
                     + "SET BaseSalary = BaseSalary + ?"
                     + "WHERE "
                     + "(DepartmentId = ?)")
        ){
            st.setDouble(1, 200.0);
            st.setInt(2, 2);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done, Rows affected " + rowsAffected);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
