public class StateBank {

    public void withdraw(Client name, int value){
    int deposit = name.getDeposit();
        if(value < deposit){

            System.out.println("Client name: " +name.getName());
            System.out.println("Previous Balance: "+name.getDeposit());
//            name.setDeposit(name.getDeposit() - value);
        deposit = deposit - value;
        name.setDeposit(deposit);
            System.out.println("Withdrown Amount: " +value);
            System.out.println("New Balance: " +deposit+ "\n");
        } else {
            System.out.println("Insufficient Balance!\n");
        }
    }

    public void deposit(Client name, int value){
        System.out.println("Client name: " +name.getName());
        System.out.println("Previous Balance: "+name.getDeposit());
        name.setDeposit(name.getDeposit() + value);
        System.out.println("Withdrown Amount: " +value);
        System.out.println("New Balance: " +name.getDeposit() + "\n");
    }

    public static void main(String[] args) {
        StateBank sb = new StateBank();

        Client rakib = new Client();
        rakib.setID(1);
        rakib.setName("Md. Rakibul Hasan");
        rakib.setDeposit(700000);

        Client tanzid = new Client();
        tanzid.setID(2);
        tanzid.setName("Tanzid morshed");
        tanzid.setDeposit(300000);

        Client alex = new Client();
        alex.setID(3);
        alex.setName("Md. Alex rowman");
        alex.setDeposit(200000);

        rakib.display();
        tanzid.display();
        alex.display();

        sb.withdraw(rakib, 4000);
        sb.deposit(rakib, 8000);

    }
}
