package ltd.newbee.mall.controller.mall;

import ltd.newbee.mall.entity.FavoriteAlter;
import ltd.newbee.mall.service.FavoriteAlterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/favorite")
public class FavoriteAlterController {

    @Autowired
    private FavoriteAlterService favoriteAlterService;

    @PostMapping("/FavoriteAlter")
    public String alterFavorite(@RequestBody FavoriteAlter favoriteAlter) {
        FavoriteAlter existingFavorite = favoriteAlterService.findFavorite(favoriteAlter);

        if (existingFavorite != null) {
            int result = favoriteAlterService.deleteFavorite(favoriteAlter);
            if (result > 0) {
                return "Delete successful";
            } else {
                return "Delete failed";
            }
        } else {
            int result = favoriteAlterService.insertFavorite(favoriteAlter);
            if (result > 0) {
                return "Insert successful";
            } else {
                return "Insert failed";
            }
        }
    }
}
