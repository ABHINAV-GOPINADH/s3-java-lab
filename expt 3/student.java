import java.util.*;
class student
{
    int c,r,m1,m2,m3,m4,m5;
    String n;
    public static void main(String args[])
    {
        student s1 = new student();
        s1.read();
        s1.display();
    }
    void read()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of student : ");
        n = in.nextLine();
        System.out.println("Enter class of student :");
        c = in.nextInt();
        System.out.println("Enter roll no of student : ");
        r =in.nextInt();
        System.out.println("Enter marks in 1 st subject : ");
        m1 = in.nextInt();
        System.out.println("Enter marks in 2 st subject : ");
        m2 = in.nextInt();
        System.out.println("Enter marks in 3 st subject : ");
        m3 = in.nextInt();
        System.out.println("Enter marks in 4 st subject : ");
        m4 = in.nextInt();
        System.out.println("Enter marks in 5 st subject : ");
        m5 = in.nextInt();
        in.close();
    }
    void display()
    {
        System.out.println("details of the students ");
        System.out.println("name of the student "+n);
        System.out.println("class of the student "+c);
        System.out.println("roll no of student "+r);
        System.out.println("mark in 1 st subject "+m1);
        System.out.println("mark in 2 st subject "+m2);
        System.out.println("mark in 3 st subject "+m3);
        System.out.println("mark in 4 st subject "+m4);
        System.out.println("mark in 5 st subject "+m5);
    }
}