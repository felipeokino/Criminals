package Criminals.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Gang {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;

    @OneToMany
    private List<Criminal> criminals;

    public Gang() {
    }

    public Gang(long id, String name, List<Criminal> criminals) {
        this.id = id;
        this.name = name;
        this.criminals = criminals;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Criminal> getCriminals() {
        return criminals;
    }

    public void setCriminals(List<Criminal> criminals) {
        this.criminals = criminals;
    }

    @Override
    public String toString() {
        return "Gang{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", criminals=" + criminals +
                '}';
    }

}
