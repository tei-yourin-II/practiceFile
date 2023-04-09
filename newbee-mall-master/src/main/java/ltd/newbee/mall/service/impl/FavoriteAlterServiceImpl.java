package ltd.newbee.mall.service.impl;

import ltd.newbee.mall.dao.FavoriteAlterMapper;
import ltd.newbee.mall.entity.FavoriteAlter;
import ltd.newbee.mall.service.FavoriteAlterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteAlterServiceImpl implements FavoriteAlterService {

    @Autowired
    private FavoriteAlterMapper favoriteAlterMapper;

    @Override
    public FavoriteAlter findFavorite(FavoriteAlter favoriteAlter) {
        return favoriteAlterMapper.findFavorite(favoriteAlter);
    }

    @Override
    public int insertFavorite(FavoriteAlter favoriteAlter) {
        return favoriteAlterMapper.insertFavorite(favoriteAlter);
    }

    @Override
    public int deleteFavorite(FavoriteAlter favoriteAlter) {
        return favoriteAlterMapper.deleteFavorite(favoriteAlter);
    }
}
