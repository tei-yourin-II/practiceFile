package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.CategoryFilter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryFilterMapper {
    List<CategoryFilter> findCategoriesByHotelIds(@Param("hotelIdList") List<Integer> hotelIdList);
}
