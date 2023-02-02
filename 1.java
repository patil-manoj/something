import java.util.*;
class x{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("eid pls");
        String eid = s.nextLine(); 
        System.out.println("name");
        String ename = s.nextLine();
        System.out.println("hours");
        int ehrs = s.nextInt(); 
        System.out.println("basic");
        int basic = s.nextInt(); 
        System.out.println("hra");
        int hra = s.nextInt(); 
        System.out.println("da");
        int da = s.nextInt();
        System.out.println("it");
        int it = s.nextInt(); 
        double gross;
        gross =(double)(basic+basic*hra+basic*da-basic*it);
        //clc();
        System.out.println("gross="+gross);
        s.close(); 
    }
}
