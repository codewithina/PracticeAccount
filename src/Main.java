public class Main {
    public static void main(String[] args) {
        //skapa konton
        Account first = new Account("Salary", 1500.0);
        Account second = new Account("Savings", 7900.0);
        System.out.println("---------- ACCOUNT STATUS ----------\n"+
                first + "\n" + second+ "\n");

        //sätter in 500kr
        first.deposit(500);
        System.out.println(first + "\n" + second + "\n");

        //avgift dras från first och pengar flyttas från first till second
        first.withdraw(89);
        double save = first.withdraw(750);
        second.deposit(save);
        System.out.println(first + "\n" + second + "\n");

        //ändra namnn på konto first
        first.setName("Ina");
        System.out.println(first + "\n" + second);
    }
}