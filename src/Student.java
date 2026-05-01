class Student implements EducationUnit {
    private String name, studentId;
    private double tuition;

    public Student(String name, String id, double tuition) {
        this.name = name; this.studentId = id; this.tuition = tuition;
    }

    public void displayDetails(int indent) {
        System.out.println("  ".repeat(indent) + "Student: " + name + " [ID: " + studentId + "]" + " tuition: " + tuition);
    }
    public int getStudentCount() { return 1; }
    public double getBudget() { return -tuition; }
    public String getName() { return name; }
}