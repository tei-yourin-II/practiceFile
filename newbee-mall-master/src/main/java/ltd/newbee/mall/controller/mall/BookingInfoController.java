package ltd.newbee.mall.controller.mall;

import ltd.newbee.mall.entity.BookingInfo;
import ltd.newbee.mall.service.BookingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookingInfo")
public class BookingInfoController {

    @Autowired
    private BookingInfoService bookingInfoService;

    @GetMapping("/findBookingInfo/{userId}")
    public ResponseEntity<List<BookingInfo>> findBookingInfoByUserId(@PathVariable("userId") Integer userId) {
        List<BookingInfo> bookingInfoList = bookingInfoService.findBookingInfoByUserId(userId);
        return ResponseEntity.ok(bookingInfoList);
    }

    @PostMapping
    public ResponseEntity<Integer> insertBooking(@RequestBody BookingInfo bookingInfo) {
        int result = bookingInfoService.insertBooking(bookingInfo);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping
    public ResponseEntity<Integer> deleteBooking(@RequestBody BookingInfo bookingInfo) {
        int result = bookingInfoService.deleteBooking(bookingInfo);
        return ResponseEntity.ok(result);
    }

    @PutMapping
    public ResponseEntity<Integer> updateBooking(@RequestBody BookingInfo bookingInfo) {
        int result = bookingInfoService.updateBooking(bookingInfo);
        return ResponseEntity.ok(result);
    }
}
