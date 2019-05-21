package org.hzero.tms.infra.mapper;

import io.choerodon.mybatis.common.BaseMapper;
import org.hzero.tms.domain.entity.Transport;

import java.util.List;

/**
 * 运输管理Mapper
 *
 */
public interface TransportMapper extends BaseMapper<Transport> {

    List<Transport> queryTransportData(Transport tran);
}
