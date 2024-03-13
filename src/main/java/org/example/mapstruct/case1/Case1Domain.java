package org.example.mapstruct.case1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Case1Domain {
    private String user;
    private String sex;
    private Case1Status status;
}
