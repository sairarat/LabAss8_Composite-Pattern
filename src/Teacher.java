class Teacher implements EducationUnit {
    private String name, subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name; this.subject = subject; this.salary = salary;
    }

    public void displayDetails(int indent) {
        System.out.println("  ".repeat(indent) + "Teacher: " + name + " (Subject: " + subject + ", Salary: " + salary + ")");
    }
    public int getStudentCount() { return 0; }
    public double getBudget() { return salary; }
    public String getName() { return name; }
}