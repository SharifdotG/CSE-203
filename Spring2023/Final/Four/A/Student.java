package Spring2023.Final.Four.A;

abstract class Student {
    protected double highestCgpa;

    public double getHighestCgpa() {
        return highestCgpa;
    }
}

class UnderGraduateStudent extends Student {}

class GraduateStudent extends Student {}

class UAP {
    public static void setHighestCgpa(Student obj) {
        if (obj instanceof UnderGraduateStudent) {
            obj.highestCgpa = 4;
        } else if (obj instanceof GraduateStudent) {
            obj.highestCgpa = 5;
        }
    }

    public static void main(String[] args) {
        Student undergradStudent = new UnderGraduateStudent();
        Student gradStudent = new GraduateStudent();

        UAP.setHighestCgpa(undergradStudent); // Sets highestCgpa to 4 for UnderGraduateStudent
        UAP.setHighestCgpa(gradStudent);      // Sets highestCgpa to 5 for GraduateStudent
    }
}
