package FactoryPattern.Factory1;

public class Client {
    Database db;
    DatabaseFactory db_factory;

    public Client(SupportedDB type) {
        this.db_factory=DBFactoryFactory.getDBFactory(type);
        this.db=db_factory.createDatabase();
    }


    public void refreshDB() {
        this.db.refresh();
    }

    public void executeSelectQuery() {
        Query q=this.db_factory.selectQuery("select * from DB");
        this.db_factory.execute(q);
    }
}

