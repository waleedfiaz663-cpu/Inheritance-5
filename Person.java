
public class Person {
    
    String name;
    int age;
    
    void Display(){
        
        System.out.println("Name : " +name );
        System.out.println("Age : "+age);
    }


static class Student extends Person {
    
    int rollno;
    double cgpa;
    
void display(){
    
    System.out.println("Rollno : " +rollno );
    System.out.println("Cgpa : " +cgpa);
}

static class GraduateStudent extends Student{
    
    String researchtopic;
    int semester;
    
    void show(){
        
      System.out.println("Researchtopic : " +researchtopic );
      System.out.println("Semester : " + semester);
    }
     
static class main{
    
    public static void main(String[] args){
        
        GraduateStudent g1 = new GraduateStudent();
        
        g1.age = 22;
        g1.name = "Waleed";
        g1.researchtopic = "Depression";
        g1.semester = 4;
        g1.rollno = 135;
        g1.cgpa = 3.5;
        g1.Display();
        g1.display();
        g1.show();
    }
}
}
}
}



