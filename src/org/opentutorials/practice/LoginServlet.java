package org.opentutorials.practice;

public class LoginServlet extends HttpServlet {
	public void service() {
		System.out.println("로그인합니다.");
	}
}

class FileDownloadServlet extends HttpServlet {
	public void service() {
		System.out.println("파일 다운로드합니다.");
	}
}
