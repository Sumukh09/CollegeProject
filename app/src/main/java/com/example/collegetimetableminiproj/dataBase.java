package com.example.collegetimetableminiproj;

public final class dataBase {
    private dataBase() {}

    public static class MyTable {
        public static final String TABLE_NAME = "my_table";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_NAME = "name";
        // ... other column names

        public static final String CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        COLUMN_NAME + " TEXT)";
    }
}


