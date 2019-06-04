package com.pky.petclinic.commons.service;

import com.pky.petclinic.commons.domain.TbWatinglist;

public interface TbWatingListService extends BaseCrudService<TbWatinglist> {

    /**
     * 从诊断队列中修改等待状态
     * @param domain
     * @return
     */
    TbWatinglist saveToList(TbWatinglist domain);

    /**
     * 从开具处方中修改就诊状态
     * @param domain
     * @return
     */
    TbWatinglist saveToPre(TbWatinglist domain);

    /**
     * 从挂号中新增就诊队列
     * @param domain
     * @return
     */
    TbWatinglist saveToReg(TbWatinglist domain);
}
