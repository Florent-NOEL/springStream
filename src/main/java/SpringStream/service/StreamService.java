package SpringStream.service;

import SpringStream.models.UrlList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StreamService {
    @Autowired
    private ResourceLoader resourceLoader;
    private static final String File_PATH = UrlList.getUrlVideoFile() +"/%s";
    private static final String File_Img = UrlList.getUrlImageFile() +"/%s";
//le title doit être dans le format suivant Title.mp4 Title.webm
    public Mono<Resource> getVideo(String title){
        return  Mono.fromSupplier(()-> resourceLoader.getResource(String.format(File_PATH, title)));
    }

    public Mono<Resource> getImage(String title){
        return  Mono.fromSupplier(()-> resourceLoader.getResource(String.format(File_Img, title+"_Image.png")));
    }
}
