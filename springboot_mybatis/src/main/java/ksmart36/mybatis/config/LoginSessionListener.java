package ksmart36.mybatis.config;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ksmart36.mybatis.mapper.MemberMapper;

@WebListener
@Component
public class LoginSessionListener implements HttpSessionListener{
	@Autowired private MemberMapper memberMapper;
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		HttpSessionListener.super.sessionCreated(se);
		System.out.println("로그인 성공");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSessionListener.super.sessionDestroyed(se);
		System.out.println("로그아웃");
	}
		

}
