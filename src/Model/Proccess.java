package Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Proccess {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private Criminal criminal;

    @ManyToMany
    private List<Crime> crimes;

    public Proccess() {}

    public Proccess(Long id, Criminal criminal, List<Crime> crimes) {
        this.id = id;
        this.criminal = criminal;
        this.crimes = crimes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Criminal getCriminal() {
        return criminal;
    }

    public void setCriminal(Criminal criminal) {
        this.criminal = criminal;
    }

    public List<Crime> getCrimes() {
        return crimes;
    }

    public void setCrimes(List<Crime> crimes) {
        this.crimes = crimes;
    }

    @Override
    public String toString() {
        return "Proccess{" +
                "id=" + id +
                ", crimes=" + crimes +
                '}';
    }
}
