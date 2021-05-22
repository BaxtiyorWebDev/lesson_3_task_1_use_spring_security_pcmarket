package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.payload.Result;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.service.AttachmentService;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {
    @Autowired
    AttachmentService attachmentService;

    @PostMapping("/uploadSystem")
    public ResponseEntity<Result> uploadFileToFileSystem(MultipartHttpServletRequest request) throws IOException {
        Result result = attachmentService.uploadFileToFileSystem(request);
        return ResponseEntity.status(result.isSuccess()? HttpStatus.CREATED:HttpStatus.CONFLICT).body(result);
    }

    @GetMapping("/getFileFromSystem/{id}")
    public void getFileFromSystem(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        attachmentService.getFileFromSystem(id,response);
    }
}
