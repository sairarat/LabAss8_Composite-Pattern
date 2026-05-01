class College extends CompositeUnit {
    public College(String name) { super(name); }

    @Override
    public void displayDetails(int indent) {
        System.out.println("  ".repeat(indent) + "College: " + name);
        for (EducationUnit child : children) child.displayDetails(indent + 1);
    }
}