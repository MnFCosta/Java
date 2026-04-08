package Transacao;

import Connection.db.model.exception.DbException;
import Connection.db.model.util.DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    static void main() {
        Connection conn = DB.getConnection();

        try (
                Statement st = conn.createStatement();
        ) {
            conn.setAutoCommit(false);
            //Exemplo de situação aonde um statement é executado mas outro não por conta de um erro
            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            int x = 1;

            if (x < 2){
                throw new SQLException("ACID test");
            }

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3070 WHERE DepartmentId = 2");

            conn.commit();

            System.out.printf("Done, Rows affected 1 = %d, 2 = %d ", rows1, rows2);

        } catch (SQLException e) {
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());

            } catch (SQLException e1) {
                throw new DbException("Database rollback failed, God save you, Caused by: " + e1.getMessage());
            }
        }
    }
}
