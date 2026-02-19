package lesson_4;


class student{
    int empID;
    String name;
    int mark;

    student(){
        System.out.println("************************************");
        empID=7123;
        name="atharv";
        mark=30;

    }

    void displaydetails(){
        System.out.println(empID + " the name of the student is "+ name +" mark : "+mark);


    }
        

}
public class main_homework {
    public static void main(String[] args) {
      student emp1=new student();
      student emp2=new student();
      student emp3=new student();
      
      emp2.empID=7124;
      emp2.name="samaviya";
      emp2.mark=40;

      emp3.empID=7120;
      emp3.name="renuka";
      emp3.mark=39;
      


      emp1.displaydetails();
      emp2.displaydetails();
      emp3.displaydetails();
    }
            
}
