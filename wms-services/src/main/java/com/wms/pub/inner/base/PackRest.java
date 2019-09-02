package com.wms.pub.inner.base;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.wms.common.core.controller.BaseController;
import com.wms.common.core.domain.request.AjaxRequest;
import com.wms.common.core.domain.request.PageRequest;
import com.wms.common.core.domain.response.AjaxResult;
import com.wms.common.core.domain.response.PageResult;
import com.wms.entity.auto.OwnerTEntity;
import com.wms.entity.auto.PackTEntity;
import com.wms.services.base.IPackService;

@RestController
@RequestMapping("/services/inner/base/pack")
public class PackRest extends BaseController{
	
	@Autowired
	IPackService packService;
	
	@RequestMapping(value = "/find")
	public PageResult<PackTEntity> find(@RequestBody String req) {
		List<PackTEntity> list = null;
		try {
			PageRequest pageRequest = pageRequest(req);
			//下拉搜索框
			if (pageRequest.containsKey(PRO_Q)) {
				pageRequest.put(PackTEntity.Column.packCode.getJavaProperty(), pageRequest.getString(PRO_Q).toUpperCase().concat("*"));
				pageRequest.remove(PackTEntity.Column.packId.getJavaProperty());
			}
			PageHelper.startPage(pageRequest.getPageStart(), pageRequest.getPageSize());
			list = packService.find(pageRequest);
			if (CollectionUtils.isEmpty(list))
				list = Lists.newArrayList();
		} catch (Exception e) {
			return pageFail(e.getMessage());
		}
		return page(list);
	}
	
	@RequestMapping(value = "/findById")
	public AjaxResult<PackTEntity> findById(@RequestBody String req) {
		PackTEntity returnPack = null;
		try {
			AjaxRequest<Long> request = ajaxRequest(req, new TypeReference<AjaxRequest<Long>>() {});
			PackTEntity pack = 
					PackTEntity.builder()
			.warehouseId(request.getWarehouseId())
			.companyId(request.getCompanyId())
			.packId(request.getData()).build();
			returnPack = packService.find(pack);
		} catch (Exception e) {
			e.printStackTrace();
			return fail(e.getMessage());
		}
		return success(returnPack);
	}
	
	@RequestMapping(value = "/save")
	public AjaxResult save(@RequestBody String req) {
		try {
			AjaxRequest<List<PackTEntity>> request = ajaxRequest(req, new TypeReference<AjaxRequest<List<PackTEntity>>>() {});
			if (CollectionUtils.isEmpty(request.getData())) {
				return fail("no record update.");
			}
			boolean flag = packService.modify(request);
			if (flag) {
				return success();
			}
		} catch (Exception e) {
			return fail(e.getMessage());
		}
		return fail();
	}
	
	@RequestMapping(value = "/delete")
	public AjaxResult delete(@RequestBody String req) {
		try {
			AjaxRequest<List<PackTEntity>> request = ajaxRequest(req, new TypeReference<AjaxRequest<List<PackTEntity>>>() {});
			if (CollectionUtils.isEmpty(request.getData())) {
				return fail("no record update.");
			}
			boolean flag = packService.delete(request);
			if (flag) {
				return success();
			}
		} catch (Exception e) {
			return fail(e.getMessage());
		}
		return fail();
	}
	
	@RequestMapping(value = "/add")
	public AjaxResult add(@RequestBody String req) {
		try {
			AjaxRequest<PackTEntity> request = ajaxRequest(req, new TypeReference<AjaxRequest<PackTEntity>>() {});
			List<PackTEntity> updateList = Lists.newArrayList(request.getData());
			boolean flag = packService.add(ajaxRequest(updateList, request));
			if (flag) {
				return success();
			}
		} catch (Exception e) {
			return fail(e.getMessage());
		}
		return fail();
	}

}
