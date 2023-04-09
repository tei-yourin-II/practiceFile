package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.UserNotificationMapper;
import ltd.newbee.mall.entity.UserNotification;
import ltd.newbee.mall.service.UserNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserNotificationServiceImpl implements UserNotificationService {

    @Autowired
    private UserNotificationMapper userNotificationMapper;

    @Override
    public int insertNotification(UserNotification userNotification) {
        return userNotificationMapper.insertUserNotification(userNotification);
    }

    @Override
    public int updateNotificationStatus(UserNotification userNotification) {
        return userNotificationMapper.updateUserNotificationStatus(userNotification);
    }

    @Override
    public int deleteNotification(UserNotification userNotification) {
        return userNotificationMapper.deleteUserNotification(userNotification);
    }

    @Override
    public List<UserNotification> findNotifications(UserNotification userNotification) {
        return userNotificationMapper.findUserNotifications(userNotification);
    }
}
