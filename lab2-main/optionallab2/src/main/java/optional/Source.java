package optional;

import java.util.Objects;

abstract class Source {
    private String name;
    private int capacity;

    public String getName() {  /*get pt nume */
        return name;
    }

    public void setName(String name) {/*set pt nume */
        this.name = name;
    }

    public int getCapacity() { /*get pt capacity */
        return capacity;
    }

    public void setCapacity(int capacity) { /*set pt capacity */
        this.capacity = capacity;
    }


    @Override
    public String toString() { /* metoda toString am suprascris cand vom avea nevoie de reprezentarea textuala a unui obiect */
        return "Source{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) { /* metoda equals*/
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Source source = (Source) o;
        return Objects.equals(name, source.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

