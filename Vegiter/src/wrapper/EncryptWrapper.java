package wrapper;

import java.nio.charset.Charset;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class EncryptWrapper extends HttpServletRequestWrapper{

	public EncryptWrapper(HttpServletRequest request) {
		super(request);
	}
	@Override
	public String getParameter(String name) {
		
		String value = "";
		
		if(name != null && (name.equals("userPwd")|| name.equals("userPwd1") || name.equals("newPwd"))) {
			// 암호화 ( 로그인 시/ 회원가입 시/ 비밀번호 변경시)
			value = getSha512(super.getParameter(name));
			
		}else {
			value = super.getParameter(name);
		}
		return value;
	}
	
	public String getSha512(String userPwd) {
		String encPwd = null; // 암호화된 비번
		
		MessageDigest md = null; // 암호화 객체
		
		try {
			md = MessageDigest.getInstance("SHA-512");
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		// byte[]로 쪼개기
		byte[] bytes = userPwd.getBytes(Charset.forName("UTF-8"));
		md.update(bytes);
		
		encPwd = Base64.getEncoder().encodeToString(md.digest());
		
		return encPwd;
	}
}
