package ltd.newbee.mall.entity;

import java.io.Serializable;
import java.util.Date;

public class MessageUnit implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer user_id;
    private Integer owner_id;
    private String user_name;
    private String owner_name;
    private String user_image;
    private String owner_image;
    private String user_message;
    private String owner_message;
    private Date message_time;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public String getOwner_image() {
        return owner_image;
    }

    public void setOwner_image(String owner_image) {
        this.owner_image = owner_image;
    }

    public String getUser_message() {
        return user_message;
    }

    public void setUser_message(String user_message) {
        this.user_message = user_message;
    }

    public String getOwner_message() {
        return owner_message;
    }

    public void setOwner_message(String owner_message) {
        this.owner_message = owner_message;
    }

    public Date getMessage_time() {
        return message_time;
    }

    public void setMessage_time(Date message_time) {
        this.message_time = message_time;
    }
}
