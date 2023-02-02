import java.util.*;
class Employee
{
    int empid;
    String empname;
    int empnohours;
    int empbasic;
    int emphra;
    int empda;
    int empit;
    int empgross;
    Employee()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter empid");
        empid = sc.nextInt();
        System.out.println("Enter empname");
        empname = sc.next();
        System.out.println("Enter empbasic");
        empbasic = sc.nextInt();
        System.out.println("Enter emphra");
        emphra = sc.nextInt();
        System.out.println("Enter empda");
        empda = sc.nextInt();
        System.out.println("Enter empit");
        empit = sc.nextInt();
        System.out.println("Enter empnohours");
        empnohours = sc.nextInt();
        // System.out.println("Enter empgross");
        // empgross = sc.nextInt();
    }
    void calsalary()
    {
        empgross = empbasic + empbasic*emphra/100 + empbasic*empda/100 - empbasic*empit/100;
        System.out.println("The value of empgross is" + empgross);
        System.out.println("Considering overtime");
        if(empnohours>200)
        {
            empgross+= 100*(empnohours-200);
        }
        System.out.println("The value of empgross is" + empgross);
    }
}

class Main
{
    public static void main(String args[])
    {
        Employee e1 = new Employee();
        e1.calsalary();
    }
}