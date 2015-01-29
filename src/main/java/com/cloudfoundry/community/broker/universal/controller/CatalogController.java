package com.cloudfoundry.community.broker.universal.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.cloudfoundry.community.broker.universal.service.*;

@RestController
public class CatalogController extends BaseController {

	public static final String BASE_PATH = "/v2/catalog";
			
	public CatalogController() throws Exception {
		super();
		catalogService = CatalogServiceFactory.getInstance(serviceType);
	}

	@RequestMapping(value = BASE_PATH, method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getCatalog() {
		return catalogService.getCatalog();
	}
}
