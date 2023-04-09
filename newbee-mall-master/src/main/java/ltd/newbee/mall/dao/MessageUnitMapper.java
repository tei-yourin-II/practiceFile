package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.MessageUnit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageUnitMapper {
    List<MessageUnit> findMessagesByUserId(Integer user_id);

    List<MessageUnit> findMessagesByOwnerId(Integer owner_id);

    int insertUserMessage(MessageUnit messageUnit);

    int insertOwnerMessage(MessageUnit messageUnit);
}
