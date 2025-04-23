package com.dao;

import com.entity.ChangpianCommentbackEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangpianCommentbackView;

/**
 * 商品评价 Dao 接口
 *
 * @author 
 */
public interface ChangpianCommentbackDao extends BaseMapper<ChangpianCommentbackEntity> {

   List<ChangpianCommentbackView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
