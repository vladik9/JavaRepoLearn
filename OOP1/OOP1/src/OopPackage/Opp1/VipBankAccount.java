package OopPackage.Opp1;

public class VipBankAccount {
    private String name;
    private int creditLimit;
    private String emailAdress;

    public VipBankAccount() {
        this("no name", 200, "em@em.com");
        System.out.println("Default constructor, will delegate all 3 values with implicit data.");
    }

    public VipBankAccount(String name, int creditLimit) {
        this(name, creditLimit, "em@em.com");

        System.out.println("Delegating with 2 assigned and one implicit.");
    }

    public VipBankAccount(String name, int creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
        System.out.println("Custom constructor that get all fields frm beging.");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
