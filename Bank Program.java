import java.util.*;

interface ATM{
    public void withdraw();
    public void deposit();
    public void balance();
}

class SBI implements ATM{
    Scanner sc=new Scanner(System.in);
    int bal=90000;
    public void withdraw(){
        System.out.println("Enter Amount in Multiples of 500's and 100's");
        int debit=sc.nextInt();
        if(debit<bal){
            bal=bal-debit;
            System.out.println("Please Take The Amount!!!");
            System.out.println("Show Balance on the Screen");
        System.out.println("1.for OK        2.for CANCEL");
        int display=sc.nextInt();
        if(display==1)
        System.out.println("BALANACE: "+bal);
        else
        System.out.println("THANK YOU FOR YOUR TRANSACTION");
        }
        else
        System.out.println("Insufficient Balance!");
        
    }
    public void deposit(){
        System.out.println("Enter Amount to Deposit: ");
        int trans=sc.nextInt();
        if(trans<25000 && trans>0)
        {
            if(trans%500==0 || trans%100==0){
                bal=bal+trans;
                System.out.println("Your Transaction is Successfull");
                System.out.println("1. for Show Balance   2. for Cancel");
                int display2=sc.nextInt();
                if(display2==1)
                System.out.println("BALANACE: "+bal);
                else
                System.out.println("THANK YOU FOR YOUR TRANSACTION");
            }
            else{
            System.out.println("Invalid Amount");
            System.out.println("Only the Multiples of 500's and 100's can be Accepted");
            }
        }  
            else
            System.out.println("Maximum Amount limit for Deposit is 25000");
        }
        public void balance(){
          System.out.println("Your Balanace is: "+bal);  
        }
        
    }
    
class HDFC implements ATM{
    int bal=55000;
    Scanner sb=new Scanner(System.in);
    
    public void withdraw(){
        System.out.println("Enter Amount in Multiples of 500's and 100's");
        int debit=sb.nextInt();
        if(debit<bal){
            bal=bal-debit;
            System.out.println("Please Take The Amount!!!");
            System.out.println("Show Balance on the Screen");
        System.out.println("1.for OK        2.for CANCEL");
        int display=sb.nextInt();
        if(display==1)
        System.out.println("BALANACE: "+bal);
        else
        System.out.println("THANK YOU FOR YOUR TRANSACTION");
        }
        else
        System.out.println("Insufficient Balance!");
}

    public void deposit(){
        System.out.println("Enter Amount to Deposit: ");
        int trans=sb.nextInt();
        if(trans<25000 && trans>0)
        {
            if(trans%500==0 || trans%100==0){
                bal=bal+trans;
                System.out.println("Your Transaction is Successfull");
                System.out.println("1. for Show Balance   2. for Cancel");
                int display2=sb.nextInt();
                if(display2==1)
                System.out.println("BALANACE: "+bal);
                else
                System.out.println("THANK YOU FOR YOUR TRANSACTION");
            }
            else{
            System.out.println("Invalid Amount");
            System.out.println("Only the Multiples of 500's and 100's can be Accepted");
            }
        }  
            else
            System.out.println("Maximum Amount limit for Deposit is 25000");
        }
        public void balance(){
          System.out.println("Your Balanace is: "+bal);  
        }
}

class ICICI implements ATM{
    Scanner sn=new Scanner(System.in);
    int bal=200000;
    public void withdraw(){
        System.out.println("Enter Amount in Multiples of 500's and 100's");
        int debit=sn.nextInt();
        if(debit<bal){
            bal=bal-debit;
            System.out.println("Please Take The Amount!!!");
            System.out.println("Show Balance on the Screen");
        System.out.println("1.for OK        2.for CANCEL");
        int display=sn.nextInt();
        if(display==1)
        System.out.println("BALANACE: "+bal);
        else
        System.out.println("THANK YOU FOR YOUR TRANSACTION");
        }
        else
        System.out.println("Insufficient Balance!");
}

    public void deposit(){
        System.out.println("Enter Amount to Deposit: ");
        int trans=sn.nextInt();
        if(trans<25000 && trans>0)
        {
            if(trans%500==0 || trans%100==0){
                bal=bal+trans;
                System.out.println("Your Transaction is Successfull");
                System.out.println("1. for Show Balance   2. for Cancel");
                int display2=sn.nextInt();
                if(display2==1)
                System.out.println("BALANACE: "+bal);
                else
                System.out.println("THANK YOU FOR YOUR TRANSACTION");
            }
            else{
            System.out.println("Invalid Amount");
            System.out.println("Only the Multiples of 500's and 100's can be Accepted");
            }
        }  
            else
            System.out.println("Maximum Amount limit for Deposit is 25000");
        }
        public void balance(){
          System.out.println("Your Balanace is: "+bal);  
        }
}

public class Main
{
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Insert Your Card & Enter Your Pin");
		int pin=ss.nextInt();
		if(pin==1234){
		    System.out.println("Your Card is Processing");
		    System.out.println("Select Your Bank Account");
		    System.out.println("1.SBI");
		    System.out.println("2.HDFC");
		    System.out.println("3.ICICI");
		    int acc=ss.nextInt();
		    if(acc==1)
		    {
		        SBI sbi=new SBI();
		        System.out.println("1.WITHDRAW");
		        System.out.println("2.DEPOSIT");
		        System.out.println("3.BALANCE");
		        int opt=ss.nextInt();
		        if(opt==1)
		        sbi.withdraw();
		        else if(opt==2)
		        sbi.deposit();
		        else if(opt==3)
		        sbi.balance();
		        else
		        System.out.println("Invalid");
		    }
		    else if(acc==2)
		    {
		        HDFC hdfc=new HDFC();
		        System.out.println("1.DEPOSIT");
		        System.out.println("2.WITHDRAW");
		        System.out.println("3.BALANCE");
		        int opt=ss.nextInt();
		        if(opt==1)
		        hdfc.deposit();
		        else if(opt==2)
		        hdfc.withdraw();
		        else if(opt==3)
		        hdfc.balance();
		        else
		        System.out.println("Invalid");
		    }
		    else if(acc==3)
		    {
		        ICICI ici=new ICICI();
		        System.out.println("1.DEPOSIT");
		        System.out.println("2.DEBIT");
		        System.out.println("3.BALANCE");
		        int opt=ss.nextInt();
		        if(opt==1)
		        ici.deposit();
		        else if(opt==2)
		        ici.withdraw();
		        else if(opt==3)
		        ici.balance();
		        else
		        System.out.println("Invalid");
		    }
		    else
		    System.out.println("Invalid Account");
		}
                  else
		  System.out.println("Invalid PIN ");
	}
}
