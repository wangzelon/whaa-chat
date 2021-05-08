package com.whaa.blog.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * created by wangzelong 2021-05-08 15:08
 */
@Data
public class User extends Model<User> {
    @TableId
    private Long id;
}
