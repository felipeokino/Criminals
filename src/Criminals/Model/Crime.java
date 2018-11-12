package Criminals.Model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Crime {
    @Id
    @GeneratedValue
    private long id;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    private Gang gang;

    @ManyToOne
    private Criminal criminal;

    public Crime(String description, Date date, Gang gang) {
        this.description = description;
        this.date = date;
        this.gang = gang;
    }

    public Crime(long id, String description, Date date, Criminal criminal) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Crime{" +
            "description='" + description + '\'' +
            ", criminal=" + gang +
            '}';
    }
}
