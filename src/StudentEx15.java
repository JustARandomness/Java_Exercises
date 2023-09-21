import java.util.List;

public class StudentEx15 {
    protected String name;
    protected int year;
    protected int group;
    protected List<Double> grades;

    public StudentEx15() {
        String name = "unidentified";
        int year = 0;
        int group = 0;
    }

    public StudentEx15(String name, int year, int group, List<Double> grades) {
        this.name = name;
        this.year = year;
        this.group = group;
        this.grades = grades;
    }

    public List<Double> getGrades() {
        return this.grades;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public int getGroup() {
        return this.group;
    }

    public void increaseYear() {
        this.year++;
    }

    public double getAvgScore() {
        double sum = 0.0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / (this.grades.size());
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public String toString() {
        return "Name: " + this.name + " | Year and group: " + this.year + " " + this.group + " | Average score: " + this.getAvgScore();
    }
}
