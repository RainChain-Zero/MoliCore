package com.rainchain.jasmine.component;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//统一返回工具类
public class ResultData<T> {
    @JSONField
    private boolean succ;
    @JSONField(ordinal = 1, name = "errMsg")
    private String errMsg;
    @JSONField(ordinal = 2)
    private T data;

    //成功时的返回
    public static <T> ResultData<T> success(T data) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setSucc(true);
        resultData.setErrMsg(null);
        resultData.setData(data);
        return resultData;
    }

    //不成功的返回
    public static <T> ResultData<T> fail(String errMsg) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setSucc(false);
        resultData.setErrMsg(errMsg);
        return resultData;
    }

}
