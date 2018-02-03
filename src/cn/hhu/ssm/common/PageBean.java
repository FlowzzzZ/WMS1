package cn.hhu.ssm.common;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Collection;

/**
 * 分页公用bean
 * @author Administrator
 *
 */
public class PageBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 526169898772824466L;

	/**
	 * 当前页码
	 */
	private Integer page = 1;
	
	/**
	 * 页容量
	 */
	private Integer pageSize = 0;
	
	/**
	 * 数据总数量
	 */
	private Integer totalCount = 0;
	
	/**
	 * 总页数
	 */
	private Integer totalPage;
	
	private Collection<?> data;

	public PageBean(){
		
	}
	public PageBean(Integer page , Integer pageSize){
		this.page = page;
		this.pageSize = pageSize;
	}
	
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
		if (totalCount > 0) {
			this.totalPage = totalCount % this.pageSize == 0 ?  totalCount/pageSize : totalCount/pageSize + 1;
		}
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Collection<?> getData() {
		return data;
	}

	public void setData(Collection<?> data) {
		this.data = data;
	}
	
	public void setPageParam(Object o) {
		if (o == null) {
			return;
		}
		try {
			Class<? extends Object> oc = o.getClass();
			Method limitSetter = oc.getMethod("setLimit", new Class[] {Integer.class});
			limitSetter.invoke(o, this.getPageSize());
			Method offsetSetter = oc.getMethod("setOffset", new Class[] {Integer.class});
			offsetSetter.invoke(o, (this.getPage() - 1) * this.getPageSize());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}