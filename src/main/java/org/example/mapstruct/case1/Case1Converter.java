package org.example.mapstruct.case1;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Arrays;

@Mapper(imports = {Case1Status.class, Arrays.class})
public interface Case1Converter {

    /**
     * <p>Mapping user view obj to domain.</p>
     *
     * @param vo user view obj
     * @return user domain
     */
    // So in this case, only expression field provide a perfect completion
    @Mapping(target = "sex", source = "gender")
    @Mapping(target = "user", source = "vo.name")
    @Mapping(target = "status", expression = "java(java.util.Arrays.stream(Case1Status.values()).filter(it -> it.getCode() == vo.getStatus()).findFirst().orElseThrow())")
    Case1Domain toDomain(final Case1VO vo);
}
