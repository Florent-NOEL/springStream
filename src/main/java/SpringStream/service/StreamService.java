package SpringStream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StreamService {
    @Autowired
    private ResourceLoader resourceLoader;
    private static final String File_PATH = "file:C:/Users/flnoel/Desktop/Test Developpement/%s";
//le title doit être dans le format suivant Title.mp4 Title.webm
    public Mono<Resource> getVideo(String title){
        return  Mono.fromSupplier(()-> resourceLoader.getResource(String.format(File_PATH, title)));
    }
}
