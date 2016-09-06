/**
 * 
 */
package com.airchina.demo.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dengdeying
 *
 */
@RestController
public class HelloController {
	@RequestMapping("/")
	public String index() {
		return "edited on github.com";
	}
}
