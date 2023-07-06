package school_management_system;

import java.util.ArrayList;
import java.util.List;

/**
 * created  by kishore s on 05/07/2023
 */
public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"lizzy",5000.00);
        Teacher elisa = new Teacher(2,"elisa",6000.00);

        List<Teacher>teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(elisa);

        Student kishore = new Student(1,"kishore",8);
        Student naresh = new Student(2,"naresh",7);
        Student ranjan = new Student(3,"ranjan",10);
        List<Student>studentList = new ArrayList<>();

        studentList.add(kishore);
        studentList.add(naresh);
        studentList.add(ranjan);

        School govtSchool = new School(teacherList,studentList);


        kishore.payFees(5000);
//        System.out.println("govtSchool has earned"+govtSchool.getTotalMoneyEarned());
        naresh.payFees(6000);
        System.out.println("govtSchool has earned"+govtSchool.getTotalMoneyEarned());

        System.out.println("making School Pay Salary");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("govtSchool has spent for salary to "
                +lizzy.getName()+" and now remianed $ "
                + govtSchool.getTotalMoneyEarned());

        System.out.println(kishore);
        System.out.println(elisa);
    }

}


