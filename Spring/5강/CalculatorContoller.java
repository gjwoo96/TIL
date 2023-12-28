package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.calculatorAddRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //해당 클래스를 API의 진입지점으로 설정
public class CalculatorContoller {

    @GetMapping("/add") // HTTP Method는 GET, HTTP path는 /add이다.
    public int addToNumbers(calculatorAddRequest request){

        //tip 원하는 라인 포커스: 해당라인 마우스 ctrl + w
        //미사용 import 정리는 ctrl + alt + o
        return request.getNumber1() + request.getNumber2();
    }

}
