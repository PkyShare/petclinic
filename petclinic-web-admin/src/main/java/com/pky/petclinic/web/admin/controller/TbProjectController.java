package com.pky.petclinic.web.admin.controller;

import com.github.pagehelper.PageInfo;
import com.pky.petclinic.commons.domain.TbProject;
import com.pky.petclinic.commons.dto.AbstractBaseResult;
import com.pky.petclinic.commons.service.TbProjectService;
import com.pky.petclinic.commons.utils.BeanValidator;
import com.pky.petclinic.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/items")
@CrossOrigin
public class TbProjectController extends AbstractBaseController<TbProject> {

    @Autowired
    private TbProjectService projectService;

    /**
     * 保存医院项目
     * @param tbProject
     * @return
     */
    @PostMapping(value = "")
    public AbstractBaseResult save(TbProject tbProject){
        //数据校验
        String message = BeanValidator.validator(tbProject);
        if(StringUtils.isNotBlank(message)) {
            return error(message, null);
        }

        //校验项目名是否重复
        if(!projectService.unique("projectName", tbProject.getProjectName())){
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return error("项目名称重复,请重试", null);
        }

        //保存项目
        TbProject project = projectService.save(tbProject);
        if(project != null){
            response.setStatus(HttpStatus.CREATED.value());
            return success(request.getRequestURI(),project);
        }

        return error("保存失败，请重试", null);
    }

    /**
     * 分页查询
     * @param num
     * @param size
     * @return
     */
    @GetMapping(value = "page/{num}/{size}")
    public AbstractBaseResult page(@PathVariable int num, @PathVariable int size){
        PageInfo<TbProject> pageInfo = projectService.page(null, num, size);

        return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
    }

    /**
     * 单个删除
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public AbstractBaseResult delete(@PathVariable Long id){
        boolean result = projectService.delete(id);

        //删除成功
        if(result){
            return success(request.getRequestURI());
        }
        //删除失败
        return error("删除失败，请重试",null);
    }
}
