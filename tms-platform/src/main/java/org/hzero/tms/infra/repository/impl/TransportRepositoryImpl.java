package org.hzero.tms.infra.repository.impl;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.PageHelper;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.hzero.tms.domain.entity.Transport;
import org.hzero.tms.domain.repository.TransportRepository;
import org.hzero.tms.infra.mapper.TransportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 运输管理 资源库实现
 *
 */
@Component
public class TransportRepositoryImpl extends BaseRepositoryImpl<Transport> implements TransportRepository {

    @Autowired
    private TransportMapper transportMapper;

    @Override
    public Page<Transport> queryTransportData(PageRequest pageRequest, Transport tran) {
        return PageHelper.doPageAndSort(pageRequest, () -> {
            return transportMapper.queryTransportData(tran);
        });
    }
}
