package org.hyperledger.pro.webapi.controller;

//import org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi.sm3WithSM2;
//import com.luyh.projectv1.model.Member; 
//import com.luyh.projectv1.service.IMemberService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Controller {

	@RequestMapping("/test")
    String test() throws Exception{
    	String s = "test";
    	System.out.println(s);
    	
    	return s;
    }



}
