package cn.mirrorming.learning.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 返回数据对象
 *
 * @author Mireal Chan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R<T> {
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回码
     */
    private int statusCode;
    /**
     * 返回数据
     */
    private T content;

    private R(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public static <T> R<T> succeed() {
        return new R<>(CommonCode.SUCCESS.getMessage(), CommonCode.SUCCESS.getCode());
    }

    public static <T> R<T> succeed(T content) {
        return new R<>(CommonCode.SUCCESS.getMessage(), CommonCode.SUCCESS.getCode(), content);
    }

    public static <T> R<T> fail(String message) {
        return new R<>(message, 400, null);
    }

    @Getter
    @AllArgsConstructor
    enum CommonCode {
        // 成功
        SUCCESS("success", 200),
        // 系统错误
        SEVER_ERROR("systemFault", 500);
        private String message;
        private int code;
    }
}
