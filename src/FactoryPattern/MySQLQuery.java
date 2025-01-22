package FactoryPattern;

public class MySQLQuery implements Query {


    @Override
    public void createQuery() {
        System.out.println("New MySQL query object created");
    }
}
