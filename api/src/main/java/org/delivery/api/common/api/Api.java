package org.delivery.api.common.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

@Data
@NoArgsConstructor
@AllArgsConstructor
// Api 클래스는 API 응답을 감싸는 제네릭 클래스
public class Api<T> {

    // 응답 결과를 나타내는 Result 객체
    private Result result;

    // 응답 바디를 나타내는 제네릭 타입
    @Valid
    private T body;

    // OK 메서드 생성하는 정적 메서드
    public static <T> Api<T> OK(T data){
        var api = new Api<T>();
        api.result = Result.OK(); // 성공 결과 설정
        api.body = data; // 응답 데이터 설정
        return api;
    }
}
