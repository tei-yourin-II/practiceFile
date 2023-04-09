package ltd.newbee.mall.service;

import ltd.newbee.mall.entity.UserNotification;
import java.util.List;

public interface UserNotificationService {
    int insertNotification(UserNotification userNotification);

    int updateNotificationStatus(UserNotification userNotification);

    int deleteNotification(UserNotification userNotification);

    List<UserNotification> findNotifications(UserNotification userNotification);
}
