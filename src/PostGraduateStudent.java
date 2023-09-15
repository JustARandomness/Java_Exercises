class PostGraduateStudent extends Student {
    PostGraduateStudent(String surname_value, String name_value, double avgScore_value, int totalGrades_value) {
        super(name_value, surname_value, avgScore_value, totalGrades_value);
    }

    @Override
    public double getScholarship() {
        if (this.avgScore == 5) {
            return 150;
        }
        return 100;
    }
}
