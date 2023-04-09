package ltd.newbee.mall.controller.mall;

import ltd.newbee.mall.entity.MessageUnit;
import ltd.newbee.mall.service.MessageUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageUnitController {

    @Autowired
    private MessageUnitService messageUnitService;

    @GetMapping("/findByUserId")
    public List<MessageUnit> findMessagesByUserId(@RequestParam Integer user_id) {
        return messageUnitService.findMessagesByUserId(user_id);
    }

    @GetMapping("/findByOwnerId")
    public List<MessageUnit> findMessagesByOwnerId(@RequestParam Integer owner_id) {
        return messageUnitService.findMessagesByOwnerId(owner_id);
    }

    @PostMapping("/insertUserMessage")
    public String insertUserMessage(@RequestBody MessageUnit messageUnit) {
        int result = messageUnitService.insertUserMessage(messageUnit);
        if (result > 0) {
            return "User message insert successful";
        } else {
            return "User message insert failed";
        }
    }

    @PostMapping("/insertOwnerMessage")
    public String insertOwnerMessage(@RequestBody MessageUnit messageUnit) {
        int result = messageUnitService.insertOwnerMessage(messageUnit);
        if (result > 0) {
            return "Owner message insert successful";
        } else {
            return "Owner message insert failed";
        }
    }
}
