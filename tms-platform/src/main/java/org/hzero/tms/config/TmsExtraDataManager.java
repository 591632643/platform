package org.hzero.tms.config;

import io.choerodon.core.swagger.ChoerodonRouteData;
import io.choerodon.swagger.swagger.extra.ExtraData;
import io.choerodon.swagger.swagger.extra.ExtraDataManager;

/**
 * description
 *
 * @author Edward 2019/05/13 09:33
 */
public class TmsExtraDataManager implements ExtraDataManager {
    @Override
    public ExtraData getData() {
        ChoerodonRouteData choerodonRouteData = new ChoerodonRouteData();
        choerodonRouteData.setName("tpfm");
        choerodonRouteData.setPath("/tpfm/**");
        choerodonRouteData.setServiceId("tms-platform");
        extraData.put(ExtraData.ZUUL_ROUTE_DATA, choerodonRouteData);
        return extraData;
    }
}