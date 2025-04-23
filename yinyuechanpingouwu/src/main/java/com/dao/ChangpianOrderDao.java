package com.dao;

import com.entity.ChangpianOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangpianOrderView;

/**
 * 商品订单 Dao 接口
 *
 * @author 
 */
public interface ChangpianOrderDao extends BaseMapper<ChangpianOrderEntity> {

   List<ChangpianOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
