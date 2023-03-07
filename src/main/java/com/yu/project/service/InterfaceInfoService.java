package com.yu.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yu.yuapicommon.model.entity.InterfaceInfo;

/**
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
