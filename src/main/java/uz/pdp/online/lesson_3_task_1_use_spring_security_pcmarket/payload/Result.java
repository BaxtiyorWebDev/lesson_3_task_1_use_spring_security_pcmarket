package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private String message;

    private boolean success;
}
