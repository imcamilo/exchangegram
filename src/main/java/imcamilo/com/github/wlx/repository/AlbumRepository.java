package imcamilo.com.github.wlx.repository;

import imcamilo.com.github.wlx.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Camilo Jorquera on 3/13/19
 */
public interface AlbumRepository extends MongoRepository<Album, String> {

    List<Album> findAllByUserId(Integer id);

}