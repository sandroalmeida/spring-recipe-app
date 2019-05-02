package info.sandroalmeida.springrecipeapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by sandro on 02/05/19
 */
@Slf4j
@Service
public class ImageServiceImpl implements ImageService {

    @Override
    public void saveImageFile(Long recipeId, MultipartFile file) {
        log.debug("Received a file");
    }
}
