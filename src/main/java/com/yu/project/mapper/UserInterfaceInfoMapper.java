package com.yu.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yu.yuapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @Entity com.yu.project.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




