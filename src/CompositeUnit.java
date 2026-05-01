import java.util.ArrayList;
import java.util.List;

abstract class CompositeUnit implements EducationUnit {
    protected String name;
    protected List<EducationUnit> children = new ArrayList<>();

    public CompositeUnit(String name) { this.name = name; }
    public void add(EducationUnit unit) { children.add(unit); }
    public String getName() { return name; }

    @Override
    public int getStudentCount() {
        return children.stream().mapToInt(EducationUnit::getStudentCount).sum();
    }

    @Override
    public double getBudget() {
        return children.stream().mapToDouble(EducationUnit::getBudget).sum();
    }
}


