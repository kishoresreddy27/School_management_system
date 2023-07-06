package school_management_system;

import java.util.List;

/**
 * created by kishore S on 5/7/2023
 * impliments Student and Teacher
 * using an Arraylist
 * many teachers AND STUDENTs
 */
public class School {
    private List<Teacher> teachers ;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;

    }


    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds a Teacher to the school
     * @param teacher the teacher to be added.
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {

        return students;
    }

    public void addStudents(Student student) {

        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return
                totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     * @param MoneyEarned money that is suppossed to be added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {

        totalMoneyEarned +=  MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {

        return totalMoneySpent;
    }

    /**
     * money that spent by the school
     * is that  salary given to the teachers
     * @param MoneySpent
     */
    public static void updateTotalMoneySpent(int MoneySpent) {

        totalMoneyEarned=totalMoneyEarned- MoneySpent;
    }


}
