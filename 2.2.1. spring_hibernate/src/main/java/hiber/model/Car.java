package hiber.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cars")
public class Car implements Serializable {
    public Car() {}

    @Override
    public String toString() {
        return "Car{" +
                "user=" + user +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    @Id
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;


    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }




}
