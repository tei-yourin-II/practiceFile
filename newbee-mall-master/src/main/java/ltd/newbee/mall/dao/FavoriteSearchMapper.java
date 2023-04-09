package ltd.newbee.mall.dao;

import java.util.List;
import java.util.Map;
import ltd.newbee.mall.entity.FavoriteSearch;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FavoriteSearchMapper {

    List<FavoriteSearch> searchUserFavorite(Map<String, Object> paramMap);
}
