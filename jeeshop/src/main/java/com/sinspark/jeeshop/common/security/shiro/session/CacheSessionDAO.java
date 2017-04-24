package com.sinspark.jeeshop.common.security.shiro.session;

import java.io.Serializable;
import java.util.Collection;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 系统安全认证实现类
 * @author sinspark
 * @version 2017-4-24
 */
public class CacheSessionDAO extends EnterpriseCacheSessionDAO implements SessionDAO {
	
	private Logger logger = LoggerFactory.getLogger(CacheSessionDAO.class);
	
	@Override
	protected void doUpdate(Session session) {
		// TODO Auto-generated method stub
		super.doUpdate(session);
	}
	
	@Override
	protected void doDelete(Session session) {
		// TODO Auto-generated method stub
		super.doDelete(session);
	}
	
	@Override
	protected Serializable doCreate(Session session) {
		// TODO Auto-generated method stub
		return super.doCreate(session);
	}
	
	@Override
	protected Session doReadSession(Serializable sessionId) {
		// TODO Auto-generated method stub
		return super.doReadSession(sessionId);
	}
	
	@Override
	public Session readSession(Serializable sessionId)
			throws UnknownSessionException {
		// TODO Auto-generated method stub
		return super.readSession(sessionId);
	}

	/**
	 * 获取活动会话
	 * @param includeLeave 是否包括离线（最后访问时间大于3分钟为离线会话）
	 * @return
	 */
	@Override
	public Collection<Session> getActiveSessions(boolean includeLeave) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 获取活动会话
	 * @param includeLeave 是否包括离线（最后访问时间大于3分钟为离线会话）
	 * @param principal 根据登录者对象获取活动会话
	 * @param filterSession 不为空，则过滤掉（不包含）这个会话。
	 * @return
	 */
	@Override
	public Collection<Session> getActiveSessions(boolean includeLeave,
			Object principal, Session filterSession) {
		// TODO Auto-generated method stub
		return null;
	}

}
