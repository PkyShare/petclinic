package com.pky.petclinic.commons.service.impl;

import com.pky.petclinic.commons.domain.TbDrugs;
import com.pky.petclinic.commons.mapper.TbDrugsMapper;
import com.pky.petclinic.commons.service.TbDrugsService;
import org.springframework.stereotype.Service;

@Service
public class TbDrugsServiceImpl extends BaseCrudServiceImpl<TbDrugs, TbDrugsMapper> implements TbDrugsService {
}
