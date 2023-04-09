package ltd.newbee.mall.service;

import ltd.newbee.mall.entity.BookingInfo;

import java.util.List;

public interface BookingInfoService {
    List<BookingInfo> findBookingInfoByUserId(Integer userId);

    int insertBooking(BookingInfo bookingInfo);

    int deleteBooking(BookingInfo bookingInfo);

    int updateBooking(BookingInfo bookingInfo);
}
