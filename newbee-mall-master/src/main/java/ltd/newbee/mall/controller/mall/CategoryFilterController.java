package ltd.newbee.mall.controller.mall;

import ltd.newbee.mall.entity.CategoryFilter;
import ltd.newbee.mall.service.CategoryFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/category")
public class CategoryFilterController {

    @Autowired
    private CategoryFilterService categoryFilterService;

    @PostMapping("/filter")
    public List<CategoryFilter> findCategoriesByHotelIds(@RequestBody Map<String, List<Integer>> request) {
        List<Integer> hotelIdList = request.get("hotelIdList");
        return categoryFilterService.findCategoriesByHotelIds(hotelIdList);
    }
}
