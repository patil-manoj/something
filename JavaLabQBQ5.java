import java.util.*;
class Student
{
    String USN,StudentName;
    double average;
    int marks[] = new int[3];
    void set()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the USN");
        USN = sc.next();
        System.out.println("Enter name");
        StudentName = sc.next();
        for(int i = 0;i<3;i++)
        {
            System.out.println("Enter"+" "+i+"marks");
            marks[i]=sc.nextInt();
        }
    }
    void calcAverage()
    {
        for(int j= 0;j<3;j++)
        {
            average = average + marks[j];
        }
        average = average/3;
    }
    void get()
    {
        System.out.println("Name"+StudentName);
        System.out.println("USN:"+USN);
        for(int c=0;c<3;c++)
        {
            System.out.println("Subject"+c+"marks"+marks[c]);
        }
        System.out.println("Average:"+average);

    }
}
class StudentMain
{
    public static void main(String args[]) 
    {
        Student s[] = new Student[3];
        for(int i = 0;i<3;i++)
        {
            s[i] = new Student();
            s[i].set();
        }
        for(int i = 0;i<3;i++)
        {
            s[i].calcAverage();
            s[i].get();
        }
    }
}
