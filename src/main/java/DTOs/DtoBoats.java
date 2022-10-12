package DTOs;


import com.example.demo.Entidades.Category;
import com.example.demo.Entidades.Message;
import com.example.demo.Entidades.Reservation;
import java.util.List;

public class DtoBoats {
    private Integer id;
    private String name;
    private String brand;
    private Integer year;
    private String description;

    private Category category;
    private List<Message> listmessages;
    private List<Reservation> listReservations;

    public DtoBoats() {
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
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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
        return listmessages;
    }

    public void setListmessages(List<Message> listmessages) {
        this.listmessages = listmessages;
    }

    public List<Reservation> getListReservations() {
        return listReservations;
    }

    public void setListReservations(List<Reservation> listReservations) {
        this.listReservations = listReservations;
    }


    public DtoBoats(Integer id, String name, String brand, Integer year, String description, Category category, List<Message> listmessages, List<Reservation> listReservations) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.description = description;
        this.category = category;
        this.listmessages = listmessages;
        this.listReservations = listReservations;
    }
}