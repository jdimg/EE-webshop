package de.java2enterprise.webshop2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ReadListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

public class FotoReadListener implements ReadListener{

	private AsyncContext ac;
	
	public FotoReadListener(AsyncContext ac) {
		this.ac = ac;
	}
	
	@Override
	public void onDataAvailable() {
		final HttpServletRequest request = (HttpServletRequest) ac.getRequest();
		final HttpServletResponse response = (HttpServletResponse) ac.getResponse();
		
		OutputStream os = null;
		InputStream is = null;
		PrintWriter out = null;
		
		try {
			final Part part = request.getPart("foto");
			os = new FileOutputStream(part.getSubmittedFileName());
			is = part.getInputStream();
			out = response.getWriter();
			
			byte[] b = new byte[1024];
			int i = 0;
			while((i = is.read(b)) != -1) {
				os.write(b, 0, i);
			}
			os.flush();
			out.write("true");
			ac.complete();
		} catch (Exception e) {
			out.write("false");
			e.printStackTrace();
		} finally {
			try {
				os.close();
				is.close();
				out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public void onAllDataRead() throws IOException {
		ac.complete();
	}

	@Override
	public void onError(Throwable arg0) {
		arg0.printStackTrace();
		ac.complete();
	}
}
