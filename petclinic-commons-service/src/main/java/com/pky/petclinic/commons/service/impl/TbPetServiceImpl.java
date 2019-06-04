package com.pky.petclinic.commons.service.impl;

import com.pky.petclinic.commons.domain.TbPet;
import com.pky.petclinic.commons.mapper.TbPetMapper;
import com.pky.petclinic.commons.service.TbPetService;
import org.springframework.stereotype.Service;

@Service
public class TbPetServiceImpl extends BaseCrudServiceImpl<TbPet, TbPetMapper> implements TbPetService {
}
