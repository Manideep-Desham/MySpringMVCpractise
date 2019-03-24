package org.cloudme.sample.aes.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cloudme.sample.aes.AesUtil;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String passphrase = request.getParameter("passphrase");
        int iterationCount = Integer.parseInt(request.getParameter("iterationCount"));
        int keySize = Integer.parseInt(request.getParameter("keySize"));
        String salt = request.getParameter("salt");
        String ciphertext = request.getParameter("ciphertext");
        String iv = request.getParameter("iv");
        
        AesUtil aesUtil = new AesUtil(keySize, iterationCount);
        String plaintext = aesUtil.decrypt(salt, iv, passphrase, ciphertext);
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().print(plaintext);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
