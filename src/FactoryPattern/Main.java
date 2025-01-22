package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Client client=new Client(SupportedDB.PostGreSQl);
        client.refreshDB();
        client.executeSelectQuery();
    }
}
