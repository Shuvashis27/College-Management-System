package com.mpc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mpc.dao.UserDao;

@WebServlet(name = "ArticleController", urlPatterns = { "/submit-article"})
public class ArticleController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fname = request.getParameter("fname").trim();
		String mob = request.getParameter("mob").trim();
		String email = request.getParameter("email").trim();
		String regno = request.getParameter("regno").trim();
		String sem = request.getParameter("sem").trim();
		String branch = request.getParameter("branch").trim();
		String article = request.getParameter("article").trim();
		String desc = request.getParameter("desc").trim();
		String status = UserDao.submitArticle(fname, mob, email, regno, sem, branch, article, desc);
		request.setAttribute("status", status);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.html");
		dispatcher.forward(request, response);
	}
}
