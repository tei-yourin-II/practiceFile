package ltd.newbee.mall.controller.mall;

import ltd.newbee.mall.entity.UserNotification;
import ltd.newbee.mall.service.UserNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notification")
public class UserNotificationController {

    @Autowired
    private UserNotificationService userNotificationService;

    @PostMapping("/insertNotification")
    public int insertUserNotification(@RequestBody UserNotification userNotification) {
        return userNotificationService.insertNotification(userNotification);
    }

    @PutMapping("/updateStatusNotification")
    public int updateUserNotificationStatus(@RequestBody UserNotification userNotification) {
        return userNotificationService.updateNotificationStatus(userNotification);
    }

    @DeleteMapping("/deleteNotification")
    public int deleteUserNotification(@RequestBody UserNotification userNotification) {
        return userNotificationService.deleteNotification(userNotification);
    }

    @GetMapping("/findNotification")
    public List<UserNotification> findUserNotifications(@RequestParam("user_id") Integer user_id,
                                                        @RequestParam(value = "notification_title", required = false) String notification_title,
                                                        @RequestParam(value = "notification_from", required = false) String notification_from,
                                                        @RequestParam(value = "notification_content", required = false) String notification_content) {
        UserNotification userNotification = new UserNotification();
        userNotification.setUser_id(user_id);
        userNotification.setNotification_title(notification_title);
        userNotification.setNotification_from(notification_from);
        userNotification.setNotification_content(notification_content);
        return userNotificationService.findNotifications(userNotification);
    }
}
