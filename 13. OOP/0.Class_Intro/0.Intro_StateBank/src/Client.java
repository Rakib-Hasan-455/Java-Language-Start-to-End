public class Client {
    private int id;
    private String name;
    private int deposit;

    public void setID(int id){
        this.id = id;
    }

    public int getID(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDeposit(int deposit){
        this.deposit = deposit;
    }

    public int getDeposit(){
        return this.deposit;
    }

    public void display(){
        System.out.println("ID: " +this.id);
        System.out.println("Name: " +this.name);
        System.out.println("Deposit " +this.deposit +"\n");
    }
}
