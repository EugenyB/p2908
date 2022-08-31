import java.util.Objects;

public class Pizza {
    private int size;
    private int tomatoes;
    private int sausages;
    private int olives;
    private int cheese;
    private int chicken;
    private int mushrooms;

    public static Pizza create(int size, int tomatoes, int sausages, int olives, int cheese, int chicken, int mushrooms) {
        if (size < 30 || tomatoes < 0 || sausages < 0 || olives < 0 || cheese < 0 || chicken < 0 || mushrooms < 0) {
            return null;
        }
        return new Pizza(size, tomatoes, sausages, olives, cheese, chicken, mushrooms);
    }

    private Pizza(int size, int tomatoes, int sausages, int olives, int cheese, int chicken, int mushrooms) {
        this.size = size;
        this.tomatoes = tomatoes;
        this.sausages = sausages;
        this.olives = olives;
        this.cheese = cheese;
        this.chicken = chicken;
        this.mushrooms = mushrooms;
    }

    public int getSize() {
        return size;
    }

    public int getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(int tomatoes) {
        this.tomatoes = tomatoes;
    }

    public int getSausages() {
        return sausages;
    }

    public void setSausages(int sausages) {
        this.sausages = sausages;
    }

    public int getOlives() {
        return olives;
    }

    public void setOlives(int olives) {
        this.olives = olives;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getChicken() {
        return chicken;
    }

    public void setChicken(int chicken) {
        this.chicken = chicken;
    }

    public int getMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(int mushrooms) {
        this.mushrooms = mushrooms;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", tomatoes=" + tomatoes +
                ", sausages=" + sausages +
                ", olives=" + olives +
                ", cheese=" + cheese +
                ", chicken=" + chicken +
                ", mushrooms=" + mushrooms +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return size == pizza.size && tomatoes == pizza.tomatoes && sausages == pizza.sausages && olives == pizza.olives && cheese == pizza.cheese && chicken == pizza.chicken && mushrooms == pizza.mushrooms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, tomatoes, sausages, olives, cheese, chicken, mushrooms);
    }
}
