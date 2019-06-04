package com.pky.petclinic.web.admin.controller;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.domain.TbWatinglist;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.service.TbWatingListService;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "v1/waiting")
public class TbWaitingController extends AbstractBaseController<TbWatinglist> {

    @Autowired
    TbWatingListService watingListService;

    @PostMapping(value = "")
    public AbstractBaseResult reg(TbWatinglist tbWatinglist){
        TbWatinglist watinglist = watingListService.saveToList(tbWatinglist);

        if(watinglist != null) {
            return success(request.getRequestURI(), watinglist);
        }

        return error("就诊失败！", null);
    }

    /**
     * 分页查询
     * @param num
     * @param size
     * @return
     */
    @GetMapping(value = "page/{num}/{size}")
    public AbstractBaseResult page(@PathVariable int num, @PathVariable int size){
        PageInfo<TbWatinglist> pageInfo = watingListService.page(null, num, size);

        return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
    }

}
