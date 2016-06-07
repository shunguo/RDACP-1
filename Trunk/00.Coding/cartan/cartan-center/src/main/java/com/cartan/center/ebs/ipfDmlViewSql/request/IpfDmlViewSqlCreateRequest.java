/**
 * @author 刘溪滨 (13720880048@163.com)
 * @version 1.0 @Date: 2015-11-18 上午9:10
 */
package com.cartan.center.ebs.ipfDmlViewSql.request;

import java.util.ArrayList;

import com.rop.AbstractRopRequest;
import com.rop.annotation.IgnoreSign;
import org.springframework.beans.BeanUtils;
import com.cartan.core.ipfDmlViewSql.domain.IpfDmlViewSql;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

public class IpfDmlViewSqlCreateRequest extends AbstractRopRequest {
	@Size(min = 0, max = 50)
	private String id;//主键
	@Size(min = 0, max = 50)
	private String ipfDmlViewId;//视图
	@Size(min = 0, max = 50)
	private String dbmsType;//数据库类型
	@Size(min = 0, max = 2000)
	private String sqlStatement;//SQL表达式
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}	
	public String getIpfDmlViewId() {
		return this.ipfDmlViewId;
	}
	
	public void setIpfDmlViewId(String ipfDmlViewId) {
		this.ipfDmlViewId = ipfDmlViewId;
	}
	public String getDbmsType() {
		return this.dbmsType;
	}
	
	public void setDbmsType(String dbmsType) {
		this.dbmsType = dbmsType;
	}
	public String getSqlStatement() {
		return this.sqlStatement;
	}
	
	public void setSqlStatement(String sqlStatement) {
		this.sqlStatement = sqlStatement;
	}
	
	public IpfDmlViewSqlCreateRequest(){}
	
	public IpfDmlViewSqlCreateRequest(IpfDmlViewSql ipfDmlViewSql){
		BeanUtils.copyProperties(ipfDmlViewSql,this);
	}
	/**
	 * 拷贝属性值到制定BO
	 */
	public void copyValueTo(IpfDmlViewSql bo){
		BeanUtils.copyProperties(this,bo);
	}
	public IpfDmlViewSql cloneBO(){
		IpfDmlViewSql bo = new IpfDmlViewSql();
		this.copyValueTo(bo);
		return bo;
	}
	
	public static List<IpfDmlViewSql> cloneBOList(List<IpfDmlViewSqlCreateRequest> vos){
		if(vos==null||vos.isEmpty())return new ArrayList<IpfDmlViewSql>(0);
		List<IpfDmlViewSql> result = new ArrayList<IpfDmlViewSql>(vos.size());
		for(IpfDmlViewSqlCreateRequest vo: vos){
			IpfDmlViewSql bo = vo.cloneBO();
			result.add(bo);
		}
		return result;
	}

}
