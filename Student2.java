package chapter_09;


import java.text.DecimalFormat;

public class Student2
{
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private int test1;
	private int test2;
	private int test3;
    private final int NUM_TESTS = 3;

    //-----------------------------------------------------------------
    //  Sets up this Student object with the specified initial values.
    //-----------------------------------------------------------------
    public Student2(String first, String last, Address home,
            Address school, int testScore1, int testScore2,
            int testScore3 )
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test1 = testScore1;
        test2 = testScore2;
        test3 = testScore3;
    }

    //-----------------------------------------------------------------
    //  Sets up this Student object with the specified initial values,
    //  setting initial test scores to 0;
    //-----------------------------------------------------------------
    public Student2(String first, String last, Address home,
            Address school)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test1 = test2 = test3 = 0;
    }

    //-----------------------------------------------------------------
    //  Sets the score of the specified test. Does nothing if the test
    //  number is invalid.
    //-----------------------------------------------------------------
    public void setTestScore(int testNumber, int score)
    {
        switch (testNumber)
        {
            case 1 :
                test1 = score;
                break;
            case 2 :
                test2 = score;
                break;
            case 3 :
                test3 = score;
        }
    }

    //-----------------------------------------------------------------
    //  Returns the average of the three test scores.
    //-----------------------------------------------------------------
    public double average()
    {
        double average = test1 + test2 + test3;
        return (double) average / NUM_TESTS;

    }

    //-----------------------------------------------------------------
    //  Returns the score of the specified test. Returns 0 if the test
    //  number is invalid.
    //-----------------------------------------------------------------
    public int getTestScore(int testNumber)
    {
        switch (testNumber)
        {
            case 1: return test1;
            case 2: return test2;
            case 3: return test3;
            default: return 0;
        }
    }

    //-----------------------------------------------------------------
    //  Returns a representation of this student as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result;

        result = "----------------------------------------\n";
        result += firstName + " " + lastName + "\n";
        result += "----------------------------------------\n";
        result += "Home Address:  " + homeAddress + "\n";
        result += "\nSchool Address:  " + schoolAddress;
        result += "\n\nTest 1 score: " + test1;
        result += "\nTest 2 score: " + test2;
        result += "\nTest 3 score: " + test3;

        DecimalFormat formatter = new DecimalFormat("0.0#");
        result += "\nAverage test score: " + formatter.format(average()) + "\n";

        return result;
    }
    public void roll(){


            System.out.println(average());
        }
}