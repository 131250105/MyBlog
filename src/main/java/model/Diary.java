package model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by apple on 2015/8/17.
 */
@Entity(name="tb_Diary")
public class Diary {
    private int id;
    private String title;
    private String context;
    private Timestamp writetime;
    private Timestamp updatetime;
    private User author;

    @Id
    @GeneratedValue
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getContext() {return context;}
    public void setContext(String context) {this.context = context;}

    @PrePersist
    public Timestamp getWritetime() {return writetime;}
    public void setWritetime(Timestamp writetime) {this.writetime = writetime;}

    @PrePersist
    @PreUpdate
    public Timestamp getUpdatetime() {return updatetime;}
    public void setUpdatetime(Timestamp updatetime) {this.updatetime = updatetime;}

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userid")
    public User getAuthor() {return author;}
    public void setAuthor(User author) {this.author = author;}
}
