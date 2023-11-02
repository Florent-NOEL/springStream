package SpringStream.restcontroller;

import SpringStream.service.StreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/stream/")
public class StreamingRestController {
    @Autowired
    private StreamService streamService;

    @GetMapping(value = "video/mp4/{title}", produces = "video/mp4")
    public Mono<Resource> getVideoMp4(@PathVariable String title){
        return streamService.getVideo(title);
    }

    @GetMapping(value = "video/webm/{title}", produces = "video/webm")
    public Mono<Resource> getVideoWebm(@PathVariable String title){
        return streamService.getVideo(title);
    }
}
