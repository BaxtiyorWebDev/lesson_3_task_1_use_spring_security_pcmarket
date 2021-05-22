package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.payload;

import lombok.Data;

import java.util.List;

@Data
public class PropertyDto {

    private List<Integer> propertiesId;
}
