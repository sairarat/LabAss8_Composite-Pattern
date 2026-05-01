class Department extends CompositeUnit {
    public Department(String name) { super(name); }

    @Override
    public void displayDetails(int indent) {
        System.out.println("  ".repeat(indent) + "Department: " + name);
        for (EducationUnit child : children) child.displayDetails(indent + 1);
    }
}