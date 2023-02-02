import java.util.*;
class customer
{
    int custno;
    String custname;
    long Mobileno;
    customer()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter custno");
        custno= sc.nextInt();
        System.out.println("Enter custname");
        custname= sc.next();
        System.out.println("Enter MobileNo");
        Mobileno = sc.nextLong();
    }

}
class Bank extends customer{
    int acctno;
    double balance,grossAmount;
    String BranchName,location;
    Bank()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter acctno");
        acctno= sc.nextInt();
        System.out.println("Enter Balance");
        balance= sc.nextDouble();
        grossAmount = balance;
        System.out.println("Enter BranchName");
        BranchName= sc.next();
        System.out.println("Enter location");
        location= sc.next();
    }
    void calcGross()
    {
        if(balance>100000)
        {
            grossAmount= 1.2*balance;
        }
    }
    void display()
    {
        System.out.println("name"+custname);
        System.out.println("custno"+custno);
        System.out.println("Mobileno"+Mobileno);
        System.out.println("AccountNo"+acctno);
        System.out.println("Balance"+balance);
        System.out.println("gross"+grossAmount);
        System.out.println("BranchName"+BranchName);
        System.out.println("location"+location);        
    }
}


class JavaLabQBQ4 {
    public static void main(String args[])
    {
    Bank s[] = new Bank[3];
    s[1] = new Bank();
    s[2] = new Bank();
    s[0] = new Bank();
    s[0].calcGross();
    s[0].display();
    s[1].calcGross();
    s[1].display();
    s[2].calcGross();
    s[2].display(); 
    } 
}
