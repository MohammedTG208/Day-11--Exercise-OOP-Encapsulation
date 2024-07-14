import java.util.InputMismatchException;

public class Account {
   private String id;
   private String name;
   private int balance=0;

   public Account(){

   }

   public Account(String id,String name){
       this.id=id;
       this.name=name;
   }
   public Account(String id,String name,int balance){
       this.id=id;
       this.name=name;
       this.balance=balance;
   }

    public void setBalance(int balance) {
       try{
         this.balance = balance;
       }catch (InputMismatchException e){
           System.out.println("Enter numbers only");
       }
    }

    public void setId(String id) {
       try {
           if (id.isEmpty()){
               System.out.println("Enter your id");
           }else {
               this.id = id;
           }
       }catch (InputMismatchException e){
           System.out.println("Enter String value");
       }
    }

    public void setName(String name) {
       try {

       if (name.isEmpty()){
           System.out.println("Enter your name");
       }else {
           this.name = name;
       }
       }catch (InputMismatchException e){
           System.out.println("Enter String value");
       }
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }
    //Remove
    public int credit(int amount){
       int check=this.balance;
       check-=amount;
        if (check<=0){
            System.out.println("You can not credit");
            return this.balance;
        }else {
            this.balance-=amount;
            System.out.println("you credit: "+amount+" and the total: "+this.balance);
            return this.balance;
        }
    }
    //add
    public int debit(int amount){
       return this.balance+=amount;
    }
    public int transferTo(Account account,int amount){
       int check=this.balance;
       check-=amount;
       if (check<0){
           System.out.println("'You can not Transfer your balance'"+this.balance);
           return this.balance;
       }else {
           account.balance+=amount;
           this.balance-=amount;
           System.out.println("you transfer To "+account.name+" "+amount+" and your balance now "+this.balance);
           return this.balance;
       }

    }
    public String toString(){
       return "information about your account: "+this.name+"\n your Balance:"+this.balance+"\n Your ID: "+this.id;
    }
}
