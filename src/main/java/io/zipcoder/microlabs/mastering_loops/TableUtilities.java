package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
                return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();
        String table = "";
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                if (i * j < 100) {
                    sb.append(table).append(" ");
                    if (i * j < 10) {
                        sb.append(table).append(" ");
                    }
                }
                sb.append(table).append(String.valueOf(i * j)).append(" |");
            }
            sb.append(table).append("\n");
        } return sb.toString();


    }
}
