/*
 * NAME = com.vectorsf.springmvc_base.admin.controller.AdminHomeController.java;
 *
 * COPYRIGHT (c) 2011 Vector Software Factory S.L. Reservados todos los derechos.
 * Este programa es material confidencial propiedad
 * de Vector Software Factory S.L. Se prohíbe la divulgación o revelación
 * de su contenido sin el permiso previo y por escrito del propietario.
 * COPYRIGHT (c) 2011 Vector Software Factory S.L. All rights reserved.
 * This document (Program, manual, etc.) consists of confidential information,
 * containing trade secrets that are property of Vector Software Factory S.L.
 * Its content may not be used or disclosed without prior written permission
 * of the owner.
 */

package com.vectorsf.springmvc_base.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class description: -
 * User: Marcelo Rodriguez
 * Date: 22/11/2011
 * 
 * @author Marcelo Rodriguez
 * @version $LastChangedRevision$ 
 *			$Author$
 * 			$Date$
 */

@Controller
public class AdminHomeController {

	@RequestMapping(value="/admin/home.html")
	public String home(Model model) {
		return "admin.home";
	}
}
