package school_management_system;


/*
* created by kishore S on 4/7/2023
* this class is responsible for keeping the
* track of student fees, name,grade & fees
* paid
* */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * to create a new student by initializing
     * fees for every student is $30,000
     * fees paid initially is 0
     * @param id id for the student; unique
     * @param name name  of the student
     * @param grade grade of the student
     */
    public Student(int id,String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
//    not going to alter students name,students id.

    /**
     * used to update the student's gradeS
     * @param grade .
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * keep adding the fees to feespaid feilds
     * Add the fees to the feea paid
     * the school is going to recieve the funds
     * @param fees
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }

    public int getId() {
        return id;
    }




    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees(){
       return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: "+name+
                " Total fees paid so far $"+ feesPaid;
    }
}
