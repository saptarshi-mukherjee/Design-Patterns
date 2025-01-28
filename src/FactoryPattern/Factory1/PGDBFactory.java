package FactoryPattern.Factory1;

public class PGDBFactory implements DatabaseFactory {

    @Override
    public Database createDatabase() {
        return new PostGreSQL();
    }

    @Override
    public Query selectQuery(String statement) {
        PGQuery query=new PGQuery();
        query.createQuery();
        return query;
    }

    @Override
    public void execute(Query q) {
        System.out.println("PostGreSQL executed");
    }
}
