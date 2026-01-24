package fundamentals;

public class Person {
    private final String name;
    private final int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // WRONG: overloaded, not overriding Object.equals(Object)
    public boolean equals(Person other) {
        return other != null && id == other.id && name.equals(other.name);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return id == other.id && java.util.Objects.equals(name, other.name);
    }
    // hashCode present
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return name + ":" + id;
    }
}
