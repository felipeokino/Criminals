package Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Neighborhood {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String city;

    @ManyToMany
    private List<Crime> list_crime;

    public Neighborhood(String name, String city, List<Crime> list_crime) {
        this.name = name;
        this.city = city;
        this.list_crime = list_crime;
    }

    public Neighborhood() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Crime> getList_crime() {
        return list_crime;
    }

    public void setList_crime(List<Crime> list_crime) {
        this.list_crime = list_crime;
    }

    @Override
    public String toString() {
        return "Neighborhood{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", list_crime=" + list_crime +
                '}';
    }
}
