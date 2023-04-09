package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.MessageUnitMapper;
import ltd.newbee.mall.entity.MessageUnit;
import ltd.newbee.mall.service.MessageUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageUnitServiceImpl implements MessageUnitService {

    @Autowired
    private MessageUnitMapper messageUnitMapper;

    @Override
    public List<MessageUnit> findMessagesByUserId(Integer user_id) {
        return messageUnitMapper.findMessagesByUserId(user_id);
    }

    @Override
    public List<MessageUnit> findMessagesByOwnerId(Integer owner_id) {
        return messageUnitMapper.findMessagesByOwnerId(owner_id);
    }

    @Override
    public int insertUserMessage(MessageUnit messageUnit) {
        return messageUnitMapper.insertUserMessage(messageUnit);
    }

    @Override
    public int insertOwnerMessage(MessageUnit messageUnit) {
        return messageUnitMapper.insertOwnerMessage(messageUnit);
    }
}
