package FactoryPattern.Factory1;

public interface DatabaseFactory {
    public Database createDatabase();
    public Query selectQuery(String statement);
    public void execute(Query q);

}
