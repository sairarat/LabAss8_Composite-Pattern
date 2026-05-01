public class TestAccount {
    public static void main(String[] args) {
        System.out.println("New Era University");

        // --- 1. COLLEGE OF INFORMATICS AND COMPUTING STUDIES ---
        College cics = new College("College of Informatics and Computing Studies");

        // Department: Computer Science
        Department cs = new Department("Computer Science");
        cs.add(new Teacher("Dr. Marc", "Fundamentals of Programming", 35500));
        cs.add(new Student("Saki", "23-45823-815", 30000));
        cs.add(new Student("Juliana", "22-12044-202", 12000));
        cs.add(new Student("Alberto", "23-11588-204", 30000));
        cs.add(new Student("Precy", "23-11077-106", 40000));

        // Department: Information Systems
        Department is = new Department("Information Systems");
        is.add(new Teacher("Prof. Andrea", "Database Systems", 32000));
        is.add(new Student("Kate", "23-11111-001", 35000));
        is.add(new Student("Aren", "23-22222-002", 35000));

        cics.add(cs);
        cics.add(is);

        // --- 2. COLLEGE OF ACCOUNTANCY ---
        College coa = new College("College of Accountancy");
        Department accountancy = new Department("Accountancy");
        accountancy.add(new Teacher("Prof. Rogerson", "Business Tax", 30100));
        accountancy.add(new Student("Francine", "22-10368-002", 27000));
        accountancy.add(new Student("Marco", "22-99999-888", 25000));

        accountancy.add(coa);

       //Print CICS Details
        cics.displayDetails(0);
        System.out.println("\n----Analytics for " + cics.getName() + "----");
        System.out.println("Total Students: " + cics.getStudentCount());
        System.out.printf("Total Budget: $%.2f\n", cics.getBudget());
        System.out.println("----------------------------------------------------------------------\n");

        // Print Accountancy Details
        accountancy.displayDetails(0);
        System.out.println("\n----Analytics for " + accountancy.getName() + "----");
        System.out.println("Total Students: " + accountancy.getStudentCount());
        System.out.printf("Total Budget: $%.2f\n", accountancy.getBudget());
        System.out.println("----------------------------------------------------------------------\n");

    }
}