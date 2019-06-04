package com.pky.petclinic.commons.service.impl;

import com.pky.petclinic.commons.domain.TbProject;
import com.pky.petclinic.commons.mapper.TbProjectMapper;
import com.pky.petclinic.commons.service.TbProjectService;
import org.springframework.stereotype.Service;

/**
 * 医院项目逻辑层
 */
@Service
public class TbProjectServiceImpl extends BaseCrudServiceImpl<TbProject, TbProjectMapper> implements TbProjectService {
}
