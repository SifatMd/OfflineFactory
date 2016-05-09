/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityheirarchy;

class Community{
    private String department;
    private String institute;
    public Community(String a, String b){
        department = a;
        institute = b;
    }
    public void view(){
        System.out.println(department);
        System.out.println(institute);
    }
}

class Employees extends Community{
    private String name;
    private String employeeid;
    private double salary;
    private double increment;
    public Employees(String a, String b, String name, String employeeid, double salary, double increment){
        super(a,b);
        this.name = name;
        this.employeeid = employeeid;
        this.salary = salary;
        this.increment = increment;
    }
    
    public void view(){
        System.out.println(name + " "+ employeeid+" " + salary+" " + increment);
        super.view();
    }
    
}
class Alumny extends Community{
    private String name;
    private int passyear;
    public Alumny(String a, String b, String name, int pass){
        super(a,b);
        this.name = name;
        this.passyear = pass;
    }
    public void view(){
        System.out.println(name + " "+passyear);
        super.view();
    }  
    
}
class Student extends Community{
    private String name;
    private String studentid;
    private String status;
    public Student(String a, String b, String name, String studentid, String status){
        super(a,b);
        this.name = name;
        this.studentid = studentid;
        this.status = status;
    }
    public void view(){
        System.out.println(name + " "+ studentid+" "+status);
        super.view();
    }
}
class Faculty extends Employees{
    private int facultycode, joinyear;
    private String designation;
    public Faculty(String a, String b, String name, String employeeid, double salary, double increment, int facultycode, int joinyear, String designation){
        super(a,b,name,employeeid, salary, increment);
        this.facultycode = facultycode;
        this.joinyear = joinyear;
        this.designation = designation;
    }
    public void view(){
        System.out.println(facultycode+" "+joinyear+" "+designation);
        super.view();
    }
}
class Staff extends Employees{
    private int joinyear, duration;
    public Staff(String a, String b, String name, String employeeid, double salary, double increment, int joinyear, int duration ){
        super(a,b,name,employeeid, salary, increment);
        this.joinyear = joinyear;
        this.duration = duration;
    }
    public void view(){
        System.out.println(joinyear+" "+duration);
        super.view();
    }
}
class Administrator extends Faculty{
    private String position;
    private double duration;
    public Administrator(String a, String b, String name, String employeeid, double salary, double increment, int facultycode, int joinyear, String designation, String position , double duration)
    {
        super(a, b,name, employeeid, salary, increment, facultycode, joinyear ,designation);
        this.position = position;
        this.duration = duration;
    }
    public void view(){
        System.out.println(position+' '+duration);
        super.view();
    }
}
class Teacher extends Faculty{
    private int nocourses;
    private double weeklyhour;
    public Teacher(String a, String b, String name, String employeeid, double salary, double increment, int facultycode, int joinyear, String designation, int nocourses, double weeklyhour)
    {
        super(a, b,name, employeeid, salary, increment, facultycode, joinyear ,designation);
        this.nocourses = nocourses;
        this.weeklyhour = weeklyhour;
    }
    public void view(){
        System.out.println(nocourses+' '+weeklyhour);
        super.view();
    }
}


public class UniversityHeirarchy {
 
    public static void main(String[] args) {
         
    }
    
}
