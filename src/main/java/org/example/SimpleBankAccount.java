package org.example;
import java.util.Scanner;

class BankAcc{
    String accholderName;
    long accNumber;
    long balance;
    BankAcc(String a,long b,long c){
        accholderName=a;accNumber=b;balance=c;
    }
    public void deposite(long namount){
        balance+=namount;
        System.out.println("Dear User! amount deposited is----- "+ namount);

    }
    public void withdraw(long mamount){
        balance-=mamount;
        System.out.println("Dear User! amount withdrawn is-----"+ mamount);
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
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the userName");
        String name=sc.next();
        System.out.println("Enter the AccountNumber");
        long num=sc.nextLong();
        System.out.println("Enter the BalanceAmount");
        long bal=sc.nextLong();
        BankAcc bob=new BankAcc(name, num, bal);
        int op=0;
        while(op!=4){
            System.out.println("Dear User! Please Go through the below option and Enter the option"+"\n"+"1.Deposite 2.Withdraw 3.Balance 4.Exit");
            op=sc.nextInt();
            if(op==1){
                System.out.println("Enter the Deposite");
                long dep=sc.nextLong();
                bob.deposite(dep);
            }
            else if(op==2){
                System.out.println("Enter the Amount  to be withdrawn");
                long dra=sc.nextLong();
                bob.withdraw(dra);
            }
            else if(op==3){
                long b1= bob.balance();
                String na=bob.ame();
                System.out.println("The AccountHolder Name is-----"+na);
                System.out.println("The Current Available Balance is-----"+b1);
            }
        }
    }
}
