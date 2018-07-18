package com.huawei.genex.trafficforecast.controller;

import com.huawei.genex.trafficforecast.domain.LteTask;
import com.huawei.genex.trafficforecast.repository.LteTaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class LteTaskController {

    private final LteTaskRepository lteTaskRepository;

    @Autowired
    public LteTaskController(LteTaskRepository lteTaskRepository) {
        this.lteTaskRepository = lteTaskRepository;
    }

    @PostMapping("/saveOne")
    public Mono<LteTask> saveOne(LteTask lteTask){
        log.info("lteTask:",lteTask.toString());
        LteTask save = lteTaskRepository.save(lteTask);
        return Mono.just(save);
    }
    @GetMapping("/fuck")
    public void fuck(){
        log.info("fuck ,wtf");
    }
}
