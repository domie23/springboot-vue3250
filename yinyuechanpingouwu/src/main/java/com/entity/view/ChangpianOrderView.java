package com.entity.view;

import com.entity.ChangpianOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("changpian_order")
public class ChangpianOrderView extends ChangpianOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String changpianOrderValue;
		/**
		* 支付类型的值
		*/
		private String changpianOrderPaymentValue;



		//级联表 address
			/**
			* 收货地址 的 创建用户
			*/
			private Integer addressYonghuId;
			/**
			* 收货人
			*/
			private String addressName;
			/**
			* 电话
			*/
			private String addressPhone;
			/**
			* 地址
			*/
			private String addressDizhi;
			/**
			* 是否默认地址
			*/
			private Integer isdefaultTypes;
				/**
				* 是否默认地址的值
				*/
				private String isdefaultValue;

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

	public ChangpianOrderView() {

	}

	public ChangpianOrderView(ChangpianOrderEntity changpianOrderEntity) {
		try {
			BeanUtils.copyProperties(this, changpianOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getChangpianOrderValue() {
				return changpianOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setChangpianOrderValue(String changpianOrderValue) {
				this.changpianOrderValue = changpianOrderValue;
			}
			/**
			* 获取： 支付类型的值
			*/
			public String getChangpianOrderPaymentValue() {
				return changpianOrderPaymentValue;
			}
			/**
			* 设置： 支付类型的值
			*/
			public void setChangpianOrderPaymentValue(String changpianOrderPaymentValue) {
				this.changpianOrderPaymentValue = changpianOrderPaymentValue;
			}




				//级联表的get和set address

					/**
					* 获取：收货地址 的 创建用户
					*/
					public Integer getAddressYonghuId() {
						return addressYonghuId;
					}
					/**
					* 设置：收货地址 的 创建用户
					*/
					public void setAddressYonghuId(Integer addressYonghuId) {
						this.addressYonghuId = addressYonghuId;
					}


					/**
					* 获取： 收货人
					*/
					public String getAddressName() {
						return addressName;
					}
					/**
					* 设置： 收货人
					*/
					public void setAddressName(String addressName) {
						this.addressName = addressName;
					}

					/**
					* 获取： 电话
					*/
					public String getAddressPhone() {
						return addressPhone;
					}
					/**
					* 设置： 电话
					*/
					public void setAddressPhone(String addressPhone) {
						this.addressPhone = addressPhone;
					}

					/**
					* 获取： 地址
					*/
					public String getAddressDizhi() {
						return addressDizhi;
					}
					/**
					* 设置： 地址
					*/
					public void setAddressDizhi(String addressDizhi) {
						this.addressDizhi = addressDizhi;
					}

					/**
					* 获取： 是否默认地址
					*/
					public Integer getIsdefaultTypes() {
						return isdefaultTypes;
					}
					/**
					* 设置： 是否默认地址
					*/
					public void setIsdefaultTypes(Integer isdefaultTypes) {
						this.isdefaultTypes = isdefaultTypes;
					}


						/**
						* 获取： 是否默认地址的值
						*/
						public String getIsdefaultValue() {
							return isdefaultValue;
						}
						/**
						* 设置： 是否默认地址的值
						*/
						public void setIsdefaultValue(String isdefaultValue) {
							this.isdefaultValue = isdefaultValue;
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
