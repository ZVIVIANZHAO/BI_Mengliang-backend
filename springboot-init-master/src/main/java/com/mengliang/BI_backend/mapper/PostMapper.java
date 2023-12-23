package com.mengliang.BI_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mengliang.BI_backend.model.entity.Post;
import java.util.Date;
import java.util.List;

/**
 * 帖子数据库操作
 *
 * @author <a href="https://github.com/wuguang434/BI_Mengliang_backend">猛良</a>
 */
public interface PostMapper extends BaseMapper<Post> {

    /**
     * 查询帖子列表（包括已被删除的数据）
     */
    List<Post> listPostWithDelete(Date minUpdateTime);

}




