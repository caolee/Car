package cn.caoler.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCar<M extends BaseCar<M>> extends Model<M> implements IBean {

	public void setClass(java.lang.String _class) {
		set("class", _class);
	}

	public java.lang.String getClass() {
		return get("class");
	}

	public void setPrice(java.lang.Integer price) {
		set("price", price);
	}

	public java.lang.Integer getPrice() {
		return get("price");
	}

	public void setMax(java.lang.Integer max) {
		set("max", max);
	}

	public java.lang.Integer getMax() {
		return get("max");
	}

}
