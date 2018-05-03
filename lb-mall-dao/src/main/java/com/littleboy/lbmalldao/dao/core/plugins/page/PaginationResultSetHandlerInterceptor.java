package com.littleboy.lbmalldao.dao.core.plugins.page;

import org.apache.ibatis.executor.resultset.DefaultResultSetHandler;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.RowBounds;

import java.sql.Statement;
import java.util.Properties;

/**
 * @author lwp
 **/
@Intercepts({ @Signature(type = ResultSetHandler.class, method = "handleResultSets", args = { Statement.class }) })
public class PaginationResultSetHandlerInterceptor implements Interceptor {

	public Object intercept(Invocation invocation) throws Throwable {
		
		DefaultResultSetHandler resultSetHandler = (DefaultResultSetHandler) invocation.getTarget();
		MetaObject metaStatementHandler =  SystemMetaObject.forObject(
				resultSetHandler);
		RowBounds rowBounds = (RowBounds) metaStatementHandler.getValue("rowBounds");

		Object result = invocation.proceed();

		if (rowBounds instanceof Page) {
			metaStatementHandler.setValue("rowBounds.result", result);
		}
		return result;
	}

	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	public void setProperties(Properties properties) {
	}

}
