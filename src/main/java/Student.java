import java.time.LocalDate;

public class Student {
    private String name;

    private double rating;

    private LocalDate birthday;

    public Student(String name, double rating, LocalDate birthday) {
        this.name = name;
        this.rating = rating;
        this.birthday = birthday;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
