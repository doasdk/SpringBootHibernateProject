package s474155.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "title")
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long titleId; //fk
    @Column(name = "titleName")
    private String titleName;
    @Column(name = "minSalary")
    private int minSalary;
    @Column(name = "maxSalary")
    private int maxSalary;


    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Employee> employees;


    public Title() {
    }

    public Title(Long titleId, String titleName, int minSalary, int maxSalary) {
        this.titleId = titleId;
        this.titleName = titleName;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Long getTitleId() {
        return titleId;
    }

    public void setTitleId(Long titleId) {
        this.titleId = titleId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }
}
