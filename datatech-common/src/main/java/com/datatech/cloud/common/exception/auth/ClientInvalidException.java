package com.datatech.cloud.common.exception.auth;


import com.datatech.cloud.common.constant.CommonConstants;
import com.datatech.cloud.common.exception.BaseException;

/**
 * Created by ace on 2017/9/10.
 */
public class ClientInvalidException extends BaseException {
    public ClientInvalidException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
