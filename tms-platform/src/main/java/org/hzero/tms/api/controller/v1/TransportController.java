package org.hzero.tms.api.controller.v1;

import io.choerodon.core.domain.Page;
import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.mybatis.pagehelper.annotation.SortDefault;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import io.choerodon.mybatis.pagehelper.domain.Sort;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.hzero.boot.platform.lov.adapter.LovAdapter;
import org.hzero.boot.platform.lov.dto.LovValueDTO;
import org.hzero.core.base.BaseController;
import org.hzero.core.util.Results;
import org.hzero.mybatis.helper.SecurityTokenHelper;
import org.hzero.tms.config.SwaggerTags;
import org.hzero.tms.domain.entity.Transport;
import org.hzero.tms.domain.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * 运输管理 管理 API
 *
 */
@Api(tags = SwaggerTags.TRANSPORTS)
@RestController("transportController.v1")
@RequestMapping("/v1/{organizationId}/transports")
public class TransportController extends BaseController {

    @Autowired
    private TransportRepository transportRepository;
    
    @Autowired
    private LovAdapter lov;

    @ApiOperation(value = "运输管理列表")
    @Permission(level = ResourceLevel.SITE, permissionPublic = true)
    @GetMapping
    public ResponseEntity<Page<Transport>> list(Transport transport, @ApiIgnore @SortDefault(value = Transport.FIELD_ID,
            direction = Sort.Direction.DESC) PageRequest pageRequest,
                                                @ApiParam(value = "租户ID", required = true) @PathVariable Long organizationId) { 
        Page<Transport> list = transportRepository.pageAndSort(pageRequest, transport);
        return Results.success(list);
    }

    @ApiOperation(value = "运输管理明细")
    @Permission(level = ResourceLevel.SITE, permissionPublic = true)
    @GetMapping("/{id}")
    public ResponseEntity<Transport> detail(@PathVariable Long id,
                                            @ApiParam(value = "租户ID", required = true) @PathVariable Long organizationId) {
        Transport transport = transportRepository.selectByPrimaryKey(id);
        return Results.success(transport);
    }

    @ApiOperation(value = "创建运输管理")
    @Permission(level = ResourceLevel.SITE, permissionPublic = true)
    @PostMapping
    public ResponseEntity<Transport> create(@RequestBody Transport transport,
                                            @ApiParam(value = "租户ID", required = true) @PathVariable Long organizationId) {
        validObject(transport);
        transportRepository.insertSelective(transport);
        return Results.success(transport);
    }

    @ApiOperation(value = "修改运输管理")
    @Permission(level = ResourceLevel.SITE, permissionPublic = true)
    @PutMapping
    public ResponseEntity<Transport> update(@RequestBody Transport transport,
                                            @ApiParam(value = "租户ID", required = true) @PathVariable Long organizationId) {
        SecurityTokenHelper.validToken(transport);
        transportRepository.updateByPrimaryKeySelective(transport);
        return Results.success(transport);
    }

    @ApiOperation(value = "删除运输管理")
    @Permission(level = ResourceLevel.SITE, permissionPublic = true)
    @DeleteMapping
    public ResponseEntity<?> remove(@RequestBody Transport transport,
                                    @ApiParam(value = "租户ID", required = true) @PathVariable Long organizationId) {
        SecurityTokenHelper.validToken(transport);
        transportRepository.deleteByPrimaryKey(transport);
        return Results.success();
    }

    @ApiOperation(value = "获取独立值集")
    @Permission(level = ResourceLevel.SITE, permissionPublic = true)
    @GetMapping("/queryLovValue")
    public ResponseEntity<Page<LovValueDTO>> queryLovValue(@PathVariable String lovValue,
                                            @ApiParam(value = "租户ID", required = true) @PathVariable Long organizationId) {
        List<LovValueDTO> lovList =  lov.queryLovValue(lovValue, organizationId);
        Page<LovValueDTO> lovPage = new Page<LovValueDTO>();
        lovPage.setContent(lovList);
        return Results.success(lovPage);
    }

}
