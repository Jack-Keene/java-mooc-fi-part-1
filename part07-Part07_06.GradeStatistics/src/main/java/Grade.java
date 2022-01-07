public class Grade {
    private int score;
    private int grade;

    public Grade(int score) {
        this.score = score;
        this.grade = grade(score);
    }

    public int getScore() {
        return score;
    }

    public int getGrade() {
        return grade;
    }

    public int grade(int grade) {
        if (grade < 50) {
            return 0;
        }
        if (grade < 60) {
            return 1;
        }
        if (grade < 70) {
            return 2;
        }
        if (grade < 80) {
            return 3;
        }
        if (grade < 90) {
            return 4;
        }
        return 5;
    }
}
