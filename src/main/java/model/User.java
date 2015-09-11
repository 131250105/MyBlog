package model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by apple on 2015/7/29.
 */
@Entity(name="tb_user")
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String question;
    private String answer;
    private String city;
    private List<Diary> diaries;

    @Id
    @GeneratedValue
    public int getUserid() {return id;}
    public void setUserid(int userid) {
        this.id = userid;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getQuestion() {return question;}
    public void setQuestion(String question) {this.question = question;}

    public String getAnswer() {return answer;}
    public void setAnswer(String answer) {this.answer = answer;}

    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public List<Diary> getDiaries() {return diaries;}
    public void setDiaries(List<Diary> diaries) {this.diaries = diaries;}
}
