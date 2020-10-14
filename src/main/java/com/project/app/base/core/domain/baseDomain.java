package com.project.app.base.core.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.Value;

import java.sql.Timestamp;
import java.time.ZonedDateTime;

/**
 * @author dongliang.li@hand-china.com
 * @description baseDomain
 * @date 2020/6/27 19:30
 */
@Data
public class baseDomain {
    @TableId
    @TableField(value = "id")
    private Long Id;

    @TableField(value = "creation_date")
    private Timestamp creationDate;

    @TableField(value = "created_by")
    private Long createdBy;

    @TableField(value = "last_update_date")
    private Timestamp lastUpdateDate;

    @TableField(value = "last_update_by")
    private Long lastUpdateBy;
}