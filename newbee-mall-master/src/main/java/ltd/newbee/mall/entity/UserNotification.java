package ltd.newbee.mall.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserNotification implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @JsonIgnore
    private Integer id;
    private Integer user_id;
    private String notification_title;
    private String notification_from;
    private String notification_content;
    private Boolean notification_status;
    private Date notification_time;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getNotification_title() {
        return notification_title;
    }

    public void setNotification_title(String notification_title) {
        this.notification_title = notification_title;
    }

    public String getNotification_from() {
        return notification_from;
    }

    public void setNotification_from(String notification_from) {
        this.notification_from = notification_from;
    }

    public String getNotification_content() {
        return notification_content;
    }

    public void setNotification_content(String notification_content) {
        this.notification_content = notification_content;
    }

    public Boolean getNotification_status() {
        return notification_status;
    }

    public void setNotification_status(Boolean notification_status) {
        this.notification_status = notification_status;
    }

    public Date getNotification_date() {
        return notification_time;
    }

    public void setNotification_date(Date notification_time) {
        this.notification_time = notification_time;
    }
}
