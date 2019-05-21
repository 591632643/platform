package org.hzero.tms.domain.repository;

import io.choerodon.core.domain.Page;
import org.hzero.mybatis.base.BaseRepository;
import org.hzero.tms.domain.entity.Transport;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
/**
 * 运输管理资源库
 *
 */
public interface TransportRepository extends BaseRepository<Transport> {
    Page<Transport> queryTransportData(PageRequest pageRequest,Transport tran);// 获取独立值集
}
