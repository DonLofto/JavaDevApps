
public abstract class Student {

    private String name;
    private long id;
    private String grade;
    private int[] test;
    private final int NUM_TESTS = 3;

    //default constructor
    public Student() {

    }

    //initialize student with name and id
    public Student(String n, long i) {
        name = n;
        id = i;
        test = new int[NUM_TESTS];

    }

    //get student name
    public String getName() {

        return name;
    }

    //set student name
    public void setName(String n) {

        name = n;
    }

    //get student id
    public long getID() {

        return id;
    }

    //set student id
    public void setID(long i) {

        id = i;
    }

    //get grade
    public String getGrade() {
        return grade;
    }

    //set grade
    public void setGrade(String g) {

        grade = g;
    }

    //set test score at index
    public void setTestScore(int ids, int score) {
        if (ids >= 0 && ids <= 2)
            test[ids] = score;
    }

    //getTestScore
    public int getTestScore(int ids) {
        if (ids < 0 || ids > 2)
            return -1;
        return test[ids];
    }

    //getNumTests
    public int getNUM_TESTS() {
        return NUM_TESTS;
    }

    //return string of Student
    public String toString() {
        return "Name: " + name
                + "\nID: " + id + "\nTests Score: [" + test[0] + ", " + test[1] + ", " + test[2] + "]" + "\nGrade: " + grade;

    }

    //calculate result depend on student
    public abstract void calculateResult();

    public void printResult() {
    }

}
