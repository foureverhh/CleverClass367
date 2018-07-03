package JavaStepByStep;

public class Main {

    public static void main(String[] args) {
	/*
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
		*/
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		c1.x=1;c1.y=2;c1.radius=3;
		c2.x=1;c2.y=2;c2.radius=3;
		if(c1==c2)
			System.out.println("1 == give true");
		else
			System.out.println("1 == give false");
		if(c1.equals(c2))
			System.out.println("1 equals give true");
		else
			System.out.println("1 equals give false");

		Circle2 circleI = new Circle2();
		Circle2 circleJ = new Circle2();
		circleI.p = new Point();
		circleI.p.x = 0;
		circleI.p.y = 0;
		circleI.radius =1;
		circleJ.p = new Point();
		circleJ.p.x = 0;
		circleJ.p.y = 0;
		circleJ.radius =1;

		if(circleI == circleJ)
			System.out.println("2 == gives true");
		else
			System.out.println("2 == gives false");
		if(circleI.equals(circleJ))
			System.out.println("2 equals gives true");
		else
			System.out.println("2 equals gives false");


    }
}
