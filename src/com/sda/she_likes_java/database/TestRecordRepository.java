package com.sda.she_likes_java.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestRecordRepository {

    private static final String allTestRecordsQuery = """
            SELECT ID, NAME
            FROM TEST;
            """;

    private static final String addRecordQuery = """
        INSERT INTO TEST(ID, NAME)
        VALUES (?, ?);
        """;
    private Connection dbConnection;

    public TestRecordRepository(Connection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public List<TestRecord> getAllTestRowsFromDB() {
        List<TestRecord> records = new ArrayList<>();
        // send query to database
        try {
            // statement - current query
            Statement statement = dbConnection.createStatement();

            // get result
            // ResultSet - like small table with all data
            ResultSet results = statement.executeQuery(allTestRecordsQuery);

            // map results to java objects - TestRecord
            while (results.next()) { // go row by row
                Integer idFromDb = results.getInt("ID");
                String titleFromDb = results.getString("NAME");
                TestRecord recordFromDb = new TestRecord(idFromDb, titleFromDb);
                records.add(recordFromDb);
                System.out.println("id: " + idFromDb + ", title: " + titleFromDb);
            }
        } catch (SQLException e) {
            System.out.println("Unexpected exception: " + e);
        }

        return records;
    }

    public boolean storeTestRecordIntoDatabase(TestRecord dataToStore) {
        try {
            PreparedStatement preparedStatement = dbConnection.prepareStatement(addRecordQuery);
            preparedStatement.setInt(1, dataToStore.getId());
            preparedStatement.setString(2, dataToStore.getTitle());
        } catch (SQLException e) {
            System.out.println("Unexpected exception: " + e);
            return false;
        }
        return true;
    }
}