package org.example.mapstruct.case1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Case1VO {
    private String name;
    private String gender;
    private Integer status;
}
