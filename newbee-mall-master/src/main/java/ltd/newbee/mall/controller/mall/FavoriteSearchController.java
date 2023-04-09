package ltd.newbee.mall.controller.mall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ltd.newbee.mall.entity.FavoriteSearch;
import ltd.newbee.mall.service.FavoriteSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FavoriteSearchController {

    @Autowired
    private FavoriteSearchService favoriteSearchService;

    @GetMapping("/searchFavorite")
    public ResponseEntity<List<FavoriteSearch>> searchUserFavorite(
            @RequestParam(value = "user_id", required = false) Integer user_id,
            @RequestParam(value = "title_name", required = false) String title_name,
            @RequestParam(value = "hotel_id", required = false) String hotel_id) {

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("user_id", user_id);
        paramMap.put("title_name", title_name);
        paramMap.put("hotel_id", hotel_id);

        List<FavoriteSearch> favoriteSearch = favoriteSearchService.searchUserFavorite(paramMap);
        if (favoriteSearch != null) {
            return ResponseEntity.ok(favoriteSearch);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
