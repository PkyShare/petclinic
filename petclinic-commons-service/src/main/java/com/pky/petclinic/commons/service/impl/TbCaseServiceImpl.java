package com.pky.petclinic.commons.service.impl;

import com.pky.petclinic.commons.domain.TbCase;
import com.pky.petclinic.commons.mapper.TbCaseMapper;
import com.pky.petclinic.commons.service.TbCaseService;
import org.springframework.stereotype.Service;

@Service
public class TbCaseServiceImpl extends BaseCrudServiceImpl<TbCase, TbCaseMapper> implements TbCaseService {
}
