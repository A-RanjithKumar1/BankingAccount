package org.example;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class BankAcc{
    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private final String accholderName;
    private long accNumber;
    private long balance;
    BankAcc(String a,long b,long c){
        accholderName=a;accNumber=b;balance=c;
    }
    public void deposite(long namount){
        balance+=namount;
        LOGGER.log(Level.INFO,Double.toString(namount),"Dear User! amount deposited is----- "+ namount);

    }
    public void withdraw(long mamount){
        balance-=mamount;
        LOGGER.log(Level.INFO,Double.toString(mamount),"Dear User! amount withdrawn is-----"+ mamount);
    }
    public String ame(){
        return accholderName;
    }
    public long balance(){
        return balance;
    }
}
public class SimpleBankAccount {
    public static void main(String[] args) {
        final Logger lOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Scanner sc=new Scanner(System.in);
        lOGGER.log(Level.INFO,"Enter the userName");
        String name=sc.next();
        lOGGER.log(Level.INFO,"Enter the AccountNumber");
        long num=sc.nextLong();
        lOGGER.log(Level.INFO,"Enter the Initial Amount to be deposited");
        long bal=sc.nextLong();
        BankAcc bob=new BankAcc(name, num, bal);
        int op=0;
        while(op!=4){
            lOGGER.log(Level.INFO,"Dear User! Please Go through the below option and Enter the option"+"\n"+"1.Deposite 2.Withdraw 3.Balance 4.Exit");
            op=sc.nextInt();
            if(op==1){
                lOGGER.log(Level.INFO,"Enter the Deposite");
                long dep=sc.nextLong();
                bob.deposite(dep);
            }
            else if(op==2){
                lOGGER.log(Level.INFO,"Enter the Amount  to be withdrawn");
                long dra=sc.nextLong();
                bob.withdraw(dra);
            }
            else if(op==3){
                long b1= bob.balance();
                lOGGER.log(Level.INFO,(String.format("The AccountHolder Name is-----%s",(bob.ame()))));
                lOGGER.log(Level.INFO,Double.toString(b1),String.format("The Current Available Balance is-----%d",b1));
            }
        }
    }
}
