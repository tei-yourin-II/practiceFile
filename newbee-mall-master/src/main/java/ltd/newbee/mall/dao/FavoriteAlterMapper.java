package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.FavoriteAlter;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FavoriteAlterMapper {
    FavoriteAlter findFavorite(FavoriteAlter favoriteAlter);

    int insertFavorite(FavoriteAlter favoriteAlter);

    int deleteFavorite(FavoriteAlter favoriteAlter);
}
