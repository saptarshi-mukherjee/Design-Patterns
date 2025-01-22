package FactoryPattern;

public class PostGreSQL implements Database {

    @Override
    public void refresh() {
        System.out.println("PostGreSQL refreshed");
    }

//    @Override
//    public DatabaseFactory getDBFactory() {
//        return new PGDBFactory();
//    }
}
