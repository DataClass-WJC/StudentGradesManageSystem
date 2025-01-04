package cn.lanqiao.studentgradesmanagesystem.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentLoginDTO {
    private String stuName;
    private String stuPass;
}