package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.BookingInfoMapper;
import ltd.newbee.mall.entity.BookingInfo;
import ltd.newbee.mall.service.BookingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingInfoServiceImpl implements BookingInfoService {
    @Autowired
    private BookingInfoMapper bookingInfoMapper;

    @Override
    public List<BookingInfo> findBookingInfoByUserId(Integer userId) {
        return bookingInfoMapper.findBookingInfoByUserId(userId);
    }

    @Override
    public int insertBooking(BookingInfo bookingInfo) {
        return bookingInfoMapper.insertBooking(bookingInfo);
    }

    @Override
    public int deleteBooking(BookingInfo bookingInfo) {
        return bookingInfoMapper.deleteBooking(bookingInfo);
    }

    @Override
    public int updateBooking(BookingInfo bookingInfo) {
        return bookingInfoMapper.updateBooking(bookingInfo);
    }
}
