package FactoryPattern.Factory1;

public class MySQLDB implements Database {

    @Override
    public void refresh() {
        System.out.println("MySQL refreshed");
    }

//    @Override
//    public DatabaseFactory getDBFactory() {
//        return new MySQLDBFactory();
//    }
}
