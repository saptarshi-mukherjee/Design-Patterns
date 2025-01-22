package FactoryPattern;

public class PGQuery implements Query {

    @Override
    public void createQuery() {
        System.out.println("New PostGreSql query created");
    }
}
