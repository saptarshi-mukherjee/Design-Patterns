package FactoryPattern;

public interface DatabaseFactory {
    public Database createDatabase();
    public Query selectQuery(String statement);
    public void execute(Query q);

}
