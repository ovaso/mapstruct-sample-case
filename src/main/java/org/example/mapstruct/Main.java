package org.example.mapstruct;

import org.example.mapstruct.case1.Case1Converter;
import org.example.mapstruct.case1.Case1Domain;
import org.example.mapstruct.case1.Case1VO;
import org.example.mapstruct.case2.Case2Converter;
import org.example.mapstruct.case2.Case2Domain;
import org.example.mapstruct.case2.Case2VO;
import org.mapstruct.factory.Mappers;

public class Main {
    public static void main(String[] args) {
        // case 1
        Case1Converter instance1 = Mappers.getMapper(Case1Converter.class);
        Case1VO case1VO = new Case1VO();
        case1VO.setName("case 1 with lombok setter/getter");
        case1VO.setGender("male");
        case1VO.setStatus(0);
        Case1Domain case1Domain = instance1.toDomain(case1VO);
        System.out.println(case1Domain);

        // case 2
        Case2Converter instance2 = Mappers.getMapper(Case2Converter.class);
        Case2VO case2VO = new Case2VO();
        case2VO.setName("case 2 with getter/setter code");
        case2VO.setGender("male");
        case2VO.setStatus(1);
        Case2Domain case2Domain = instance2.toDomain(case2VO);
        System.out.println(case2Domain);
    }
}