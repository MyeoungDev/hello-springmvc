package hello.springmvc.basic;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j  // Lombok으로 log 편하게 사용
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";


        // 올바른 로그의 사용 방법 -> 로그 사용할 떄는 "print log" + name 이런거 금지, 아래 방법 처럼
        log.trace("trace log ={}", name);
        log.debug("debug log ={}", name);
        log.info("info log ={}", name);
        log.warn("warn log ={}", name);
        log.error("error log = {}", name);
        return "ok";
    }


}
