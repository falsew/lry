package Number.java.util;

import java.time.LocalDate;

public class people {
    public static void main(String[] args) {
        var people=new Person[2];
        people[0]=new Employee("Maria Morris","computer science",50,2050,50);
        people[1]=new Student("Ni Ta Ma","lzq de mingyan");
        for (Person p:people)
            System.out.println(p.getName()+","+p.getDescription());
    }
}
public abstract class Person{
    public abstract String getDescription();
    private String name;
    public Person(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class Employee extends Person{
    private double salary;
    private LocalDate hireDay;
    public Employee(String name,double salary,int year,int month,int day){
        super(name);
        this.salary=salary;
        hireDay=LocalDate.of(year,month,day);
    }
    public LocalDate getHireDay(){
        return hireDay;
    }
    public String getDescription(){
        return String.format("an employee with a salary of $%.2f",salary);
    }
    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }
    public class Student extends Person{
        private String major;
        public Student(String name,String major){
            super(name);
            this.major=major;
        }
        public String getDescription(){
            return "a student majoring in"+major;
        }
    }
}
