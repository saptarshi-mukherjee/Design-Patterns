package Builder_Patterns;

public class Client {
    public static void main(String[] args) throws Exception {
        Account account=Account.getBuilder()
                .setUsername("sapbum1234@gmail.com")
                .setPassword("jaFL09bst")
                .setBalance(10000)
                .setAge(27)
                .setAddress("HWH")
                .setAnnual_income(500000)
                .build();
        System.out.println("Username : "+account.getUsername());
        System.out.println("Password : "+account.getPassword());
        System.out.println("Balance = "+account.getBalance());
        System.out.println("Age : "+account.getAge());
        System.out.println("Address : "+account.getAddress());
        System.out.println("Annual income = "+account.getAnnual_income());
    }
}
