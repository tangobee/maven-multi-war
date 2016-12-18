package org.example.web;

import org.example.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ComponentScan(basePackages = {"org.example.service", "org.example.service"})
public class FooController
{
  @Autowired
  private FooService service;

  @RequestMapping("/")
  @ResponseBody
  public String home()
  {
	  
    return service.greet();
  }
}
