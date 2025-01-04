package cn.lanqiao.studentgradesmanagesystem.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherLoginDTO {
    private String teaName;
    private String teaPass;
}

