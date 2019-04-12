package com.datatech.cloud.common.msg.auth;

import com.datatech.cloud.common.constant.RestCodeConstants;
import com.datatech.cloud.common.msg.BaseResponse;

/**
 * Created by ace on 2017/8/23.
 */
public class TokenErrorResponse extends BaseResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
