package school_management_system;

import javax.xml.namespace.QName;

/** created by kishore S on 4/7/2023
 * this class is resposible for keeping the track
 * of teachers name, id , salary
 */
public class Teacher {
    private int id;
    private String name;
    private double salary;
    private double salaryEarned;

    public Teacher(int id, String name,double salary){
        this.id=id;
        this.name= name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     * @return the id
     */
    public int getId(){
        return id;
    }

    /**
     * @return the name
     */
    public String getName(){
        return name;
    }

    /**
     * @return the salary of the teacher
     */
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name of the teacher: "+ name+
                "Total salary earned so far $ "+salaryEarned;
    }

    /**
     * Adds to salaryEarned
     * remove from the total money earned by the School.
     * @param salary .
     */
    public void receiveSalary(double salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent((int) salary);




    }
}
