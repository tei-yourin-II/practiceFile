package ltd.newbee.mall.service;

import ltd.newbee.mall.entity.MessageUnit;

import java.util.List;

public interface MessageUnitService {
    List<MessageUnit> findMessagesByUserId(Integer user_id);

    List<MessageUnit> findMessagesByOwnerId(Integer owner_id);

    int insertUserMessage(MessageUnit messageUnit);

    int insertOwnerMessage(MessageUnit messageUnit);
}
