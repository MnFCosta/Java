package app;

import db.model.util.DB;

import java.sql.Connection;

public class Main {
    static void main() {
        Connection conn = DB.getConnection();

        DB.closeConnection();
    }
}
