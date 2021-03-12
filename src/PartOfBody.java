import java.util.Objects;

public class PartOfBody {
    private String name;
    public PartOfBody(String name) {
        this.name = name;
    }
    public boolean equals(Object o) {
        return o instanceof PartOfBody && Objects.equals(getName(), ((PartOfBody) o).getName());
    }

    public int hashCode() {
        return Objects.hash(getName());
    }

    public String toString() {
        return "Part of body " + getName();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
