package ltd.newbee.mall.entity;

import java.io.Serializable;
import java.util.Date;

public class BookingInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer user_id;
    private Integer hotel_id;
    private Integer room_id;
    private String order_id;
    private Date check_in_date;
    private Date check_out_date;
    private String user_name;
    private Integer adult_num;
    private Integer children_num;
    private Integer infant_num;
    private Integer pet_num;
    private Integer customer_total_num;
    private String user_address;
    private String hotel_rule;

    // Getters and setters
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Date getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(Date check_in_date) {
        this.check_in_date = check_in_date;
    }

    public Date getCheck_out_date() {
        return check_out_date;
    }

    public void setCheck_out_date(Date check_out_date) {
        this.check_out_date = check_out_date;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getAdult_num() {
        return adult_num;
    }

    public void setAdult_num(Integer adult_num) {
        this.adult_num = adult_num;
    }

    public Integer getChildren_num() {
        return children_num;
    }

    public void setChildren_num(Integer children_num) {
        this.children_num = children_num;
    }

    public Integer getInfant_num() {
        return infant_num;
    }

    public void setInfant_num(Integer infant_num) {
        this.infant_num = infant_num;
    }

    public Integer getPet_num() {
        return pet_num;
    }

    public void setPet_num(Integer pet_num) {
        this.pet_num = pet_num;
    }

    public Integer getCustomer_total_num() {
        return customer_total_num;
    }

    public void setCustomer_total_num(Integer customer_total_num) {
        this.customer_total_num = customer_total_num;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getHotel_rule() {
        return hotel_rule;
    }

    public void setHotel_rule(String hotel_rule) {
        this.hotel_rule = hotel_rule;
    }
}
