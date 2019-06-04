package com.pky.petclinic.commons.service;

import com.pky.petclinic.commons.domain.TbPrescription;

public interface TbPrescriptionService extends BaseCrudService<TbPrescription> {

    /**
     * 通过取药修改处方单的取药信息
     * @param domain 处方号
     * @return
     */
    public TbPrescription saveToOutput(TbPrescription domain);
}
