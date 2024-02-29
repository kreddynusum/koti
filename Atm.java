import java.util.Scanner;
class Account{
  int money=1000;
}
class Atm extends Account{
    void withdraw(int amount){
        if(money >=amount){
             money-=amount;
             System.out.println("withdraw "+amount+" succeed");
        }
        else{
            System.out.println("Withdraw can'nt be done due to low balance");
        }
    }
    void deposit(int amount){
        if(amount>0){
            money+=amount;
            System.out.print("deposit "+amount+" success");
        }
        else{
            System.out.println("enter valid amount");
        }
    }
    void CheckBalance(){
        System.out.print("Balance:"+money+"\n");}
}
class Koti{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        Atm a=new Atm();
        boolean d=true;
        System.out.println("create your Atm pin");
        int pin=s.nextInt();
        while(d){
        System.out.print("--:Welcome:--\nYou have 3 options here:\n1.withdraw\n2.Depositing\n3.Check balance\n");
        System.out.println("enter your choice:");
        int choice=s.nextInt();
        if(choice==1){
            System.out.println("enter pin to valid");
            if (pin==s.nextInt()){
            System.out.println("enter amount:");
            int amount=s.nextInt();
            a.withdraw(amount);}
            else{
                System.out.println("enter valid pin");
            }
        }
        else if(choice==2){
            System.out.println("enter pin to valid");
            if(pin==s.nextInt()){
            System.out.println("enter amount:");
            int amount=s.nextInt();
            a.deposit(amount);}
            else{
                System.out.println("invalid pin");
            }
        }
        else if(choice==3){
            System.out.println("enter pin to valid");
            if(pin==s.nextInt()){
           a.CheckBalance();}
           else{
            System.out.println("Invalid pin");
           }
        }
        System.out.print("\nDo you want to do another one:1.yes\n2.no\n");
        int option=s.nextInt();
        if(option==1){
          d=true;
        }
        else if(option==2){
            d=false;
            System.out.println("Thank you");
        }
    }}
}