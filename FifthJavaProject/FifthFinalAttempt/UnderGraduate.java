
public class UnderGraduate extends Student {

    //default constructor
    public UnderGraduate() {
    }

    //Initialise UnderGraduate Student with name and id
    public UnderGraduate(String name, long id)
    {
        super(name, id);
    }

    //UnderGraduate student pass if average of 3 exams is equal or over 40
    @Override
    public void calculateResult() {
        double sum = 0;
        for (int i = 0; i < getNUM_TESTS(); i++) {
            sum += getTestScore(i);
        }
        double avg = sum / getNUM_TESTS();
        if (avg >= 40)
            setGrade("Pass");
        else
            setGrade("Fail");
    }

    //return string of UnderGraduate
    @Override
    public String toString() {
        return "UnderGraduate Student\n" + super.toString();
    }
    
    
}
