package DataDelete;


import Connection.db.model.exception.DbIntegrityException;
import Connection.db.model.util.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    static void main() {

        try (
                Connection conn = DB.getConnection();
                PreparedStatement st = conn.prepareStatement(
                        "DELETE FROM department "
                            + "WHERE "
                            + "(Id = ?)")
        ){
            st.setInt(1, 5);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done, Rows affected " + rowsAffected);

        }catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }
    }
}
