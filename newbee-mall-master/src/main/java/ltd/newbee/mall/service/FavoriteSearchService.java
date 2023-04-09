package ltd.newbee.mall.service;

import java.util.List;
import java.util.Map;
import ltd.newbee.mall.entity.FavoriteSearch;

public interface FavoriteSearchService {

    List<FavoriteSearch> searchUserFavorite(Map<String, Object> paramMap);
}
