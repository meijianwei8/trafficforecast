package com.huawei.genex.trafficforecast.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import java.nio.file.Paths;

@RestController
public class UploadController {

    @PostMapping("/uploadABC")
    public String uploadABC(MultipartFile[] files){
        try {
            for (MultipartFile file : files) {
                file.transferTo(Paths.get("G:\\test", file.getOriginalFilename()).toFile());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ABC";
    }
}
