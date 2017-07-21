package cn.caoler.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWiring<M extends BaseWiring<M>> extends Model<M> implements IBean {

	public void setStart(java.lang.String start) {
		set("start", start);
	}

	public java.lang.String getStart() {
		return get("start");
	}

	public void setDestination(java.lang.String destination) {
		set("destination", destination);
	}

	public java.lang.String getDestination() {
		return get("destination");
	}

	public void setTime(java.util.Date time) {
		set("time", time);
	}

	public java.util.Date getTime() {
		return get("time");
	}

	public void setStime(java.lang.Integer stime) {
		set("stime", stime);
	}

	public java.lang.Integer getStime() {
		return get("stime");
	}

	public void setClass(java.lang.String _class) {
		set("class", _class);
	}

	public java.lang.String getClass() {
		return get("class");
	}

}
