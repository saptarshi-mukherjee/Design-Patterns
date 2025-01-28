package FactoryPattern.Factory1;

public class DBFactoryFactory {
    public static DatabaseFactory getDBFactory(SupportedDB db_type) {
        switch(db_type) {
            case MYSQL:
                return new MySQLDBFactory();
            case PostGreSQl:
                return new PGDBFactory();
            default:
                return null;
        }
    }
}
