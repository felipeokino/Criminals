package Criminals.Model;

import javax.persistence.*;


@Entity
public class Crime {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String description;

    private String date;

    private String local;

    @ManyToOne
    private Gang gang;

    @ManyToOne
    private Criminal criminal;

    @ManyToOne
    private Neighborhood neighborhood;

    public Crime(String description, String date, Gang gang) {
        this.description = description;
        this.date = date;
        this.gang = gang;
    }

    public Crime(long id, String description, String date, Criminal criminal) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.criminal = criminal;
    }

    public Crime() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Gang getGang() {
        return gang;
    }

    public void setGang(Gang gang) {
        this.gang = gang;
    }

    public Criminal getCriminal() {
        return criminal;
    }

    public void setCriminal(Criminal criminal) {
        this.criminal = criminal;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }

    @Override
    public String toString() {
        return "Crime{" +
            "description='" + description + '\'' +
            ", criminal=" + gang +
            '}';
    }
}
