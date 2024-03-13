package org.example.mapstruct.case2;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Arrays;

@Mapper(
        imports = {Case2Status.class, Arrays.class}
)
public interface Case2Converter {

    /**
     * <p>Mapping user view obj to domain.</p>
     *
     * @param vo user view obj
     * @return user domain
     */
    // Even if using original getter/setter, autocomplete still not work, and still work in expression field
    @Mapping(target = "sex", source = "gender")
    @Mapping(target = "user", source = "vo.name")
    @Mapping(target = "status", expression = "java(Arrays.stream(Case2Status.values()).filter(it -> it.getCode() == vo.getStatus()).findFirst().orElseThrow())")
    Case2Domain toDomain(final Case2VO vo);
}
