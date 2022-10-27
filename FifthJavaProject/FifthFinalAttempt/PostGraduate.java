
public class PostGraduate extends Student {

    //default constructor
    public PostGraduate() {
    }

    //Initialise PostGraduate Student with name and id
    public PostGraduate(String name, long id)
    {
        super(name, id);
    }

    //PostGraduate student pass if average of 3 exams is equal or over 50
    @Override
    public void calculateResult() {
        double sum = 0;
        for (int i = 0; i < getNUM_TESTS(); i++) {
            sum += getTestScore(i);
        }
        double avg = sum / getNUM_TESTS();
        if (avg >= 50)
            setGrade("Pass");
        else
            setGrade("Fail");
            setGrade(getGrade());
    }

    //return string of PostGraduate
    @Override
    public String toString() {
        return "PostGraduate Student\n" + super.toString();
        
    }

}
