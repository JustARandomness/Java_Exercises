class Student { // Задание 9
    protected String name;
    protected String surname;
    protected double avgScore;

    protected int totalGrades;

    Student() {
        name = "Unidentified";
        surname = "Unidentified";
        avgScore = 0;
    }

    Student(String name_value, String surname_value, double avgScore_value, int totalGrades_value) {
        this.name = name_value;
        this.surname = surname_value;
        this.avgScore = avgScore_value;
        this.totalGrades = totalGrades_value;
    }

    public void addGrade(double newGrade) {
        this.totalGrades++;
        this.avgScore = (this.avgScore * this.totalGrades + newGrade) / this.totalGrades;
    }

    public double getScholarship() {
        if (this.avgScore == 5) {
            return 80;
        }
        return 40;
    }
}
