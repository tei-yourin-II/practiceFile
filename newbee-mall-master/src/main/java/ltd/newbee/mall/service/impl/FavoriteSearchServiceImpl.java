package ltd.newbee.mall.service.impl;

import java.util.List;
import java.util.Map;
import ltd.newbee.mall.dao.FavoriteSearchMapper;
import ltd.newbee.mall.entity.FavoriteSearch;
import ltd.newbee.mall.service.FavoriteSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteSearchServiceImpl implements FavoriteSearchService {

    @Autowired
    private FavoriteSearchMapper favoriteSearchMapper;

    @Override
    public List<FavoriteSearch> searchUserFavorite(Map<String, Object> paramMap) {
        return favoriteSearchMapper.searchUserFavorite(paramMap);
    }
}
