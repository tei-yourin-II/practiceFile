package ltd.newbee.mall.entity;

import java.io.Serializable;

public class FavoriteSearch implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer user_id;
    private String title_name;
    private String hotel_id;
    private Boolean date_status;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getTitle_name() {
        return title_name;
    }

    public void setTitle_name(String title_name) {
        this.title_name = title_name;
    }

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Boolean getDate_status() {
        return date_status;
    }

    public void setDate_status(Boolean date_status) {
        this.date_status = date_status;
    }

    @Override
    public String toString() {
        return "FavoriteAlter{" +
                "user_id=" + user_id +
                ", title_name='" + title_name + '\'' +
                ", hotel_id='" + hotel_id + '\'' +
                ", date_status=" + date_status +
                '}';
    }
}
