package com.huawei.genex.trafficforecast.controller;

import com.huawei.genex.common.annotation.MethodLog;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBodyReturnValueHandler;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class DownLoadController {
//    @PostMapping("/downloadReport")
    @GetMapping("/downloadReport")
    public StreamingResponseBody downloadReport(){
        Path path = Paths.get("G:\\test");

        try {
            Path path1 = Files.list(path).findFirst().get();
            byte[] bytes = Files.readAllBytes(path1);
            return outputStream -> {
                outputStream.write(bytes);
                outputStream.close();
            };
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    @MethodLog
    @GetMapping("/downloadReport2")
    public ResponseEntity<byte[]> downloadReport2(){
        Path path = Paths.get("G:\\test");
        try {
            Path path1 = Files.list(path).findFirst().get();
            byte[] bytes = Files.readAllBytes(path1);
            HttpHeaders httpHeader = new HttpHeaders();
            httpHeader.add(HttpHeaders.CONTENT_DISPOSITION,
                    "attachment;filename="+path1.getFileName());
            return new ResponseEntity<>(bytes, httpHeader,HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
        }
       return null;
    }
}
