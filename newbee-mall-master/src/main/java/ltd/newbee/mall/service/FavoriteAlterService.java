package ltd.newbee.mall.service;

import ltd.newbee.mall.entity.FavoriteAlter;

public interface FavoriteAlterService {
    FavoriteAlter findFavorite(FavoriteAlter favoriteAlter);

    int insertFavorite(FavoriteAlter favoriteAlter);

    int deleteFavorite(FavoriteAlter favoriteAlter);
}
