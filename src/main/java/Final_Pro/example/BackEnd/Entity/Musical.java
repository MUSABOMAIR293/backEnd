package Final_Pro.example.BackEnd.Entity;


import javax.persistence.*;

@Entity
@Table(name = "Musical")
public class Musical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mu_id;


    private String img;
    private String nameTools;

    private String dataCrate;

    private String describeText;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public int getMu_id() {
        return mu_id;
    }

    public void setMu_id(int mu_id) {
        this.mu_id = mu_id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNameTools() {
        return nameTools;
    }

    public void setNameTools(String nameTools) {
        this.nameTools = nameTools;
    }

    public String getDataCrate() {
        return dataCrate;
    }

    public void setDataCrate(String dataCrate) {
        this.dataCrate = dataCrate;
    }

    public String getDescribeText() {
        return describeText;
    }

    public void setDescribeText(String describeText) {
        this.describeText = describeText;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Musical() {
    }

    public Musical(int mu_id, String img, String nameTools, String dataCrate, String describeText, User user) {
        this.mu_id = mu_id;
        this.img = img;
        this.nameTools = nameTools;
        this.dataCrate = dataCrate;
        this.describeText = describeText;
        this.user = user;
    }
}
