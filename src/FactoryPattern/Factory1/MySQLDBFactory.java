package FactoryPattern.Factory1;

public class MySQLDBFactory implements DatabaseFactory {
    @Override
    public Database createDatabase() {
        return new MySQLDB();
    }

    @Override
    public Query selectQuery(String statement) {
        MySQLQuery query=new MySQLQuery();
        query.createQuery();
        return query;
    }

    @Override
    public void execute(Query q) {
        System.out.println("MySQL Executed");
    }
}
