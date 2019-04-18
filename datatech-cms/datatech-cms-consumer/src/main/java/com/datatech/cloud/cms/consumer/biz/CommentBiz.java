package com.datatech.cloud.cms.consumer.biz;

import com.datatech.cloud.cms.entity.Comment;
import com.datatech.cloud.cms.mapper.CommentMapper;
import com.datatech.cloud.common.biz.BaseBiz;
import org.springframework.stereotype.Service;

/**
 * 评论表
 *
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Service
public class CommentBiz extends BaseBiz<CommentMapper,Comment> {
}