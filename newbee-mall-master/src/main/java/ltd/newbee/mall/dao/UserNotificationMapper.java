package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.UserNotification;

import java.util.List;

public interface UserNotificationMapper {
    int insertUserNotification(UserNotification userNotification);

    int updateUserNotificationStatus(UserNotification userNotification);

    int deleteUserNotification(UserNotification userNotification);

    List<UserNotification> findUserNotifications(UserNotification userNotification);
}
