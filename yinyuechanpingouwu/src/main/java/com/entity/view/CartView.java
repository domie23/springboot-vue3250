package com.entity.view;

import com.entity.CartEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 购物车
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("cart")
public class CartView extends CartEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 changpian
			/**
			* 商品名称
			*/
			private String changpianName;
			/**
			* 商品照片
			*/
			private String changpianPhoto;
			/**
			* 歌曲试听
			*/
			private String changpianMusic;
			/**
			* 商品类型
			*/
			private Integer changpianTypes;
				/**
				* 商品类型的值
				*/
				private String changpianValue;
			/**
			* 商品库存
			*/
			private Integer changpianKucunNumber;
			/**
			* 商品原价
			*/
			private Double changpianOldMoney;
			/**
			* 现价
			*/
			private Double changpianNewMoney;
			/**
			* 点击次数
			*/
			private Integer changpianClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer changpianDelete;
			/**
			* 商品简介
			*/
			private String changpianContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public CartView() {

	}

	public CartView(CartEntity cartEntity) {
		try {
			BeanUtils.copyProperties(this, cartEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}














				//级联表的get和set changpian

					/**
					* 获取： 商品名称
					*/
					public String getChangpianName() {
						return changpianName;
					}
					/**
					* 设置： 商品名称
					*/
					public void setChangpianName(String changpianName) {
						this.changpianName = changpianName;
					}

					/**
					* 获取： 商品照片
					*/
					public String getChangpianPhoto() {
						return changpianPhoto;
					}
					/**
					* 设置： 商品照片
					*/
					public void setChangpianPhoto(String changpianPhoto) {
						this.changpianPhoto = changpianPhoto;
					}

					/**
					* 获取： 歌曲试听
					*/
					public String getChangpianMusic() {
						return changpianMusic;
					}
					/**
					* 设置： 歌曲试听
					*/
					public void setChangpianMusic(String changpianMusic) {
						this.changpianMusic = changpianMusic;
					}

					/**
					* 获取： 商品类型
					*/
					public Integer getChangpianTypes() {
						return changpianTypes;
					}
					/**
					* 设置： 商品类型
					*/
					public void setChangpianTypes(Integer changpianTypes) {
						this.changpianTypes = changpianTypes;
					}


						/**
						* 获取： 商品类型的值
						*/
						public String getChangpianValue() {
							return changpianValue;
						}
						/**
						* 设置： 商品类型的值
						*/
						public void setChangpianValue(String changpianValue) {
							this.changpianValue = changpianValue;
						}

					/**
					* 获取： 商品库存
					*/
					public Integer getChangpianKucunNumber() {
						return changpianKucunNumber;
					}
					/**
					* 设置： 商品库存
					*/
					public void setChangpianKucunNumber(Integer changpianKucunNumber) {
						this.changpianKucunNumber = changpianKucunNumber;
					}

					/**
					* 获取： 商品原价
					*/
					public Double getChangpianOldMoney() {
						return changpianOldMoney;
					}
					/**
					* 设置： 商品原价
					*/
					public void setChangpianOldMoney(Double changpianOldMoney) {
						this.changpianOldMoney = changpianOldMoney;
					}

					/**
					* 获取： 现价
					*/
					public Double getChangpianNewMoney() {
						return changpianNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setChangpianNewMoney(Double changpianNewMoney) {
						this.changpianNewMoney = changpianNewMoney;
					}

					/**
					* 获取： 点击次数
					*/
					public Integer getChangpianClicknum() {
						return changpianClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setChangpianClicknum(Integer changpianClicknum) {
						this.changpianClicknum = changpianClicknum;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getChangpianDelete() {
						return changpianDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setChangpianDelete(Integer changpianDelete) {
						this.changpianDelete = changpianDelete;
					}

					/**
					* 获取： 商品简介
					*/
					public String getChangpianContent() {
						return changpianContent;
					}
					/**
					* 设置： 商品简介
					*/
					public void setChangpianContent(String changpianContent) {
						this.changpianContent = changpianContent;
					}




















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}




}
