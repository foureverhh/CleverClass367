package JavaStepByStep;

public class Main {

    public static void main(String[] args) {
	Account account = new Account();
	account.transaction(10000);
        System.out.printf("The amount of account is %.2f",account.amountAvailable);
		System.out.println();

	for(int i=1;i<=31;i++)
	    account.calculateMoney();
	System.out.printf("The interest is %.2f",account.interest);
	System.out.println();
	account.transaction(-2000);
	for(int i=1;i<=28;i++)
	    account.calculateMoney();
        System.out.printf("The amount of account is %.2f",account.amountAvailable);

        Name name = new Name();
		//name.firstName ="Elsa Marie";
		//name.lastName = "Hagberg";

		//name.setName("Elsa Marie","Hagberg");

		name.setName("HagBerg,Elsa Marie");
		System.out.println();
		//Test toString
		Clock clock = new Clock();
		clock.hour=8;
		clock.minute=30;
		System.out.println(clock.toString());
    }
}
