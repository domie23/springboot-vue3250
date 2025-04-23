package com.dao;

import com.entity.ChangpianCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangpianCollectionView;

/**
 * 商品收藏 Dao 接口
 *
 * @author 
 */
public interface ChangpianCollectionDao extends BaseMapper<ChangpianCollectionEntity> {

   List<ChangpianCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
