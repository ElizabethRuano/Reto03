package Entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@entity
@Table(name = "boats")
public class Boat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String brand;
    private Integer year_1;
    private String description;

    @ManyToOne
    //  Aquí fue necesario cambiar el id por categoryId porque spring data requiere que el nombre de id
    //  sea diferente
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("boats")
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "boat")
    //  Aqui coloqué que ignore tanto boat como client
    //  al traer la lista de mensajes
    @JsonIgnoreProperties({"boat", "client"})
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "boat")
    @JsonIgnoreProperties("boat")
    private List<Reservation> reservations;

    public Integer getYear_1() {
        return year_1;
    }

    public void setYear_1(Integer year_1) {
        this.year_1 = year_1;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year_1;
    }

    public void setYear(Integer year) {
        this.year_1 = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Message> getListmessages() {
        return messages;
    }

    public void setListmessages(List<Message> listmessages) {this.messages = listmessages;}
}
