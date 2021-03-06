/*
 * NAME = com.vectorsf.springmvc_base.admin.service.AdminUserService.java;
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

package com.vectorsf.springmvc_base.admin.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.vectorsf.springmvc_base.admin.model.User;

/**
 * Class description: -
 * User: Marcelo Rodriguez
 * Date: 02/12/2011
 * 
 * @author Marcelo Rodriguez
 * @version $LastChangedRevision$ 
 *			$Author$
 * 			$Date$
 */

public interface AdminUserService extends UserDetailsService {

	/**
	 * Obtiene todos los usuarios.
	 * @return
	 */
	public List<User> getUsers();
	
	/**
	 * Obtiene un usuario por su id.
	 * @param userId
	 * @return
	 */
	public User getUserById(int userId);
}
