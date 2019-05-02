package info.sandroalmeida.springrecipeapp.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by sandro on 02/05/19
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);

}
