package Models;

/**
 * @author Andrew Walsh
 */
public class Config {
    private static String dbUsername = "U08t1Z";
    private static String dbPassword = "53689389180";
    private static String dbUrl = "jdbc:mysql://wgudb.ucertify.com:3306/WJ08t1Z?useSSL=false&serverTimezone=UTC";

    /**
     * @return database username
     */
    public static String getDbUsername() {
        return dbUsername;
    }

    /**
     * @return database password
     */
    public static String getDbPassword() {
        return dbPassword;
    }

    /**
     * @return database url
     */
    public static String getDbUrl() {
        return dbUrl;
    }
}
