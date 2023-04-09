package ltd.newbee.mall.service;

import ltd.newbee.mall.entity.CategoryFilter;

import java.util.List;

public interface CategoryFilterService {
    List<CategoryFilter> findCategoriesByHotelIds(List<Integer> hotelIdList);
}
