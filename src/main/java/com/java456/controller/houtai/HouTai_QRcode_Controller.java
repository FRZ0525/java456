package com.java456.controller.houtai;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/houtai/qrcode")
public class HouTai_QRcode_Controller {

	/**
	 *
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/manage")
	public ModelAndView manage() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("title", "二维码生成");
		mav.setViewName("/admin/page/qrcode/qrcode_manage");
		return mav;
	}





}
