package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.CategoryFilterMapper;
import ltd.newbee.mall.entity.CategoryFilter;
import ltd.newbee.mall.service.CategoryFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryFilterServiceImpl implements CategoryFilterService {

    @Autowired
    private CategoryFilterMapper categoryFilterMapper;

    @Override
    public List<CategoryFilter> findCategoriesByHotelIds(List<Integer> hotelIdList) {
        return categoryFilterMapper.findCategoriesByHotelIds(hotelIdList);
    }
}
