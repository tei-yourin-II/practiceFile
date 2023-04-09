package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.BookingInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookingInfoMapper {
    List<BookingInfo> findBookingInfoByUserId(Integer userId);

    int insertBooking(BookingInfo bookingInfo);

    int deleteBooking(BookingInfo bookingInfo);

    int updateBooking(BookingInfo bookingInfo);
}
